package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmMain;
	private JButton btnHelp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMain.setVisible(true);
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
		frmMain = new JFrame();
		frmMain.setTitle("Main");
		frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		frmMain.getContentPane().add(getBtnHelp());
	}

	private JButton getBtnHelp() {
		if (btnHelp == null) {
			btnHelp = new JButton("Help");
			btnHelp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					help();
				}
			});
			btnHelp.setBounds(155, 117, 117, 29);
		}
		return btnHelp;
	}
//-----------
	private void help() {
		frmMain.setVisible(false);
		Help help =new Help();
		help.setVisible(true);
	}

	







}	//end
