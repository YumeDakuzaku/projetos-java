package cscorner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoFrame {

	private JFrame frmDemoFrame;
	private JTextField textName;
	private JTextField textAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame window = new DemoFrame();
					window.frmDemoFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDemoFrame = new JFrame();
		frmDemoFrame.setTitle("Demo Frame");
		frmDemoFrame.setBounds(100, 100, 556, 306);
		frmDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDemoFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setBounds(128, 62, 89, 14);
		frmDemoFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setBounds(128, 124, 89, 14);
		frmDemoFrame.getContentPane().add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setBounds(235, 62, 206, 20);
		frmDemoFrame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(235, 124, 206, 20);
		frmDemoFrame.getContentPane().add(textAge);
		textAge.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textName.getText();
				int age=Integer.parseInt(textAge.getText());
				if(age>=18)
					lblInfo.setText(n+" You are eligible to Vote!");
				else
					lblInfo.setText(n+" You are not eligible to Vote!");
			}
		});
		btnOk.setBounds(156, 177, 89, 23);
		frmDemoFrame.getContentPane().add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				lblInfo.setText("");
			}
		});
		btnReset.setBounds(283, 177, 89, 23);
		frmDemoFrame.getContentPane().add(btnReset);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(67, 211, 276, 14);
		frmDemoFrame.getContentPane().add(lblInfo);
	}
}
