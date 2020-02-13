package simplecalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator {
	private JFrame frame = new JFrame("Calculator");
	private JTextArea txtScreen = new JTextArea();

	// Calculations
	String strnum1 = "";
	String strnum2 = "";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	String strTotal = "";
	int TotalValue = 0;
	private JButton equal = new JButton("=");
	// number buttons
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btn0 = new JButton("0");
	// operator buttons + = / - *
	private JButton btnplus = new JButton("+");
	private JButton btnminus = new JButton("-");
	private JButton btndivide = new JButton("/");
	private JButton btnmul = new JButton("*");

	public Calculator() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 450);
		frame.setResizable(false);
		frame.setLayout(null);

		// text screen attributes
		txtScreen.setSize(380, 100);
		txtScreen.setLocation(7, 7);
		txtScreen.setEditable(false);
		// 0
		btn0.setSize(80, 50);
		btn0.setLocation(120, 350);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("0");

			}
		});
		// 1 button
		btn1.setSize(80, 50);
		btn1.setLocation(20, 290);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("1");

			}
		});
		// 2 button
		btn2.setSize(80, 50);
		btn2.setLocation(120, 290);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("2");

			}
		});
		// 3 button
		btn3.setSize(80, 50);
		btn3.setLocation(220, 290);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("3");

			}
		});
		// 4 button
		btn4.setSize(80, 50);
		btn4.setLocation(20, 220);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("4");

			}
		});
		// 5 button
		btn5.setSize(80, 50);
		btn5.setLocation(120, 220);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("5");

			}
		});
		// 6 button
		btn6.setSize(80, 50);
		btn6.setLocation(220, 220);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("6");

			}
		});
		// 7 button
		btn7.setSize(80, 50);
		btn7.setLocation(20, 150);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("7");

			}
		});
		// 8 button
		btn8.setSize(80, 50);
		btn8.setLocation(120, 150);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("8");

			}
		});
		// 9 button
		btn9.setSize(80, 50);
		btn9.setLocation(220, 150);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("9");

			}
		});
		// divide / button
		btndivide.setSize(60, 50);
		btndivide.setLocation(320, 150);
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("/");

			}
		});
		// multiply button
		btnmul.setSize(60, 50);
		btnmul.setLocation(320, 200);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("*");

			}
		});
		// minus button
		btnminus.setSize(60, 50);
		btnminus.setLocation(320, 250);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("-");

			}
		});
		// plus button
		btnplus.setSize(60, 50);
		btnplus.setLocation(320, 300);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtScreen.append("+");

			}
		});
		// equal button
		equal.setSize(60, 50);
		equal.setLocation(320, 350);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtScreen.getText().contains("/")) {
					statement = txtScreen.getText().split("\\/");
					strnum1 = statement[0];
					strnum2 = statement[1];

					num1 = Integer.parseInt(strnum1);
					num2 = Integer.parseInt(strnum2);
					TotalValue = num1 / num2;
					strTotal = Integer.toString(TotalValue);
					txtScreen.setText(strTotal);
				} else if (txtScreen.getText().contains("+")) {
					statement = txtScreen.getText().split("\\+");
					strnum1 = statement[0];
					strnum2 = statement[1];

					num1 = Integer.parseInt(strnum1);
					num2 = Integer.parseInt(strnum2);
					TotalValue = num1 + num2;
					strTotal = Integer.toString(TotalValue);
					txtScreen.setText(strTotal);
				} else if (txtScreen.getText().contains("-")) {
					statement = txtScreen.getText().split("\\-");
					strnum1 = statement[0];
					strnum2 = statement[1];

					num1 = Integer.parseInt(strnum1);
					num2 = Integer.parseInt(strnum2);
					TotalValue = num1 - num2;
					strTotal = Integer.toString(TotalValue);
					txtScreen.setText(strTotal);
				}
				else if (txtScreen.getText().contains("*")) {
					statement = txtScreen.getText().split("\\*");
					strnum1 = statement[0];
					strnum2 = statement[1];

					num1 = Integer.parseInt(strnum1);
					num2 = Integer.parseInt(strnum2);
					TotalValue = num1 * num2;
					strTotal = Integer.toString(TotalValue);
					txtScreen.setText(strTotal);
				}
			}
		});

		// Add objects to Screen
		frame.add(txtScreen);
		frame.add(btn0);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);

		frame.add(btndivide);
		frame.add(btnminus);
		frame.add(btnmul);
		frame.add(btnplus);
		frame.add(equal);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
