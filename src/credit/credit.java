package credit;

import java.awt.Color; //подключение библиотеки визуальных компонентов
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;//подключение графического интерфейса пользовател€ (GUI)
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class credit   implements ActionListener {//обработчик событий кнопок

	JFrame frame = new JFrame();//подключени€ класс JFrame, окна программы
	JPanel panel = new JPanel();//подключени€ панели программы
	JLabel label1 = new JLabel();//подключение меток
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();
	JLabel label7 = new JLabel();
	JLabel label8 = new JLabel();
	JLabel label9 = new JLabel();
	JLabel label10 = new JLabel();
 
	JTextArea textarea1 = new JTextArea(1,10);//подключение текстовых полей
	JTextArea textarea2 = new JTextArea(1,10);
	JTextArea textarea3 = new JTextArea(1,10);
	JTextArea textarea4 = new JTextArea(1,10);
	JTextArea textarea5 = new JTextArea(1,10);
	JTextArea textarea6 = new JTextArea(1,10);
	JTextArea textarea7 = new JTextArea(1,10);
	JTextArea textarea8 = new JTextArea(1,10);
	JTextArea textarea9 = new JTextArea(1,10);
	JTextArea textarea10 = new JTextArea(1,10);
 
 
	JButton button1 = new JButton();//вставка кнопок
	JButton button2 = new JButton();
 
 	double number1, number2, number3, result, p,g,b,s,d,d1,d2,d3,d4,d5,d6;//создание глобальных переменных
		public credit(){//подключение публичных элементов с параметрами
		frame.setSize(1200,600);//установка размера программы
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle(" редитный калькул€тор");//наименование программы
	
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);//настройка цвета панели программы
		Border border = BorderFactory.createLineBorder(Color.BLUE,1);//установка цвета рамки
		panel.setBorder(border);//применение рамки

		panel.add(label1);
		label1.setText("—умма кредита (руб.)");//вывод метки
		label1.setLocation(10, 10);//расположение метки
		label1.setSize(300,100);
		label1.setForeground(Color.BLUE);//цыет метки
	
		panel.add(textarea1);//вывод текстового пол€ на рабочую панель
		textarea1.setBackground(Color.LIGHT_GRAY);//установление цвета фона
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,1);//установление цвета рамки
		textarea1.setBorder(tborder);
		Font font =new Font("arial",Font.BOLD,33);//установление параметров текста
		textarea1.setFont(font);
		textarea1.setForeground(Color.black);//установление цвета текста
		textarea1.setPreferredSize(new Dimension(10,10));
		textarea1.setLineWrap(true);
		textarea1.setSize(40,40);
					
		panel.add(label2);
		label2.setText("—рок погашени€ кредита (мес.)");
		label2.setLocation(40,100);
		label2.setSize(300,100);
		label2.setForeground(Color.BLUE);
		
		panel.add(textarea2);
		textarea2.setBackground(Color.LIGHT_GRAY);
		textarea2.setBorder(tborder);
		textarea2.setFont(font);
		textarea2.setForeground(Color.black);
		textarea2.setPreferredSize(new Dimension(10,10));
		textarea2.setLineWrap(true);
		textarea2.setSize(40,40);
			
		panel.add(label3);
		label3.setText("ѕроцентна€ ставка (%)");
		label3.setLocation(40,100);
		label3.setSize(300,100);
		label3.setForeground(Color.BLUE);
		panel.add(textarea3);
		textarea3.setBackground(Color.LIGHT_GRAY);
		textarea3.setBorder(tborder);
		textarea3.setFont(font);
		textarea3.setForeground(Color.black);
		textarea3.setPreferredSize(new Dimension(10,10));
		textarea3.setLineWrap(true);
		textarea3.setSize(40,40);
		
		panel.add(button1);//вывод в панель кнопок
		panel.add(button2);
		
		button1.setPreferredSize(new Dimension(300,40));//изменение размеров кнопки
		button2.setPreferredSize(new Dimension(300,40));
		
		button1.setText("ƒифференцированные платежи");//задание наименование кнопок
		button2.setText("јннуитентные платежи");
		
		button1.addActionListener(this);//установление активности кнопок
		button2.addActionListener(this);
		
		panel.add(label4);
		label4.setText("¬ывод общий платеж в мес€ц");
		label4.setLocation(10, 10);
		label4.setSize(300,100);
		label4.setForeground(Color.BLUE);
		panel.add(textarea4);
		textarea4.setBackground(Color.LIGHT_GRAY);
		textarea4.setBorder(tborder);
		textarea4.setFont(font);
		textarea4.setForeground(Color.black);
		textarea4.setPreferredSize(new Dimension(10,10));
		textarea4.setLineWrap(true);
		textarea4.setSize(40,40);
		
		panel.add(label5);
		label5.setText("");
		label5.setLocation(40,100);
		label5.setSize(300,100);
		label5.setForeground(Color.BLUE);
		panel.add(textarea5);
		textarea5.setBackground(Color.LIGHT_GRAY);
		textarea5.setBorder(tborder);
		textarea5.setFont(font);
		textarea5.setForeground(Color.black);
		textarea5.setPreferredSize(new Dimension(10,10));
		textarea5.setLineWrap(true);
		textarea5.setSize(40,40);
		
		panel.add(label6);
		label6.setText("");
		label6.setLocation(40,100);
		label6.setSize(300,100);
		label6.setForeground(Color.BLUE);
		panel.add(textarea6);
		textarea6.setBackground(Color.LIGHT_GRAY);
		textarea6.setBorder(tborder);
		textarea6.setFont(font);
		textarea6.setForeground(Color.black);
		textarea6.setPreferredSize(new Dimension(10,10));
		textarea6.setLineWrap(true);
		textarea6.setSize(40,40);
	
		panel.add(label7);
		label7.setText("");
		label7.setLocation(40,100);
		label7.setSize(300,100);
		label7.setForeground(Color.BLUE);
		panel.add(textarea7);
		textarea7.setBackground(Color.LIGHT_GRAY);
		textarea7.setBorder(tborder);
		textarea7.setFont(font);
		textarea7.setForeground(Color.black);
		textarea7.setPreferredSize(new Dimension(10,10));
		textarea7.setLineWrap(true);
		textarea7.setSize(40,40);
		
		panel.add(label8);
		label8.setText("");
		label8.setLocation(40,100);
		label8.setSize(300,100);
		label8.setForeground(Color.BLUE);
		panel.add(textarea8);
		textarea8.setBackground(Color.LIGHT_GRAY);
		textarea8.setBorder(tborder);
		textarea8.setFont(font);
		textarea8.setForeground(Color.black);
		textarea8.setPreferredSize(new Dimension(10,10));
		textarea8.setLineWrap(true);
		textarea8.setSize(40,40);
		
		panel.add(label9);
		label9.setText("");
		label9.setLocation(40,100);
		label9.setSize(300,100);
		label9.setForeground(Color.BLUE);
		panel.add(textarea9);
		textarea9.setBackground(Color.LIGHT_GRAY);
		textarea9.setBorder(tborder);
		textarea9.setFont(font);
		textarea9.setForeground(Color.black);
		textarea9.setPreferredSize(new Dimension(10,10));
		textarea9.setLineWrap(true);
		textarea9.setSize(40,40);
		
		panel.add(label10);
		label10.setText("");
		label10.setLocation(40,100);
		label10.setSize(300,100);
		label10.setForeground(Color.BLUE);
		panel.add(textarea10);
		textarea10.setBackground(Color.LIGHT_GRAY);
		textarea10.setBorder(tborder);
		textarea10.setFont(font);
		textarea10.setForeground(Color.black);
		textarea10.setPreferredSize(new Dimension(10,10));
		textarea10.setLineWrap(true);
		textarea10.setSize(40,40);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
			if (source==button2) {//расчет дифференцированного платежа
			number1=number_reader1();//установление переменных
			number2=number_reader2();
			number3=number_reader3();
			p=number3/(12*100);//задание формул
			g=Math.pow((1+p),number2);
			result=	number1*(p+(p/(g-1)));
			textarea4.setText(Double.toString(result));//вывод результата
		}
		
		
			if (source==button1) {//расчет аннуитентного платежа
			number1=number_reader1();//установление переменных
			number2=number_reader2();
			number3=number_reader3();
			int n=0;//задание формул
			b=number1/number2;
			d=number1-(b*n);
			s=d*(number1/12);
			d1=b+(number1-(b*0))*(number3/(100*12));
			d2=b+(number1-(b*1))*(number3/(100*12));
			d3=b+(number1-(b*2))*(number3/(100*12));
			d4=b+(number1-(b*3))*(number3/(100*12));
			d5=b+(number1-(b*4))*(number3/(100*12));
			d6=b+(number1-(b*5))*(number3/(100*12));
										
			textarea4.setText(Double.toString(b));//вывод результатов
			label5.setText("ѕервый мес€ц:");
			textarea5.setText(Double.toString(d1));
			
			label6.setText("¬торой мес€ц:");
			textarea6.setText(Double.toString(d2));
			
			label7.setText("“ретий мес€ц:");
			textarea7.setText(Double.toString(d3));
			
			label8.setText("„етвертый мес€ц:");
			textarea8.setText(Double.toString(d4));
			
			label9.setText("ѕ€тый мес€ц:");
			textarea9.setText(Double.toString(d5));
			
			label10.setText("Ўестой мес€ц:");
			textarea10.setText(Double.toString(d6));
		}	
		
	}	
	
	
	public double number_reader1(){//установление переменных
	
	double num1;
	String a;
	a=textarea1.getText();//изменение типов данных
	num1=Double.valueOf(a);
	return num1; 
	
	}
	
	public double number_reader2(){
	double  num2;
	String b;
	b=textarea2.getText();
	num2=Double.valueOf(b);
	return num2;
		
	}

	public double number_reader3(){
	double num3;
	String c;
	c=textarea3.getText();
	num3=Double.valueOf(c);
	return num3;	
	
	}

	
}
	
	
	
