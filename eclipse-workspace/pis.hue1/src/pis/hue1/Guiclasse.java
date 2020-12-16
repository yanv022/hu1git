package pis.hue1;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Guiclasse extends JFrame {
	
	
    Codec c1 ;
    Codec c2 ;
	private JPanel contentPane;
	private JTextArea txtrKlaretext;
	private JTextArea txtrLosung;
	private JTextArea keyword;
	private JRadioButton rdbtnCaesar;
	private JRadioButton rdbtnWuerfel;
	private JButton b1 ;
	private JButton b2 ;

	public Guiclasse(Codec c1, Codec c2) {
		this.c1 = c1;
		this.c2 = c2 ;
	
		b1 = new JButton("Kodierung");
		b2 = new JButton("deKodierung");
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
		setBackground(SystemColor .controlShadow);                                                                   //dernier
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtrKlaretext = new JTextArea();
		txtrKlaretext.setLineWrap(true);
		txtrKlaretext.setText("klaretext");   //klaretext
		txtrKlaretext.setBounds(127, 11, 457, 124);
		panel.add(txtrKlaretext);
		
		keyword = new JTextArea();
		keyword.setLineWrap(true);
		keyword.setBounds(198, 164, 378, 22);
		panel.add(keyword);
		
		txtrLosung = new JTextArea();
		txtrLosung.setEditable(false);
		txtrLosung.setLineWrap(true);
		txtrLosung.setText("losung");
		txtrLosung.setBounds(127, 211, 449, 124);
		panel.add(txtrLosung);
		
		rdbtnWuerfel = new JRadioButton("Wuerfel");
		rdbtnWuerfel.setBounds(122, 369, 109, 23);
		panel.add(rdbtnWuerfel);
		
		rdbtnCaesar = new JRadioButton("Caesar");
		rdbtnCaesar.setBounds(275, 369, 109, 23);
		panel.add(rdbtnCaesar);
		
		JLabel lblTextEingeben = new JLabel("text eingeben");
		lblTextEingeben.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextEingeben.setBounds(10, 63, 88, 14);
		panel.add(lblTextEingeben);
		
		JLabel lblKeyword = new JLabel("keyword");
		lblKeyword.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeyword.setBounds(10, 169, 88, 14);
		panel.add(lblKeyword);
		// Codierung buton 
b1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		
		panel.add(b1);
		b1.setBounds(5, 400, 300, 53);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(rdbtnWuerfel.isSelected()) {
					c1.setzeLosung(keyword.getText());
					txtrLosung.setText(c1.kodiere(txtrKlaretext.getText()));
				} else if(rdbtnCaesar.isSelected()) {
					c2.setzeLosung(keyword.getText());
					txtrLosung.setText(c2.kodiere(txtrKlaretext.getText()));
				}
			}
		});
		
        b2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		
		panel.add(b2);
		b2.setBounds(300, 400, 300, 53);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCaesar.isSelected()) {
					
					c2.setzeLosung(keyword.getText());
					txtrLosung.setText(c2.dekodiere(txtrKlaretext.getText()));
				} else if(rdbtnWuerfel.isSelected()) {
					
					
					c1.setzeLosung(keyword.getText());
					txtrLosung.setText(c1.dekodiere(txtrKlaretext.getText()));
				}
			}
		});
		
		
		
		
		
	
}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guiclasse frame = new Guiclasse(new Wuerfel(), new Caesar()) ;
							frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}