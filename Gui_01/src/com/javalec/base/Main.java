package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.Addition;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmGuitest;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JLabel lblNewLabel_1_1;
	private JTextField tfResult;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGuitest.setVisible(true);
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
		frmGuitest = new JFrame();
		frmGuitest.setTitle("GUI_test01");
		frmGuitest.setBounds(100, 100, 382, 182);
		frmGuitest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuitest.getContentPane().setLayout(null);
		frmGuitest.getContentPane().add(getLblNewLabel());
		frmGuitest.getContentPane().add(getTfNum1());
		frmGuitest.getContentPane().add(getLblNewLabel_1());
		frmGuitest.getContentPane().add(getTfNum2());
		frmGuitest.getContentPane().add(getLblNewLabel_1_1());
		frmGuitest.getContentPane().add(getTfResult());
		frmGuitest.getContentPane().add(getBtnAdd());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("java GUI Example 01");
			lblNewLabel.setBounds(26, 17, 139, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(26, 45, 74, 34);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("+");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(122, 51, 23, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(157, 45, 74, 34);
		}
		return tfNum2;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("=");
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(248, 54, 23, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(283, 45, 74, 34);
		}
		return tfResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
					
				}
			});
			btnAdd.setBounds(28, 91, 81, 29);
		}
		return btnAdd;
	}



	//------function
	
	private void addAction() {
		System.out.println("Button is clicked!");
		
		if(tfNum1.getText().equals("")||tfNum2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "숫자를 입력하세요"); 		//노션에 커맨드 복사 붙혀넣기
		}else {
//			int num1=Integer.parseInt(tfNum1.getText());				//tfNum1 : 텍스트 필드 getText(): string Integer.parseInt: string을 int
//			int num2=Integer.parseInt(tfNum2.getText());				
			Addition addition = new Addition(Integer.parseInt(tfNum1.getText()),Integer.parseInt(tfNum2.getText()));
//			String result =Integer.toString(addition.add()); 
			
			tfResult.setText(Integer.toString(addition.add()));
			
		}
	}










}
//End
