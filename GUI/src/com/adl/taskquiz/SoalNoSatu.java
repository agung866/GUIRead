package com.adl.taskquiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.AncestorListener;


import javax.swing.event.AncestorEvent;

public class SoalNoSatu extends JFrame {

	
	private JPanel contentPane;
	 JRadioButton a;
	 JRadioButton b;
	 JRadioButton c;
	 JRadioButton d;
	private String url="";
	private List<String> lstSoal = new ArrayList<String>();
	protected JLabel txtSoal1;

	
	public JLabel getTxtSoal1() {
		return txtSoal1;
	}


	public void setTxtSoal1(JLabel txtSoal1) {
		this.txtSoal1 = txtSoal1;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoalNoSatu frame = new SoalNoSatu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		
	/**
	 * Create the frame.
	 * @param pertanyaan,String[] pilihan 
	 */
	public SoalNoSatu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel txtSoal1 = new JLabel("siapakah nama trainner JC");
		txtSoal1.setBounds(10, 11, 414, 14);
		contentPane.add(txtSoal1);
		
		
		
		a = new JRadioButton("hanif");
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a.isSelected()) {
					b.setSelected(false);
					c.setSelected(false);
					d.setSelected(false);
				}
			}
		});
		a.setBounds(54, 32, 109, 23);
		contentPane.add(a);
		
		b = new JRadioButton("agung");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b.isSelected()) {
					a.setSelected(false);
					c.setSelected(false);
					d.setSelected(false);
				}
			}
		});
		b.setBounds(54, 58, 109, 23);
		contentPane.add(b);
		
		c = new JRadioButton("abdillah");
		c.setToolTipText("abdilah");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.isSelected()) {
					a.setSelected(false);
					b.setSelected(false);
					d.setSelected(false);
				}
			}
		});
		c.setBounds(54, 84, 109, 23);
		contentPane.add(c);
		
		d = new JRadioButton("anggito");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(d.isSelected()) {
					a.setSelected(false);
					b.setSelected(false);
					c.setSelected(false);
				}
			}
		});
		d.setBounds(54, 111, 109, 23);
		contentPane.add(d);
		
		JButton btnNext1 = new JButton("Next");
		btnNext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SoalNoDua().setVisible(true);
				
				SoalNoSatu.this.dispose();
			}
		});
		btnNext1.setBounds(57, 213, 89, 23);
		contentPane.add(btnNext1);
	}
}
	
