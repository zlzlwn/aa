package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserQuery {

	private JFrame frame;
	private JTextField tfSelection;
	private JComboBox cbSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable inner_table;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JLabel lblNewLabel_1;
	private JTextField tfAddress;
	private JLabel lblNewLabel_2;
	private JTextField tfEmail;
	private JLabel lblNewLabel_3;
	private JTextField tfRelation;
	private JLabel lblNewLabel_4;
	private JTextField tfSequenceNo;
	private JLabel lblNewLabel_5;

	// ----Database&Table 정의----------- outer & inner table
	private final DefaultTableModel outer_Table = new DefaultTableModel();
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";//
//	서버       스키마(db) 이름        다 붙어있어야 한다(암호화때문)				secure	주소,이름은 바뀔수 있다.
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	private JButton btnUpdate;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
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
			}
		});
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 450, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfSequenceNo());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getBtnUpdate());
		frame.getContentPane().add(getBtnDelete());
	}

	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(127, 18, 186, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}

	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] { "이름", "주소", "관계" }));
			cbSelection.setBounds(23, 19, 92, 27);
		}
		return cbSelection;
	}

	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnQuery.setBounds(335, 18, 75, 29);
		}
		return btnQuery;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 65, 372, 73);
			scrollPane.setViewportView(getInner_table());
		}
		return scrollPane;
	}

	private JTable getInner_table() {
		if (inner_table == null) {
			inner_table = new JTable();
			inner_table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1) {
						tableClick();
					}
				}
			});
			inner_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			// ******************************************
			inner_table.setModel(outer_Table);// ******************************************
			// ******************************************
		}
		return inner_table;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("이름");
			lblNewLabel.setBounds(33, 205, 92, 16);
		}
		return lblNewLabel;
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(146, 200, 67, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}

	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(146, 233, 130, 26);
		}
		return tfTelNo;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호");
			lblNewLabel_1.setBounds(33, 238, 92, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(146, 263, 264, 26);
		}
		return tfAddress;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소");
			lblNewLabel_2.setBounds(33, 268, 92, 16);
		}
		return lblNewLabel_2;
	}

	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(146, 296, 264, 26);
		}
		return tfEmail;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편");
			lblNewLabel_3.setBounds(33, 301, 92, 16);
		}
		return lblNewLabel_3;
	}

	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(146, 334, 264, 26);
		}
		return tfRelation;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("관계");
			lblNewLabel_4.setBounds(33, 339, 92, 16);
		}
		return lblNewLabel_4;
	}

	private JTextField getTfSequenceNo() {
		if (tfSequenceNo == null) {
			tfSequenceNo = new JTextField();
			tfSequenceNo.setEditable(false);
			tfSequenceNo.setColumns(10);
			tfSequenceNo.setBounds(151, 167, 62, 26);
		}
		return tfSequenceNo;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("sequence No");
			lblNewLabel_5.setBounds(38, 172, 92, 16);
		}
		return lblNewLabel_5;
	}

	// ----Function
	// Table의 컬럼을 정의하고 Data내용을 초기화 시킨다.
	private void tableInit() {
		outer_Table.addColumn("순서");
		outer_Table.addColumn("이름");
		outer_Table.addColumn("전화번호");
		outer_Table.addColumn("관계");
		outer_Table.setColumnCount(4);

		// 순서 컬럼의 크기정하기
		int colNo = 0;
		TableColumn col = inner_table.getColumnModel().getColumn(colNo);// ???????????????
		int width = 50;
		col.setPreferredWidth(width);

		// 이름
		colNo = 1;
		col = inner_table.getColumnModel().getColumn(colNo);// ???????????????
		width = 100;
		col.setPreferredWidth(width);

		// 전화번호
		colNo = 2;
		col = inner_table.getColumnModel().getColumn(colNo);// ???????????????
		width = 200;
		col.setPreferredWidth(width);

		// 관계
		colNo = 3;
		col = inner_table.getColumnModel().getColumn(colNo);// ???????????????
		width = 200;
		col.setPreferredWidth(width);

		// 초기화 시키기 0을넣는이유는 삭제하면 데이터가 다시0부터 시작해
		int i = outer_Table.getRowCount();
		for (int j = 0; j < i; j++) {
			outer_Table.removeRow(0);
		}
		inner_table.setAutoResizeMode(inner_table.AUTO_RESIZE_OFF); // 비율이 아니라 숫자로 사용해서 스크롤이 생김
	}
	//
	private void searchAction() {
		String query = "Select seqno, name, telno, relation from userinfo";
		try {
//			유비 관우 장비가inner table(한 셀이라고 생각하면 됨)셀의 집합     outer table 외형적인 부분 데이터 초기값 가져오 줄과 컬럼의 집합
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 연결한때 어느 id pw로할꺼
			Statement stmt_mysql = conn_mysql.createStatement(); // db에서 데이터ㄱ가져오는게 statement

			ResultSet rs = stmt_mysql.executeQuery(query);//
			while (rs.next()) { // next??????

//				rs.getInt(1); // 스트링인지 인트인지 확인
//				rs.getString(2);
//				rs.getString(3);
//				rs.getString(4);
				String[] qTxt = { Integer.toString(rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4) };// 배열이
																														// 밑에줄에
																														// ()안에
																														// 들어가면
				outer_Table.addRow(qTxt);

//				tfSequenceNo.setText(Integer.toString(rs.getInt(1)));  
//				tfName.setText(rs.getString(2));
//				tfTelNo.setText(rs.getString(3));
//				tfRelation.setText(rs.getString(4));
			}

			conn_mysql.close(); // 접속자가기본 5명이라 바로끊어줘야함

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 테이블의 값설정해
	private void tableClick() {
		int i = inner_table.getSelectedRow();
		String seqno = (String) inner_table.getValueAt(i, 0);// 받아온 값이오브젝트여서 스트링으로 바꾸고 인트로 바꾸는과정 거쳐야 한

		String query1 = "Select seqno, name, telno,address,email, relation from userinfo ";
		String query2 = "where seqno=" + Integer.parseInt(seqno);// 스트링을 인트로 바꿈

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 연결한때 어느 id pw로할꺼
			Statement stmt_mysql = conn_mysql.createStatement(); // db에서 데이터ㄱ가져오는게 statement

			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);//
			while (rs.next()) {
				tfSequenceNo.setText(Integer.toString(rs.getInt(1)));
				tfName.setText(rs.getString(2));
				tfTelNo.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));

			}

			conn_mysql.close(); // 접속자가기본 5명이라 바로끊어줘야함

		} catch (Exception e) {
			e.printStackTrace();
		}

