package test;
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.JFrame;
import javax.swing.JTextField;

public class testOne extends Frame implements ActionListener {
	
	JFrame frame;
	Font font1;
	JTextField text1;
	JTextField inputAmount;
	
	TextPrompt inputAmountPrompt;
	
	Image image;
	
	   public testOne () {
		   frame = new JFrame("Sample");
		   font1 = new Font("SansSerif", Font.BOLD, 20);
		   text1 = new JTextField("Amount");
		   inputAmount= new JTextField(10);
		   inputAmountPrompt = new TextPrompt("Enter the amount", inputAmount);
		   image = new Image();
		   frame.setLayout(new FlowLayout());
		   frame.setTitle("AWT Counter");  // "super" Frame sets its title
		   frame.setSize(250, 250);        // "super" Frame sets its initial window size
		   frame.setVisible(true);    
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		   text1.setEditable(false);
		   text1.setFont(font1);
		   
		   inputAmount.setEditable(true);
		   inputAmount.setFont(font1);
		   
		   inputAmountPrompt.changeAlpha(0.75f);
		   inputAmountPrompt.changeStyle(Font.ITALIC);
		   
		   frame.add(text1);
		   frame.add(inputAmount);
	   }
	
	 
	   // The entry main() method
	   public static void main(String[] args) {
		   EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new testOne();
	            }
	        });
	   }
	   
	   public void actionPerformed(ActionEvent e) {
		   
	   }
	   

}
