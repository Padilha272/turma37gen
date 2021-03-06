package com.cursoemvideo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSoma extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
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
	public TelaSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(66, 91, 46, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(160, 91, 46, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(130, 94, 20, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSoma = new JLabel("0");
		lblSoma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoma.setBounds(272, 91, 46, 20);
		contentPane.add(lblSoma);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(txtN1.getText()) ;
				int n2 = Integer.parseInt(txtN2.getText());
				int s = n1 +n2;
				lblSoma.setText(Integer.toString(s));
				
			}
		});
		btnSoma.setBounds(216, 90, 46, 23);
		contentPane.add(btnSoma);
	}
}
