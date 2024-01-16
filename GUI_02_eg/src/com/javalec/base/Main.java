package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.javalec.function.Sum;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JButton btn;
	private JLabel lblNewLabel;
	private JTextField firstNum;
	private JTextField lastNum;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tfResult;

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
		frame.getContentPane().add(getBtn());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getFirstNum());
		frame.getContentPane().add(getLastNum());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfResult());
	}

	private JButton getBtn() {
		if (btn == null) {
			btn = new JButton("합계 구하기");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				sumAction();
				}
			});
			btn.setBounds(227, 56, 117, 29);
		}
		return btn;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작숫자");
			lblNewLabel.setBounds(63, 61, 49, 16);
		}
		return lblNewLabel;
	}
	private JTextField getFirstNum() {
		if (firstNum == null) {
			firstNum = new JTextField();
			firstNum.setColumns(10);
			firstNum.setBounds(123, 56, 67, 21);
		}
		return firstNum;
	}
	private JTextField getLastNum() {
		if (lastNum == null) {
			lastNum = new JTextField();
			lastNum.setColumns(10);
			lastNum.setBounds(123, 101, 67, 21);
		}
		return lastNum;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝숫자");
			lblNewLabel_1.setBounds(63, 106, 49, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(227, 106, 49, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setColumns(10);
			tfResult.setBounds(288, 103, 100, 21);
		}
		return tfResult;
	}
//--------Function
	private void sumAction() {
		
		Sum sum = new Sum(firstNum.getText(),lastNum.getText());
		 tfResult.setText(sum.sum());
	}











}//end

