package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Main {

	private JFrame frame;
	private JLabel lbAddress;
	private JTextField tfId;
	private JLabel lblNewLabel_1;
	private JTextField tfAddress;
	private JComboBox cbAddress;
	private JLabel lbResult;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLbAddress());
		frame.getContentPane().add(getTfId());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getCbAddress());
		frame.getContentPane().add(getLbResult());
	}
	private JLabel getLbAddress() {
		if (lbAddress == null) {
			lbAddress = new JLabel("Email주소 :");
			lbAddress.setBounds(26, 38, 76, 16);
		}
		return lbAddress;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(103, 33, 96, 26);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(198, 38, 16, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setText("naver.com");
			tfAddress.setColumns(10);
			tfAddress.setBounds(216, 33, 96, 26);
		}
		return tfAddress;
	}
	private JComboBox getCbAddress() {
		if (cbAddress == null) {
			cbAddress = new JComboBox();
			cbAddress.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "daum.com", "gmail.com", "icloud.com"}));
			cbAddress.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbAddress.setBounds(312, 34, 120, 27);
		}
		return cbAddress;
	}
	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("");
			lbResult.setBounds(103, 112, 255, 16);
		}
		return lbResult;
	}
public void comboAction() {
			String strAddress =cbAddress.getSelectedItem().toString();
			tfAddress.setText(strAddress);
			
			
			
			lbResult.setText("당신의 이메일 주소는 "+tfId.getText()+"@"+cbAddress.getSelectedItem()+"입니다.");
	
	
}



}//end
