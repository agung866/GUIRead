package com.adl.taskquiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SoalNoDua extends JFrame {

	private JPanel contentPane;
	 JTextField jwb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoalNoDua frame = new SoalNoDua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SoalNoDua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtSoal2 = new JLabel("10+10=?");
		txtSoal2.setBounds(23, 25, 371, 14);
		contentPane.add(txtSoal2);
		
		jwb2 = new JTextField();
		jwb2.setBounds(23, 61, 86, 20);
		contentPane.add(jwb2);
		jwb2.setColumns(10);
		
		JButton btnBack1 = new JButton("Back");
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SoalNoSatu().setVisible(true);
				SoalNoDua.this.dispose();
			}
		});
		btnBack1.setBounds(10, 180, 89, 23);
		contentPane.add(btnBack1);
		
		JButton btnNext2 = new JButton("Next");
		btnNext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SoalNoTiga().setVisible(true);
				SoalNoDua.this.dispose();
			}
		});
		btnNext2.setBounds(109, 180, 89, 23);
		contentPane.add(btnNext2);
	}
}
