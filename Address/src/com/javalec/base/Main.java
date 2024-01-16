package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.javalec.function.Dao;
import com.javalec.function.Dto;
import com.javalec.function.ShareVar;

import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JRadioButton rbInsert;
	private JRadioButton rbUpdate;
	private JRadioButton rbDelete;
	private JRadioButton rbQuery;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable innerTable;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JTextField tfName;
	private JLabel lblNewLabel_1;
	private JTextField tfTelno;
	private JLabel lblNewLabel_2;
	private JTextField tfAdress;
	private JLabel lblNewLabel_3;
	private JTextField tfEmail;
	private JLabel lblNewLabel_4;
	private JTextField tfRelation;
	private JLabel lblNewLabel_5;
	private JButton btnOk;

	// table
	private final DefaultTableModel outerTable = new DefaultTableModel();
	private JLabel lblImage;
	private JButton btnFilePath;
	private JTextField tfFilePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tableInit();
				searchAction();
				screenPartitopn();

			}
		});
		frame.setTitle("주소록");
		frame.setBounds(100, 100, 377, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getRbInsert());
		frame.getContentPane().add(getRbUpdate());
		frame.getContentPane().add(getRbDelete());
		frame.getContentPane().add(getRbQuery());
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfAdress());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getBtnOk());
		frame.getContentPane().add(getLblImage());
		frame.getContentPane().add(getBtnFilePath());
		frame.getContentPane().add(getTfFilePath());
	}

	private JRadioButton getRbInsert() {
		if (rbInsert == null) {
			rbInsert = new JRadioButton("입력");
			rbInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartitopn();
				}
			});
			buttonGroup.add(rbInsert);
			rbInsert.setBounds(20, 18, 63, 23);
		}
		return rbInsert;
	}

	private JRadioButton getRbUpdate() {
		if (rbUpdate == null) {
			rbUpdate = new JRadioButton("수정");
			rbUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartitopn();
				}
			});
			buttonGroup.add(rbUpdate);
			rbUpdate.setBounds(95, 18, 63, 23);
		}
		return rbUpdate;
	}

	private JRadioButton getRbDelete() {
		if (rbDelete == null) {
			rbDelete = new JRadioButton("삭제");
			rbDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartitopn();
				}
			});
			buttonGroup.add(rbDelete);
			rbDelete.setBounds(170, 18, 63, 23);
		}
		return rbDelete;
	}

	private JRadioButton getRbQuery() {
		if (rbQuery == null) {
			rbQuery = new JRadioButton("검색");
			rbQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartitopn();
				}
			});
			buttonGroup.add(rbQuery);
			rbQuery.setSelected(true);
			rbQuery.setBounds(249, 18, 63, 23);
		}
		return rbQuery;
	}

	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] { "이름", "주소", "관계" }));
			cbSelection.setBounds(30, 53, 83, 27);
		}
		return cbSelection;
	}

	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(121, 53, 150, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}

	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setBounds(272, 53, 75, 29);
		}
		return btnQuery;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(40, 92, 303, 94);
			scrollPane.setViewportView(getInnerTable());
		}
		return scrollPane;
	}

	private JTable getInnerTable() {
		if (innerTable == null) {
			innerTable = new JTable();
			innerTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton()==1) {
						tableClick();
					}
				}
			});
			innerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			innerTable.setModel(outerTable); // 한세트로 움직이게

		}
		return innerTable;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("seq No:");
			lblNewLabel.setBounds(30, 198, 61, 16);
		}
		return lblNewLabel;
	}

	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSeqno.setBounds(103, 193, 63, 26);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(103, 226, 99, 26);
		}
		return tfName;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(30, 231, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(103, 259, 168, 26);
		}
		return tfTelno;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(30, 264, 61, 16);
		}
		return lblNewLabel_2;
	}

	private JTextField getTfAdress() {
		if (tfAdress == null) {
			tfAdress = new JTextField();
			tfAdress.setColumns(10);
			tfAdress.setBounds(103, 292, 240, 26);
		}
		return tfAdress;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(30, 297, 61, 16);
		}
		return lblNewLabel_3;
	}

	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(103, 328, 240, 26);
		}
		return tfEmail;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(30, 333, 61, 16);
		}
		return lblNewLabel_4;
	}

	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(103, 366, 240, 26);
		}
		return tfRelation;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setBounds(30, 371, 61, 16);
		}
		return lblNewLabel_5;
	}

	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("Ok");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				actionPartition();
				}
			});
			btnOk.setBounds(230, 198, 117, 29);
		}
		return btnOk;
	}

