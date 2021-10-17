package com.adl.taskquiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SoalNoTiga extends JFrame {

	private JPanel contentPane;
	 JTextField jwbSoal3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoalNoTiga frame = new SoalNoTiga();
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
	public SoalNoTiga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtSoal3 = new JLabel("5+5=?");
		txtSoal3.setBounds(39, 33, 361, 14);
		contentPane.add(txtSoal3);
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SoalNoDua().setVisible(true);
				SoalNoTiga.this.dispose();
			}
		});
		btnBack2.setBounds(10, 200, 89, 23);
		contentPane.add(btnBack2);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SoalNoSatu x =new SoalNoSatu();
//				SoalNoDua y=new SoalNoDua();
//				SoalNoTiga z =new SoalNoTiga();
//				Score s =new Score();
//				
//				
//				if(x.a.isSelected() && y.jwb2.equals("20") && z.jwbSoal3.equals("10")) {
//					
//			        s.score_1.setText("60");
//			        s.lblBenar_1.setText("3");
//			        s.lblSalah_1.setText("0");
//			        
//			       
//			        
//				}else if(!x.a.isSelected() && y.jwb2.equals("20") && z.jwbSoal3.equals("10")) {
//						s.score_1.setText("40");
//				        s.lblBenar_1.setText("2");
//				        s.lblSalah_1.setText("1");
//				        
//				        
//				}else if(!x.a.isSelected() && !y.jwb2.equals("20") && z.jwbSoal3.equals("10")) {
//					s.score_1.setText("20");
//			        s.lblBenar_1.setText("1");
//			        s.lblSalah_1.setText("2");
//			        
//				}else if(x.a.isSelected() && !y.jwb2.equals("20") && !z.jwbSoal3.equals("10")) {
//					s.score_1.setText("20");
//			        s.lblBenar_1.setText("1");
//			        s.lblSalah_1.setText("2");
//			        
//			        
//				}else if(x.a.isSelected() && y.jwb2.equals("20") && !z.jwbSoal3.equals("10")) {
//					s.score_1.setText("40");
//			        s.lblBenar_1.setText("2");
//			        s.lblSalah_1.setText("1");
//			        
//			     
//				}else if(x.a.isSelected() && !y.jwb2.equals("20") && z.jwbSoal3.equals("10")) {
//					s.score_1.setText("40");
//			        s.lblBenar_1.setText("2");
//			        s.lblSalah_1.setText("1");
//			        
//			      
//				}else if(!x.a.isSelected() && y.jwb2.equals("20") && !z.jwbSoal3.equals("10")) {
//					s.score_1.setText("40");
//			        s.lblBenar_1.setText("2");
//			        s.lblSalah_1.setText("1");
//			       
//				}else {
//					s.score_1.setText("40");
//			        s.lblBenar_1.setText("2");
//			        s.lblSalah_1.setText("1");
//			        
//			}
//				
//				new Score().setVisible(true);
//				SoalNoTiga.this.dispose();
//				
//				
//				
			}
		});
		btnNext3.setBounds(109, 200, 89, 23);
		contentPane.add(btnNext3);
		
		jwbSoal3 = new JTextField();
		jwbSoal3.setBounds(39, 75, 86, 20);
		contentPane.add(jwbSoal3);
		jwbSoal3.setColumns(10);
	}

}
