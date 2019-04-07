import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Credit_Calculator_4_AuthorizationForm extends JFrame {
	private JButton button1 = new JButton("Войти");
	private JButton button2 = new JButton("Сменить пароль");
	private JTextField input = new JTextField("", 5);
	private JTextField input2 = new JTextField("", 5);
	private JLabel label = new JLabel("Логин");
	private JLabel label2 = new JLabel("Пароль");


public Credit_Calculator_4_AuthorizationForm() {
	super("Вход");
	this.setBounds(100, 100, 400, 100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container container = this.getContentPane();
	container.setLayout(new GridLayout(3, 2, 2, 2));
	container.add(label);
	container.add(label2);
	container.add(input);
	container.add(input2);

	
	button1.addActionListener(new ButtonEventListener1 ());
	button2.addActionListener(new ButtonEventListener2 ());
	container.add(button1);
	container.add(button2);
}
	class ButtonEventListener2 extends Credit_Calculator_4_ChangePasswordForm implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			Credit_Calculator_4_ChangePasswordForm exam4 = new Credit_Calculator_4_ChangePasswordForm();
			exam4.setVisible(true);
		}
	}
	class ButtonEventListener1 extends Credit_Calculator_4_CalcForm implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			Credit_Calculator_4_CalcForm exam6 = new Credit_Calculator_4_CalcForm();
			exam6.setVisible(true);
		}
	}
}
