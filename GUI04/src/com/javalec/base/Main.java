package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frmPasswordfield;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword1;
	private JButton btnShow;
	private JPasswordField pfPassword2;
	private JButton btnCompare;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmPasswordfield.setVisible(true);
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
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 340, 201);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getLblNewLabel());
		frmPasswordfield.getContentPane().add(getPfPassword1());
		frmPasswordfield.getContentPane().add(getBtnShow());
		frmPasswordfield.getContentPane().add(getPfPassword2());
		frmPasswordfield.getContentPane().add(getBtnCompare());
		frmPasswordfield.getContentPane().add(getLblResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(27, 34, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfPassword1() {
		if (pfPassword1 == null) {
			pfPassword1 = new JPasswordField();
			pfPassword1.setBounds(100, 29, 77, 26);
		}
		return pfPassword1;
	}
	private JButton getBtnShow() {
		if (btnShow == null) {
			btnShow = new JButton("Show");
			btnShow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				checkPassword();
				}
			});
			btnShow.setBounds(199, 29, 117, 29);
		}
		return btnShow;
	}
	private JPasswordField getPfPassword2() {
		if (pfPassword2 == null) {
			pfPassword2 = new JPasswordField();
			pfPassword2.setBounds(100, 65, 77, 26);
		}
		return pfPassword2;
	}
	private JButton getBtnCompare() {
		if (btnCompare == null) {
			btnCompare = new JButton("Compare");
			btnCompare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				comparePassword();
				}
			});
			btnCompare.setBounds(199, 65, 117, 29);
		}
		return btnCompare;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(27, 124, 289, 16);
		}
		return lblResult;
	}

//------f

	private void checkPassword() {
		char[] pass = pfPassword1.getPassword();	//비밀번호는 배열로 들어가기때문에 배열로 받
		String passString = new String(pass);		// 배열을 스트링으로변환
		lblResult.setText(passString);				//스트링 비밀번호를 리졸트에 보
		
	}
	private void comparePassword() {
		char[] pass1 = pfPassword1.getPassword();		
		String passString1 = new String(pass1);			// pass1을 

		
		char[] pass2 = pfPassword2.getPassword();		
		String passString2 = new String(pass2);

		if(passString1.equals(passString2)) {
			lblResult.setText("password가 일치합니다");
		}else {
			lblResult.setText("password가 일치하지 않습니다");
		}
		
	}







}// end

