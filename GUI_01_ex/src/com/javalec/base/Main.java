package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.Addition;

public class Main {

	private JFrame sss;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JButton btnX;
	private JButton btnNewButton_2;
	private JButton btnX_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.sss.setVisible(true);
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
		sss = new JFrame();
		sss.getContentPane().setBackground(Color.ORANGE);
		sss.getContentPane().setForeground(Color.WHITE);
		sss.setTitle("두개의 숫자 가감승제");
		sss.setBounds(100, 100, 450, 300);
		sss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sss.getContentPane().setLayout(null);
		sss.getContentPane().add(getLblNewLabel());
		sss.getContentPane().add(getLblNewLabel_1());
		sss.getContentPane().add(getBtnNewButton());
		sss.getContentPane().add(getBtnNewButton_1());
		sss.getContentPane().add(getTf1());
		sss.getContentPane().add(getTf2());
		sss.getContentPane().add(getTf3());
		sss.getContentPane().add(getTf4());
		sss.getContentPane().add(getTf5());
		sss.getContentPane().add(getLblNewLabel_2());
		sss.getContentPane().add(getLblNewLabel_2_1());
		sss.getContentPane().add(getBtnX());
		sss.getContentPane().add(getBtnX_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자1:");
			lblNewLabel.setBounds(36, 49, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자2:");
			lblNewLabel_1.setBounds(36, 90, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				addAction();
				
				}
			});
			btnNewButton.setForeground(Color.RED);
			btnNewButton.setBounds(205, 44, 36, 21);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("-");
			btnNewButton_1.setForeground(Color.RED);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					subAction();
				}
			});
			btnNewButton_1.setBounds(271, 44, 36, 21);
		}
		return btnNewButton_1;
	}
	private JTextField getTf1() {
		if (tf1 == null) {
			tf1 = new JTextField();
			tf1.setHorizontalAlignment(SwingConstants.TRAILING);
			tf1.setBounds(88, 46, 61, 21);
			tf1.setColumns(10);
		}
		return tf1;
	}
	private JTextField getTf2() {
		if (tf2 == null) {
			tf2 = new JTextField();
			tf2.setHorizontalAlignment(SwingConstants.TRAILING);
			tf2.setColumns(10);
			tf2.setBounds(88, 87, 61, 21);
		}
		return tf2;
	}
	private JTextField getTf3() {
		if (tf3 == null) {
			tf3 = new JTextField();
			tf3.setHorizontalAlignment(SwingConstants.TRAILING);
			tf3.setColumns(10);
			tf3.setBounds(47, 146, 61, 21);
		}
		return tf3;
	}
	private JTextField getTf4() {
		if (tf4 == null) {
			tf4 = new JTextField();
			tf4.setHorizontalAlignment(SwingConstants.TRAILING);
			tf4.setColumns(10);
			tf4.setBounds(129, 146, 61, 21);
		}
		return tf4;
	}
	private JTextField getTf5() {
		if (tf5 == null) {
			tf5 = new JTextField();
			tf5.setEditable(false);
			tf5.setHorizontalAlignment(SwingConstants.TRAILING);
			tf5.setColumns(10);
			tf5.setBounds(243, 146, 61, 21);
		}
		return tf5;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("+");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(99, 149, 36, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("=");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setBounds(202, 149, 36, 16);
		}
		return lblNewLabel_2_1;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("x");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mulAction();
				}
			});
			btnX.setForeground(Color.RED);
			btnX.setBounds(205, 85, 36, 21);
		}
		return btnX;
	}
	
	
	private JButton getBtnX_1() {
		if (btnX_1 == null) {
			btnX_1 = new JButton("x");
			btnX_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					divAction();
				}
			});
			btnX_1.setForeground(Color.RED);
			btnX_1.setBounds(271, 85, 36, 21);
		}
		return btnX_1;
	}
	
	
	//-----------function
	
	
	
	private void addAction() {
		
		System.out.println("버튼 클릭");
		tf3.setText(tf1.getText());
		tf4.setText(tf2.getText());
		int num1= Integer.parseInt(tf1.getText());
		int num2= Integer.parseInt(tf2.getText());
		
		Addition addition = new Addition(num1,num2);
//		String result =Integer.toString(addition.add()); 
		

		tf5.setText(Integer.toString(addition.add()));
//		tf5.setText(Integer.toString(addition.sub()));
		
		
		
	}
	
private void subAction() {
		
		System.out.println("버튼 클릭");
		tf3.setText(tf1.getText());
		tf4.setText(tf2.getText());
		int num1= Integer.parseInt(tf1.getText());
		int num2= Integer.parseInt(tf2.getText());
		
		Addition addition = new Addition(num1,num2);
//		String result =Integer.toString(addition.add()); 
		

		tf5.setText(Integer.toString(addition.sub()));
//		tf5.setText(Integer.toString(addition.sub()));
		
		
		
	}
private void mulAction() {
	System.out.println("버튼 클릭");
	tf3.setText(tf1.getText());
	tf4.setText(tf2.getText());
	int num1= Integer.parseInt(tf1.getText());
	int num2= Integer.parseInt(tf2.getText());
	
	Addition addition = new Addition(num1,num2);
//	String result =Integer.toString(addition.add()); 
	

	tf5.setText(Integer.toString(addition.mul()));
//	tf5.setText(Integer.toString(addition.sub()));
	
	
}
private void divAction() {
	System.out.println("버튼 클릭");
	tf3.setText(tf1.getText());
	tf4.setText(tf2.getText());
	int num1= Integer.parseInt(tf1.getText());
	int num2= Integer.parseInt(tf2.getText());
	
	Addition addition = new Addition(num1,num2);
//	String result =Integer.toString(addition.add()); 
	

	tf5.setText(Integer.toString(addition.div()));
//	tf5.setText(Integer.toString(addition.sub()));
	
	
}





}
