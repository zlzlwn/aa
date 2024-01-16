package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import com.javalec.function.Calculation;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main2 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JButton btnAdd;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnDiv;
	private JTextField tfSet1;
	private JTextField tfSet2;
	private JTextField tfResult;
	private JLabel lbloperation;
	private JLabel lblNewLabel_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 window = new Main2();
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
	public Main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 255));
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setTitle("두개의 숫자 가감승제");
		frame.setBounds(100, 100, 367, 188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getTfSet1());
		frame.getContentPane().add(getTfSet2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getLbloperation());
		frame.getContentPane().add(getLblNewLabel_2_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1:");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel.setBounds(12, 23, 50, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2:");
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_1.setBounds(12, 57, 50, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자 외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						// 숫자가 입력 됨
					}else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfNum1.setText("");
					}
				}
			});
			tfNum1.setFont(new Font("굴림", Font.BOLD, 12));
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(71, 20, 72, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setFont(new Font("굴림", Font.BOLD, 12));
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(71, 54, 72, 21);
		}
		return tfNum2;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation("Add");
				}
			});
			btnAdd.setFont(new Font("굴림", Font.BOLD, 12));
			btnAdd.setForeground(new Color(255, 0, 128));
			btnAdd.setBounds(213, 20, 50, 21);
		}
		return btnAdd;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation("Mul");
				}
			});
			btnMul.setForeground(new Color(0, 0, 255));
			btnMul.setFont(new Font("굴림", Font.BOLD, 12));
			btnMul.setBounds(213, 53, 50, 21);
		}
		return btnMul;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation("Sub");
				}
			});
			btnSub.setForeground(new Color(255, 0, 128));
			btnSub.setFont(new Font("굴림", Font.BOLD, 12));
			btnSub.setBounds(279, 20, 50, 21);
		}
		return btnSub;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation("Div");
				}
			});
			btnDiv.setForeground(new Color(0, 0, 255));
			btnDiv.setFont(new Font("굴림", Font.BOLD, 12));
			btnDiv.setBounds(279, 54, 50, 21);
		}
		return btnDiv;
	}
	private JTextField getTfSet1() {
		if (tfSet1 == null) {
			tfSet1 = new JTextField();
			tfSet1.setFont(new Font("굴림", Font.BOLD, 12));
			tfSet1.setEditable(false);
			tfSet1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSet1.setColumns(10);
			tfSet1.setBounds(12, 104, 72, 21);
		}
		return tfSet1;
	}
	private JTextField getTfSet2() {
		if (tfSet2 == null) {
			tfSet2 = new JTextField();
			tfSet2.setFont(new Font("굴림", Font.BOLD, 12));
			tfSet2.setForeground(new Color(0, 0, 0));
			tfSet2.setEditable(false);
			tfSet2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSet2.setColumns(10);
			tfSet2.setBounds(128, 104, 72, 21);
		}
		return tfSet2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
			tfResult.setForeground(new Color(255, 0, 0));
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(246, 104, 72, 21);
		}
		return tfResult;
	}
	private JLabel getLbloperation() {
		if (lbloperation == null) {
			lbloperation = new JLabel("");
			lbloperation.setBounds(104, 107, 15, 15);
		}
		return lbloperation;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("=");
			lblNewLabel_2_1.setBounds(219, 107, 15, 15);
		}
		return lblNewLabel_2_1;
	}
	
	// ---------- Function
	private void calculation(String operation) {
		
		Calculation calculation = new Calculation(tfNum1.getText(), tfNum2.getText());
		tfSet1.setText(tfNum1.getText());
		tfSet2.setText(tfNum2.getText());
		
		switch (operation){
		case "Add" :
			lbloperation.setText("+");
			tfResult.setText(calculation.add1());
			break;
		case "Sub" :
			lbloperation.setText("-");
			tfResult.setText(calculation.sub1());
			break;
		case "Mul" :
			lbloperation.setText("*");
			tfResult.setText(calculation.mul1());
			break;
		case "Div" :
			lbloperation.setText("/");
			tfResult.setText(calculation.div1());
			break;
		default:
			break;
		}
	}

	




}
// End
