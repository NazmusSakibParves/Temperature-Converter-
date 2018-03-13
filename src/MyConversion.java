import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyConversion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn1, btn2;
	JTextField txt1, txt2, txt3, txt4;
	FlowLayout flow = new FlowLayout();
	
	public MyConversion(MyConversion c) {
		
	}
public MyConversion() {
	this.setSize(250,200);
	this.setLocation(300, 300);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.initComponent();
	this.addComponent();
	this.addActionListner();
	this.addLayout();
}

public void initComponent(){
	this.btn1 = new JButton("C-->F");
	this.btn2 = new JButton("F-->C");
	
	this.txt1 = new JTextField(5);
	this.txt2 = new JTextField(5);
	this.txt3 = new JTextField(5);
	this.txt4 = new JTextField(5);
}

public void addComponent(){
	this.add(txt1);
	this.add(btn1);
	this.add(txt2);
	this.add(txt3);
	this.add(btn2);
	this.add(txt4);
}

public void addLayout(){
	this.setLayout(flow);
}

public void addActionListner(){
ConversionActionListener Listener = new ConversionActionListener(this);	
this.btn1.addActionListener(Listener);
this.btn2.addActionListener(Listener);
}

}
