package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.javalec.function.Addition;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2 {

	private JFrame frame;
	private JLabel lbstart;
	private JLabel lbfinish;
	private JTextField tfstart;
	private JTextField tffinish;
	private JRadioButton rbtTotal;
	private JRadioButton rbtEven;
	private JRadioButton rbtOdd;
	private JButton btncal;
	private JTextField tfresult;
	private JLabel lblNewLabel_1_1;

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
		frame.setBounds(100, 100, 450, 193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLbstart());
		frame.getContentPane().add(getLbfinish());
		frame.getContentPane().add(getTfstart());
		frame.getContentPane().add(getTffinish());
		frame.getContentPane().add(getRbtTotal());
		frame.getContentPane().add(getRbtEven());
		frame.getContentPane().add(getRbtOdd());
		frame.getContentPane().add(getBtncal());
		frame.getContentPane().add(getTfresult());
		frame.getContentPane().add(getLblNewLabel_1_1());
	}

	private JLabel getLbstart() {
		if (lbstart == null) {
			lbstart = new JLabel("시작숫자");
			lbstart.setBounds(31, 22, 61, 16);
		}
		return lbstart;
	}
	private JLabel getLbfinish() {
		if (lbfinish == null) {
			lbfinish = new JLabel("끝 숫자");
			lbfinish.setBounds(31, 50, 61, 16);
		}
		return lbfinish;
	}
	private JTextField getTfstart() {
		if (tfstart == null) {
			tfstart = new JTextField();
			tfstart.setBounds(104, 17, 68, 26);
			tfstart.setColumns(10);
		}
		return tfstart;
	}
	private JTextField getTffinish() {
		if (tffinish == null) {
			tffinish = new JTextField();
			tffinish.setColumns(10);
			tffinish.setBounds(104, 45, 68, 26);
		}
		return tffinish;
	}
	private JRadioButton getRbtTotal() {
		if (rbtTotal == null) {
			rbtTotal = new JRadioButton("전체");
			rbtTotal.setBounds(195, 18, 61, 23);
		}
		return rbtTotal;
	}
	private JRadioButton getRbtEven() {
		if (rbtEven == null) {
			rbtEven = new JRadioButton("짝수");
			rbtEven.setBounds(268, 18, 61, 23);
		}
		return rbtEven;
	}
	private JRadioButton getRbtOdd() {
		if (rbtOdd == null) {
			rbtOdd = new JRadioButton("홀수");
			rbtOdd.setBounds(341, 18, 61, 23);
		}
		return rbtOdd;
	}
	private JButton getBtncal() {
		if (btncal == null) {
			btncal = new JButton("계산하기");
			btncal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addaction();
				}
			});
			btncal.setBounds(184, 45, 117, 29);
		}
		return btncal;
	}
	private JTextField getTfresult() {
		if (tfresult == null) {
			tfresult = new JTextField();
			tfresult.setColumns(10);
			tfresult.setBounds(104, 107, 117, 26);
		}
		return tfresult;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(31, 112, 61, 16);
		}
		return lblNewLabel_1_1;
	}
//-----------------------function

public void addaction() {
	String num1 =tfstart.getText().toString();
	String num2 =tfstart.getText().toString();
	Addition addition = new Addition(num1,num2);
//	if(rbtTotal.isSelected()) {
//		tfresult.setText(addition.add());
//		}
//		if(rbEvenSum.isSelected()) {
//		tfSum.setText(calc.sumCalc("Even"));
//		}
//		if(rbOddSum.isSelected()) {
//		tfSum.setText(calc.sumCalc("Odd"));
//		}
//	
	
}










}	//end
