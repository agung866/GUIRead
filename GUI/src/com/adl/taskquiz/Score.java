package com.adl.taskquiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Score extends JFrame {

	 JPanel contentPane;
	protected JLabel score_1;
	protected JLabel lblBenar_1;
	protected JLabel lblSalah_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	public Score() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel score = new JLabel("Score:");
		score.setBounds(49, 29, 146, 27);
		contentPane.add(score);
		
		JLabel lblBenar = new JLabel("Benar:");
		lblBenar.setBounds(49, 78, 146, 27);
		contentPane.add(lblBenar);
		
		JLabel lblSalah = new JLabel("Salah\t:");
		lblSalah.setBounds(49, 124, 146, 27);
		contentPane.add(lblSalah);
		
		JLabel lblSalah_1 = new JLabel();
		lblSalah_1.setBounds(220, 124, 146, 27);
		contentPane.add(lblSalah_1);
		
		JLabel lblBenar_1 = new JLabel("");
		lblBenar_1.setBounds(220, 78, 146, 27);
		contentPane.add(lblBenar_1);
		
		JLabel score_1 = new JLabel("");
		score_1.setBounds(220, 29, 146, 27);
		contentPane.add(score_1);
		
	
		
		
	
	}
}
