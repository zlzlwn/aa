package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.javalec.function.Addition;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField tfSnum;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfFnum;
	private JLabel lblNewLabel_2;
	private JTextField tfResult;
	private JButton btnSum;

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
		frame.getContentPane().add(getTfSnum());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfFnum());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnSum());
	}
	private JTextField getTfSnum() {
		if (tfSnum == null) {
			tfSnum = new JTextField();
			tfSnum.setColumns(10);
			tfSnum.setBounds(109, 47, 67, 21);
		}
		return tfSnum;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작숫자");
			lblNewLabel.setBounds(49, 52, 49, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝숫자");
			lblNewLabel_1.setBounds(49, 97, 49, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfFnum() {
		if (tfFnum == null) {
			tfFnum = new JTextField();
			tfFnum.setColumns(10);
			tfFnum.setBounds(109, 92, 67, 21);
		}
		return tfFnum;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(213, 97, 49, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setColumns(10);
			tfResult.setBounds(274, 94, 100, 21);
		}
		return tfResult;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("합계 구하기");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
					
				}
			});
			btnSum.setBounds(213, 47, 117, 29);
		}
		return btnSum;
	}
	//-------function
	
	private void addAction() {
			
		Addition addition = new Addition(tfSnum.getText(),tfFnum.getText());
		tfResult.setText(addition.add());
		
	}
	
	
	
	
	
	
	
	
	
}// end
