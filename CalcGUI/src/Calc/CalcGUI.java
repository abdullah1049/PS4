// Abdullah AL-Sinaidi

package Calc;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JSplitPane;

public class CalcGUI {

	private JFrame frame;
	private JTextField Inv_amount;
	private JTextField YEARS;
	private JTextField RATE;
	private JTextField FUTURE;
	double calc_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
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
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Get Future Value, PS4");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Investment  Amount");
		lblNewLabel.setBounds(36, 44, 142, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(36, 80, 142, 25);
		frame.getContentPane().add(lblYears);
		
		JLabel lblAnnualInteresetRate = new JLabel("Annual Interest Rate");
		lblAnnualInteresetRate.setBounds(36, 116, 142, 25);
		frame.getContentPane().add(lblAnnualInteresetRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(36, 152, 142, 25);
		frame.getContentPane().add(lblFutureValue);
		
		Inv_amount = new JTextField();
		Inv_amount.setBounds(207, 44, 109, 25);
		frame.getContentPane().add(Inv_amount);
		Inv_amount.setColumns(10);
		
		YEARS = new JTextField();
		YEARS.setColumns(10);
		YEARS.setBounds(207, 82, 109, 25);
		frame.getContentPane().add(YEARS);
		
		RATE = new JTextField();
		RATE.setColumns(10);
		RATE.setBounds(207, 118, 109, 25);
		frame.getContentPane().add(RATE);
		
		FUTURE = new JTextField();
		FUTURE.setColumns(10);
		FUTURE.setBounds(207, 154, 109, 25);
		FUTURE.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(FUTURE);
		
		// button to make the event (calculate the future value)
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(207, 188, 109, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double investment = Double.parseDouble(Inv_amount.getText());
				double years = Double.parseDouble(YEARS.getText());
				double annual_interest_rate = Double.parseDouble(RATE.getText());
				Calculate total = new Calculate();
				calc_total = total.get_future(investment, years, annual_interest_rate);
				FUTURE.setText("$" +calc_total);	
			}
			
		});
	
	}
}
