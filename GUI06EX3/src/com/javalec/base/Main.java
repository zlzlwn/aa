package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.javalec.function.BmiCalc;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frmBmi;
	private JTextField tfHight;
	private JTextField tfWeight;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblCm;
	private JLabel lblKg;
	private JButton btnCalc;
	private JLabel lblResult;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBmi.setVisible(true);
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
		frmBmi = new JFrame();
		frmBmi.setTitle("BMI계산기");
		frmBmi.setBounds(100, 100, 335, 494);
		frmBmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmi.getContentPane().setLayout(null);
		frmBmi.getContentPane().add(getTfHight());
		frmBmi.getContentPane().add(getTfWeight());
		frmBmi.getContentPane().add(getLblNewLabel());
		frmBmi.getContentPane().add(getLblNewLabel_1());
		frmBmi.getContentPane().add(getLblCm());
		frmBmi.getContentPane().add(getLblKg());
		frmBmi.getContentPane().add(getBtnCalc());
		frmBmi.getContentPane().add(getLblResult());
		frmBmi.getContentPane().add(getLblNewLabel_2());
	}

	private JTextField getTfHight() {
		if (tfHight == null) {
			tfHight = new JTextField();
			tfHight.setBounds(150, 28, 98, 26);
			tfHight.setColumns(10);
		}
		return tfHight;
	}

	private JTextField getTfWeight() {
		if (tfWeight == null) {
			tfWeight = new JTextField();
			tfWeight.setColumns(10);
			tfWeight.setBounds(150, 66, 98, 26);
		}
		return tfWeight;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장) :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(47, 33, 61, 16);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("몸무게 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setBounds(47, 71, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblCm() {
		if (lblCm == null) {
			lblCm = new JLabel("cm");
			lblCm.setBounds(253, 33, 61, 16);
		}
		return lblCm;
	}

	private JLabel getLblKg() {
		if (lblKg == null) {
			lblKg = new JLabel("Kg");
			lblKg.setBounds(253, 71, 61, 16);
		}
		return lblKg;
	}

	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bmiCalc();
				}
			});
			btnCalc.setBounds(131, 128, 117, 29);
		}
		return btnCalc;
	}

	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(6, 103, 323, 16);
		}
		return lblResult;
	}

//----------Function------------
	private void bmiCalc() {
		int check = inputCheck();
		if (check != 0) {
			JOptionPane.showMessageDialog(null, "항목을 입력하세요.");
		} else {
			calcBmi();
		}

	}

	private int inputCheck() {
		int checkResult = 0;
		if (tfHight.getText().trim().length() == 0) { // 글자 잡아오고 트림으로 공백 지우고 길이잰게0
			checkResult++;
			tfHight.requestFocus(); // requestFocus 강제로 임의의 컴포넌트에 포커스를 준다...? => 텍스트 필드에 강제로 커서를 가게 만든
		}
		if (tfWeight.getText().trim().length() == 0) {
			checkResult++;
			tfWeight.requestFocus();
		}
		return checkResult;
	}

	private void calcBmi() {
		double height = Double.parseDouble(tfHight.getText());
		double weight = Double.parseDouble(tfWeight.getText());

		BmiCalc bmiCalc = new BmiCalc(weight, height);
		double bmi = bmiCalc.calcBmi();
		String result = bmiCalc.showResult(bmi);

		lblResult.setText("귀하의 BMI지수는" + bmi + "이고 " + result + "입니다.");
//		if(result.equals("저체중")) {
//			
//			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/underweight.png")));
//		}else if(result.equals("정상")){
//			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/normal.png")));
//			
//		}else if(result.equals("과체중")){
//			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/risk.png")));
//			
//		}else if(result.equals("비만")){
//			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/overweight.png")));
//			
//		}else {
//			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/obsee.png")));
//			
//		}
		lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/" + result + ".png")));
	}
	//------------------Function end
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/정상.png")));
			lblNewLabel_2.setBounds(116, 188, 151, 256);
		}
		return lblNewLabel_2;
	}
}// end
