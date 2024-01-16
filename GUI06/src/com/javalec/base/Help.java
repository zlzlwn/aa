package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help dialog = new Help();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setTitle("Dialog");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnExit());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("문제가 발생하면 옆회사로문의하세요");
			lblNewLabel.setBounds(61, 60, 334, 16);
		}
		return lblNewLabel;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("종료");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				exitAction();
				}
			});
			btnExit.setBounds(300, 191, 117, 29);
		}
		return btnExit;
	}
//-----------------------
	private void exitAction() {
		dispose();//화면종
		
	}












}// end