//----------Function
	// table초기화 하
	private void tableInit() {
		// table column명 정하
		outerTable.addColumn("seq");
		outerTable.addColumn("이름");
		outerTable.addColumn("전화번호");
		outerTable.addColumn("관계");
		outerTable.setColumnCount(4);
		// table column 크기 정하
		int colNo = 0;
		TableColumn col = innerTable.getColumnModel().getColumn(colNo);
		int width = 40;
		col.setPreferredWidth(width);

		colNo = 1;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 100;
		col.setPreferredWidth(width);

		colNo = 2;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 100;
		col.setPreferredWidth(width);

		colNo = 3;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 200;
		col.setPreferredWidth(width);

		innerTable.setAutoResizeMode(innerTable.AUTO_RESIZE_OFF); // 사이즈 고정이라서 스크롤바가 나온다

		int i = outerTable.getRowCount();
		for (int j = 1; j <= i; j++) {
			outerTable.removeRow(0);

		}

	}

	// 검색
	private void searchAction() {
		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.selectList();

		int listCount = dtoList.size();
		for (int i = 0; i < listCount; i++) {
			String temp = Integer.toString(dtoList.get(i).getSeqno()); // 어레이 리스트에서시퀀스를 가져온다 그래서 get이 두
			String[] qTxt = { temp, dtoList.get(i).getName(), dtoList.get(i).getTelno(), dtoList.get(i).getRelation() };
			outerTable.addRow(qTxt);
		}
	}

	// edit 결
	private void screenPartitopn() {
		// 검색일 경우
		if (rbQuery.isSelected() == true) {
			btnOk.setVisible(false);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAdress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
		// 입력, 수정일 경우
		if (rbInsert.isSelected() == true || rbUpdate.isSelected() == true) {
			btnOk.setVisible(true);
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAdress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
		}
		// 삭제일 경우
		if (rbDelete.isSelected() == true) {
			btnOk.setVisible(true);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAdress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
	}
	//table에서 row를 클릭했을경우
	private void tableClick() {
		int i = innerTable.getSelectedRow();
		String tkSeqence = (String)innerTable.getValueAt(i, 0);
		int wkSequence = Integer.parseInt(tkSeqence);
		
		Dao dao =new Dao(wkSequence);
		Dto dto = dao.tableClick();
		
		tfSeqno.setText(Integer.toString(dto.getSeqno()));
		tfName.setText(dto.getName());
		tfTelno.setText(dto.getTelno());
		tfAdress.setText(dto.getAddress());
		tfEmail.setText(dto.getEmail());
		tfRelation.setText(dto.getRelation());
		
		//이미지 처리 : filename이틀려야 보여주기가 가능
		String filePath = Integer.toString(ShareVar.filename);
		tfFilePath.setText(filePath);
		
		System.out.println(filePath);
		
		lblImage.setIcon(new ImageIcon(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		File file = new File(filePath);
		file.delete();
		
	}
	
	private void actionPartition() {
		//검색일경우
		if(rbQuery.isSelected() ==true) {
			screenPartitopn();
		}
		//입력일경우
		if(rbInsert.isSelected() ==true) {
			int i_chk = insertFieldCheck();
			if(i_chk==0) {
				insertAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else {
			JOptionPane.showMessageDialog(null, "데이터를 확인해주세요.");
			}
			screenPartitopn();
		}
		//수정일경우
		if(rbUpdate.isSelected() ==true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				updateAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else {
			JOptionPane.showMessageDialog(null, "데이터를 확인해주세요.");
			}
			screenPartitopn();
		}
		//삭제일경우
		if(rbDelete.isSelected() ==true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				deleteAction();
			
				tableInit();
				searchAction();
				clearColumn();
				
			}
			screenPartitopn();
		}
	}
	//text field 에 글자가 안들어갔을 경 
	private int insertFieldCheck() {
		int i =0;
		if(tfName.getText().trim().length()==0) {
			i++;
		tfName.requestFocus();
			
		}if(tfTelno.getText().trim().length()==0) {
			i++;
		tfTelno.requestFocus();
			
		}if(tfAdress.getText().trim().length()==0) {
			i++;
		tfAdress.requestFocus();
			
		}if(tfEmail.getText().trim().length()==0) {
			i++;
		tfEmail.requestFocus();
			
		}if(tfRelation.getText().trim().length()==0) {
			i++;
		tfRelation.requestFocus();
			
		}
		return i;
	}
	
	private void clearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAdress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
		
	}
	
	private void insertAction() {
		String name =tfName.getText().trim();
		String telno =tfTelno.getText().trim();
		String address =tfAdress.getText().trim();
		String email =tfEmail.getText().trim();
		String ralation =tfRelation.getText().trim();
		
		FileInputStream input =null;
		
		File file = new File(tfFilePath.getText());
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		Dao dao = new Dao(name, telno, address, email, ralation,input);
		boolean result = dao.insertAction();
		if(result==true) {
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 입력되었습니다");
		}else {
			JOptionPane.showMessageDialog(null, "입력중 문제가 발생했습니다");
			
		}
		
	}
	
	private void updateAction() {
		int seqno =Integer.parseInt(tfSeqno.getText());
		String name =tfName.getText().trim();
		String telno =tfTelno.getText().trim();
		String address =tfAdress.getText().trim();
		String email =tfEmail.getText().trim();
		String ralation =tfRelation.getText().trim();
		
		FileInputStream input =null;
		File file = new File(tfFilePath.getText());
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		Dao dao = new Dao(seqno, name, telno, address, email, ralation,input);
		boolean result = dao.updateAction();
		if(result==true) {
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 입력되었습니다");
		}else {
			JOptionPane.showMessageDialog(null, "입력중 문제가 발생했습니다");
			
		}
		
	}
	
	private void deleteAction() {
		int seqno =Integer.parseInt(tfSeqno.getText());
		String name =tfName.getText().trim();
		String telno =tfTelno.getText().trim();
		String address =tfAdress.getText().trim();
		String email =tfEmail.getText().trim();
		String ralation =tfRelation.getText().trim();
		
		Dao dao = new Dao(seqno);
		boolean result = dao.deleteAction();
		if(result==true) {
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 삭되었습니다");
		}
		
	}
	
	
	//--------------------------------이미지 윈도
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(30, 402, 150, 82);
		}
		return lblImage;
	}
	private JButton getBtnFilePath() {
		if (btnFilePath == null) {
			btnFilePath = new JButton("file경로");
			btnFilePath.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					filePath();
				}
			});
			btnFilePath.setBounds(192, 417, 117, 29);
		}
		return btnFilePath;
	}
	private JTextField getTfFilePath() {
		if (tfFilePath == null) {
			tfFilePath = new JTextField();
			tfFilePath.setBounds(192, 458, 130, 26);
			tfFilePath.setColumns(10);
		}
		return tfFilePath;
	}
	private void filePath() {
		JFileChooser chooser =new JFileChooser();
		FileNameExtensionFilter filter =new FileNameExtensionFilter("jpg","png","bmp");
		chooser.setFileFilter(filter);
		
		int ret =chooser.showOpenDialog(null);
		if(ret !=JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을선택하지 않았습니다.");
			return;
		}
		String filePath =chooser.getSelectedFile().getPath();
		tfFilePath.setText(filePath);
		lblImage.setIcon(new ImageIcon(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	
	
	
}// end
