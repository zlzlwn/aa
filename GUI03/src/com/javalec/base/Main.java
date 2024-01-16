package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmCheckBoxRadio;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private JTextField tfFruits;
	private JButton btnFruits;
	private JCheckBox cbxApple;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbxBanana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCheckBoxRadio.setVisible(true);
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
		frmCheckBoxRadio = new JFrame();
		frmCheckBoxRadio.setTitle("Check Box Radio Button");
		frmCheckBoxRadio.setBounds(100, 100, 450, 300);
		frmCheckBoxRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckBoxRadio.getContentPane().setLayout(null);
		frmCheckBoxRadio.getContentPane().add(getRbKBS());
		frmCheckBoxRadio.getContentPane().add(getRbMBC());
		frmCheckBoxRadio.getContentPane().add(getBtnBroad());
		frmCheckBoxRadio.getContentPane().add(getTfBroad());
		frmCheckBoxRadio.getContentPane().add(getTfFruits());
		frmCheckBoxRadio.getContentPane().add(getBtnFruits());
		frmCheckBoxRadio.getContentPane().add(getCbxApple());
		frmCheckBoxRadio.getContentPane().add(getCbxBanana());
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setSelected(true);
			rbKBS.setBounds(34, 39, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(34, 74, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(34, 121, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(21, 177, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setColumns(10);
			tfFruits.setBounds(269, 177, 130, 26);
		}
		return tfFruits;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				fruitCheck();
				}
			});
			btnFruits.setBounds(258, 121, 117, 29);
		}
		return btnFruits;
	}
	private JCheckBox getCbxApple() {
		if (cbxApple == null) {
			cbxApple = new JCheckBox("Apple");
			cbxApple.setBounds(258, 39, 128, 23);
		}
		return cbxApple;
	}
	private JCheckBox getCbxBanana() {
		if (cbxBanana == null) {
			cbxBanana = new JCheckBox("Banana");
			cbxBanana.setBounds(258, 74, 128, 23);
		}
		return cbxBanana;
	}

//Function
	
	private void broadCheck() {
		if(rbKBS.isSelected()){
			tfBroad.setText("KBS is selected");
		}
		if(rbMBC.isSelected()) {
			tfBroad.setText("MBC is selected");
		}


}

	private void fruitCheck() {
		
		tfFruits.setText("Nothing");
		
		if(cbxApple.isSelected()) {
			tfFruits.setText("Apple is selected");
		}
		if(cbxBanana.isSelected()) {
			tfFruits.setText("Banana is selected");
		}
		if(cbxApple.isSelected()&&cbxBanana.isSelected()) {
			tfFruits.setText("apple & Banana");
		}
		
		
		
	}
	
	
	


}// end
