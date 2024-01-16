package com.java.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField tfAddress;
	private JLabel lblNewLabel_1_2;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1_3;
	private JTextField tfRelation;
	private JButton btnOk;				//Field
	
	//property 선언 Database 환경정의
	private final String url_mysql="jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";// 
//												서버       스키마(db) 이름        다 붙어있어야 한다(암호화때문)				secure	주소,이름은 바뀔수 있다.
	private final String id_mysql= "root";
	private final String pw_mysql = "qwer1234";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInsert window = new UserInsert();
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
	public UserInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_1_2());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_1_3());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnOk());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setBounds(23, 19, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			tfName.setBounds(96, 14, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(96, 47, 130, 26);
		}
		return tfTelNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 :");
			lblNewLabel_1.setBounds(23, 52, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("주소 :");
			lblNewLabel_1_1.setBounds(23, 82, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(96, 77, 212, 26);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("전자우편 :");
			lblNewLabel_1_2.setBounds(23, 115, 61, 16);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(96, 110, 212, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("관계:");
			lblNewLabel_1_3.setBounds(23, 148, 61, 16);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(96, 143, 269, 26);
		}
		return tfRelation;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("입력");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
				}
			});
			btnOk.setBounds(158, 223, 117, 29);
		}
		return btnOk;
	}
//-----------Function----------------
private void insertAction() {					// 외부환경은 반드시 try
	PreparedStatement ps =null;					//PreparedStatement 자바를 소켓프로그렘이로 바꿔주는 throw 에러를 던다 (try catch 있으면 없어도 됨)
	try {
//		int check = emptyAction();
//		if (tfName.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
//		}else if (tfTelNo.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "번호를 입력하세요.");
//		}else if (tfAddress.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "주소를 입력하세요.");
//		}else if (tfEmail.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "전자우편를 입력하세요.");
//		}else if (tfRelation.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "관계를 입력하세요.");
//		}
//		else{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql =DriverManager.getConnection(url_mysql,id_mysql, pw_mysql);	//연결한때 어느 id pw로할꺼
			Statement stmt_mysql =conn_mysql.createStatement();																			//db에서 데이터ㄱ가져오는게 statement
			
			String query ="insert into userinfo(name, telno, address, email, relation) ";		//띄어쓰기 이유 다시 물어보
			String query1 ="values(?,?,?,?,?)";		//prepare statement 보안때문에 ?사
			
			ps = conn_mysql.prepareStatement(query + query1);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelNo.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			
			ps.executeUpdate();
			
			conn_mysql.close();   				//접속자가기본 5명이라 바로끊어줘야함
			
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 입력되었습니다.");
			
			
//		}
		
		
		
	}catch (Exception e) {
		 e.printStackTrace();
	}
	}
//
//	private void emptyAction() {
//		int checkResult = 0;
//		if (tfName.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
//		}else if (tfTelNo.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "번호를 입력하세요.");
//		}else if (tfAddress.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "주소를 입력하세요.");
//		}else if (tfEmail.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "전자우편를 입력하세요.");
//		}else if (tfRelation.getText().trim().length() == 0) {
//			JOptionPane.showMessageDialog(null, "관계를 입력하세요.");
//		}
//		return checkResult;
//	}











}//end
