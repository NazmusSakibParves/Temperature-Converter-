import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ConversionActionListener implements ActionListener {
	MyConversion c;
	String eq1 = null;
	String eq2 = null;
	String str = null;
	
	double me;
	double Celsious;
	double Farenhite;
	
	public ConversionActionListener() {
		
	}
	public ConversionActionListener(MyConversion mc){ 
		this.c = mc;
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		JButton source = (JButton)obj;
		try{
			if(source.equals(this.c.btn1)){
		    str = ae.getActionCommand();
			eq1 = c.txt1.getText();
			System.out.println("you press (C->F) Button");
			
			me = Double.valueOf(eq1);
			Farenhite = (me*9+160)/5;
			c.txt2.setText(String.valueOf(Farenhite));
		}
			
		else if(source.equals(this.c.btn2)){
		str = ae.getActionCommand();
		eq1 = c.txt3.getText();
		System.out.println("you press (F->C) Button");
		
		me = Double.valueOf(eq1);
		Celsious = (me*5-160)/9;
		c.txt4.setText(String.valueOf(Celsious));
	}
	
		}catch(Exception e2){
			//JOptionPane.showInputDialog(null, "Invalid Input");
			JOptionPane.showInputDialog(str, "Invalid Input");
			//JOptionPane.showConfirmDialog(null, "error");
			JOptionPane.showMessageDialog(null, "Please Enter a Valid Input");
		}	
	 
  }
}