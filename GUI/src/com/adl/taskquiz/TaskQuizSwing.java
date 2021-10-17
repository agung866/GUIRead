package com.adl.taskquiz;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TaskQuizSwing extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtFile;
	private JButton btnNext;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskQuizSwing frame = new TaskQuizSwing();
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
	public TaskQuizSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(258, 75, 118, 26);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource()==btnBrowse) {
					JFileChooser fileChooser= new JFileChooser();
					
					int response=fileChooser.showOpenDialog(null); //pilih file untuk membuka
					
					if(response==JFileChooser.APPROVE_OPTION) {
						File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
						txtFile.setText(file.getPath());
					}
					
				}
				
			}
			
	});
		contentPane.setLayout(null);
		contentPane.add(btnBrowse);
		
		JLabel lblNewLabel = new JLabel("Masukan File");
		lblNewLabel.setBounds(39, 75, 92, 26);
		contentPane.add(lblNewLabel);
		
		txtFile = new JTextField();
		txtFile.setBounds(130, 78, 118, 20);
		contentPane.add(txtFile);
		
		txtFile.setColumns(10);
		
		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtFile.getText().equals("")) {
					
					new SoalNoSatu().setVisible(true);
					TaskQuizSwing.this.dispose();
				}else {
					
					JOptionPane.showMessageDialog(null, "Harap Masukan File", "Warning ", JOptionPane.WARNING_MESSAGE);
				}
//				SoalNoSatu satu =new SoalNoSatu();
//				satu.txtSoal1.setText(null);
//				String path = txtFile.getText();
//				File file = new File(path);
//				try {
//				FileInputStream fstream = new FileInputStream(file);
//				DataInputStream in = new DataInputStream(fstream);
//				BufferedReader br = new BufferedReader(new InputStreamReader(in));
//				String strLine;
//				while ((strLine = br.readLine()) != null) {
//				StringTokenizer st = new StringTokenizer(strLine, ".");
//				satu.txtSoal1.setText(satu.txtSoal1.getText() + st.nextToken() + "\n");
//				}
//				in.close();
//				} catch (Exception e2) {
//				System.out.println("Error : " + e2.getMessage());
//			}
		}
				
			
		});
		btnNext.setBounds(115, 112, 155, 23);
		contentPane.add(btnNext);
	}
}
