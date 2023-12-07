package praktikum7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 386, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_7.getText();
				textField.setText(Number);
			}
		});
		btn_7.setBounds(10, 70, 89, 43);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_8.getText();
				textField.setText(Number);
			}
		});
		btn_8.setBounds(109, 70, 89, 43);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_9.getText();
				textField.setText(Number);
			}
		});
		btn_9.setBounds(208, 70, 89, 43);
		frame.getContentPane().add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_4.getText();
				textField.setText(Number);
			}
		});
		btn_4.setBounds(10, 124, 89, 43);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_5.getText();
				textField.setText(Number);
			}
		});
		btn_5.setBounds(109, 123, 89, 43);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_6.getText();
				textField.setText(Number);
			}
		});
		btn_6.setBounds(208, 123, 89, 43);
		frame.getContentPane().add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_1.getText();
				textField.setText(Number);
			}
		});
		btn_1.setBounds(10, 177, 89, 43);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_2.getText();
				textField.setText(Number);
			}
		});
		btn_2.setBounds(109, 177, 89, 43);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_3.getText();
				textField.setText(Number);
			}
		});
		btn_3.setBounds(208, 177, 89, 43);
		frame.getContentPane().add(btn_3);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn_0.getText();
				textField.setText(Number);
			}
		});
		btn_0.setBounds(109, 231, 89, 43);
		frame.getContentPane().add(btn_0);
		
		JButton btn_tambah = new JButton("+");
		btn_tambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tambah.setBounds(307, 70, 89, 43);
		frame.getContentPane().add(btn_tambah);
		
		JButton btn_kurang = new JButton("-");
		btn_kurang.setBounds(307, 124, 89, 43);
		frame.getContentPane().add(btn_kurang);
		
		JButton btn_kali = new JButton("*");
		btn_kali.setBounds(307, 177, 89, 43);
		frame.getContentPane().add(btn_kali);
		
		JButton btn_bagi = new JButton("/");
		btn_bagi.setBounds(307, 231, 89, 43);
		frame.getContentPane().add(btn_bagi);
		
		JButton btn_hasil = new JButton("=");
		btn_hasil.setBounds(208, 231, 89, 43);
		frame.getContentPane().add(btn_hasil);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setBounds(10, 231, 89, 43);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_plusminus = new JButton("+/-");
		btn_plusminus.setBounds(10, 285, 89, 43);
		frame.getContentPane().add(btn_plusminus);
		
		JButton btn_titik = new JButton(".");
		btn_titik.setBounds(109, 285, 89, 43);
		frame.getContentPane().add(btn_titik);
		
		JButton btn_back = new JButton("<-");
		btn_back.setBounds(208, 285, 89, 43);
		frame.getContentPane().add(btn_back);
	}
}
