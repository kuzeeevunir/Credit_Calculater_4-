import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Credit_Calculator_4_CalcForm extends JFrame 
{ 

public JTextField vvod; 
public JTextField vvod1; 
public JTextField vvod2; 
public JButton knopka; 
public JLabel vuvod; 
public JLabel vuvod1; 
public JLabel vuvod2; 
public JLabel vuvod3; 

public Credit_Calculator_4_CalcForm() 

{ 
setTitle("Кредитный калькулятор"); 
setLocation(400,400); 
setSize(700,200); 
setDefaultCloseOperation(EXIT_ON_CLOSE); 

Container con = getContentPane(); 
con.setLayout(new FlowLayout()); 

vvod = new JTextField(45); 
con.add(vvod); 
String word = (vvod.getText()); 


vuvod1 = new JLabel("Начальная сумма"); 
con.add(vuvod1); 

vvod1 = new JTextField(45); 
con.add(vvod1); 
String word1 = (vvod1.getText()); 


vuvod2 = new JLabel("Количество месяцев"); 
con.add(vuvod2); 

vvod2 = new JTextField(50); 
con.add(vvod2); 
String word2 = (vvod2.getText()); 

vuvod3 = new JLabel("Процентная ставка"); 
con.add(vuvod3); 

knopka = new JButton("Рассчитать"); 
knopka.setActionCommand("123"); 
con.add(knopka); 

vuvod = new JLabel(); 
con.add(vuvod); 

knopka.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 
double n; 
n = sum(vvod,vvod1,vvod2); 
vuvod.setText(Double.toString(n)); 
} 
}); 
} 
double sum(JTextField vod,JTextField vod1, JTextField vod2){ 
int sk = Integer.parseInt(vod.getText()); 
int kp = Integer.parseInt(vod1.getText()); 
int ps = Integer.parseInt(vod2.getText()); 
double np = 0; 
double od = sk / (double)kp; 
for(int i = 0; i < kp; i++){ 
np += ((double)sk - i * od) * ps / 1200; 
} 
return sk + np; 
} 
}