//----------------------------------오류부분------------------------------------
	}

	private void conditionQuery() {			//검색버튼 눌렀을때 액션
		int i = cbSelection.getSelectedIndex();
		String conditionQueryName = "";

		switch (i) {
		case 0:
			conditionQueryName = "name";
			break;
		case 1:
			conditionQueryName = "adress";
			break;
		case 2:
			conditionQueryName = "relation";
			break;
		default:
			break;

		}
		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryName);
	}

private void clearColumn() {
	tfSequenceNo.setText("");
	tfName.setText("");
	tfTelNo.setText("");
	tfAddress.setText("");
	tfEmail.setText("");
	tfRelation.setText("");
	
	
	
}

private void conditionQueryAction(String conditionQueryName) {
	
	
	
	String query1 = "Select seqno, name, telno, relation from userinfo where " + conditionQueryName;
	String query2 = " like '%" +tfSelection.getText() + "%'";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 연결한때 어느 id pw로할꺼
		Statement stmt_mysql = conn_mysql.createStatement(); // db에서 데이터ㄱ가져오는게 statement

		ResultSet rs = stmt_mysql.executeQuery(query1+ query2);//
		while (rs.next()) { // next??????

			String[] qTxt = { Integer.toString(rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4) };// 배열이
																													// 밑에줄에
																													// ()안에
																													// 들어가면
			outer_Table.addRow(qTxt);

		}

		conn_mysql.close(); // 접속자가기본 5명이라 바로끊어줘야함

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			btnUpdate.setBounds(146, 387, 117, 29);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
			btnDelete.setBounds(289, 387, 117, 29);
		}
		return btnDelete;
	}


	private void update() {
		updateAction();
		tableInit();
		clearColumn();
		searchAction();
		
	}
	
	private void updateAction() {
		PreparedStatement ps =null;					//PreparedStatement 자바를 소켓프로그렘이로 바꿔주는 throw 에러를 던다 (try catch 있으면 없어도 됨)
		try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql =DriverManager.getConnection(url_mysql,id_mysql, pw_mysql);	//연결한때 어느 id pw로할꺼
				Statement stmt_mysql =conn_mysql.createStatement();																			//db에서 데이터ㄱ가져오는게 statement
				
				String query = "update userinfo set name=?, telno=?, address=?, email=?, relation=? ";		//띄어쓰기 이유 다시 물어보
				String query1 = "where seqno=?";		//prepare statement 보안때문에 ?사
				
				ps = conn_mysql.prepareStatement(query + query1);
				ps.setString(1, tfName.getText().trim());
				ps.setString(2, tfTelNo.getText().trim());
				ps.setString(3, tfAddress.getText().trim());
				ps.setString(4, tfEmail.getText().trim());
				ps.setString(5, tfRelation.getText().trim());
				ps.setInt(6, Integer.parseInt(tfSequenceNo.getText()));
				
				ps.executeUpdate();
				
				conn_mysql.close();   				//접속자가기본 5명이라 바로끊어줘야함
				
				JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 수정 되었습니다.");
				
				
			
			
			
			
		}catch (Exception e) {
			 e.printStackTrace();
		}
		
		
	}
	
	private void delete() {
		deleteAction();
		tableInit();
		clearColumn();
		searchAction();
		
	}
	
	
	
	
	
	
	private void deleteAction() {
		PreparedStatement ps =null;					//PreparedStatement 자바를 소켓프로그렘이로 바꿔주는 throw 에러를 던다 (try catch 있으면 없어도 됨)
		try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql =DriverManager.getConnection(url_mysql,id_mysql, pw_mysql);	//연결한때 어느 id pw로할꺼
				Statement stmt_mysql =conn_mysql.createStatement();																			//db에서 데이터ㄱ가져오는게 statement
				
				String query = "delete from userinfo ";		//띄어쓰기 이유 다시 물어보
				String query1 = "where seqno=?";		//prepare statement 보안때문에 ?사
				
				ps = conn_mysql.prepareStatement(query + query1);
//				ps.setString(1, tfName.getText().trim());
//				ps.setString(2, tfTelNo.getText().trim());
//				ps.setString(3, tfAddress.getText().trim());
//				ps.setString(4, tfEmail.getText().trim());
//				ps.setString(5, tfRelation.getText().trim());
				ps.setInt(1, Integer.parseInt(tfSequenceNo.getText()));
				
				ps.executeUpdate();
				
				conn_mysql.close();   				//접속자가기본 5명이라 바로끊어줘야함
				
				JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 삭제 되었습니다.");
				
				
			
			
			
			
		}catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
	


}// end
