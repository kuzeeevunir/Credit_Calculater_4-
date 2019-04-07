import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Credit_Calculator_4_ChangePasswordForm extends JFrame {
	private JButton button1 = new JButton("Сменить пароль");
	private JButton button2 = new JButton("Отмена");
	private JTextField input = new JTextField("", 5);
	private JTextField input2 = new JTextField("", 5);
	private JLabel label = new JLabel("Старый пароль");
	private JLabel label2 = new JLabel("Новый пароль");


public Credit_Calculator_4_ChangePasswordForm() {
	super("Вход");
	this.setBounds(100, 100, 400, 100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container container = this.getContentPane();
	container.setLayout(new GridLayout(3, 2, 2, 2));
	container.add(label);
	container.add(label2);
	container.add(input);
	container.add(input2);

	
	//button1.addActionListener(new SmenaPass ());
	button2.addActionListener(new ButtonEventListener ());
	container.add(button1);
	container.add(button2);
}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed (ActionEvent x) {
			Credit_Calculator_4_AuthorizationForm exam5 = new Credit_Calculator_4_AuthorizationForm();
			exam5.setVisible(true);
		}
	}
}