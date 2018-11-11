package scientificCalculato;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
/**
 * 
 * @author Suree och Fumie
 *
 */
public class CalculatorFrame extends JFrame {
	private JFrame frame  			= new JFrame();
	protected JTextField textField 	= new JTextField();
	protected JButton buttDividion 	= new JButton("\u00F7");
	protected JButton buttPlus 		= new JButton("+");
	protected JButton buttSub 		= new JButton("-");
	protected JButton buttMulti 	= new JButton("x");
	protected JButton buttPercent 	= new JButton("mod");
	protected JButton buttResult 	= new JButton("=");
	protected JButton buttPoint 	= new JButton(".");
	protected JButton buttAC 		= new JButton("AC");
	protected JButton buttSin 		= new JButton("sin");
	protected JButton buttX3 		= new JButton("x³");
	protected JButton buttX2 			= new JButton("x²");
	protected JButton buttCos 		= new JButton("cos");
	protected JButton buttTan 		= new JButton("tan");
	protected JButton buttRoot 		= new JButton("\u221A");
	protected JButton butt0			= new JButton("0");
	protected JButton butt1			= new JButton("1");
	protected JButton butt2			= new JButton("2");
	protected JButton butt3			= new JButton("3");
	protected JButton butt4			= new JButton("4");
	protected JButton butt5			= new JButton("5");
	protected JButton butt6			= new JButton("6");
	protected JButton butt7			= new JButton("7");
	protected JButton butt8			= new JButton("8");
	protected JButton butt9			= new JButton("9");
	
	/**
	 * Initialize the contents of the frame.
	 */
	public CalculatorFrame() {
		// Buttons 0-9.
		butt0.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt0.setBounds(110, 414, 80, 49); // button position.
		frame.getContentPane().add(butt0);
		
		butt1.setBackground(UIManager.getColor("Button.shadow"));
		butt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt1.setBounds(110, 216, 80, 49);
		frame.getContentPane().add(butt1);
		
		butt2.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt2.setBackground(UIManager.getColor("Button.shadow"));
		butt2.setBounds(217, 216, 80, 49);
		frame.getContentPane().add(butt2);
		
		butt3.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt3.setBackground(UIManager.getColor("Button.shadow"));
		butt3.setBounds(323, 216, 80, 49);
		frame.getContentPane().add(butt3);
		
		butt4.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt4.setBackground(UIManager.getColor("Button.shadow"));
		butt4.setBounds(110, 280, 80, 49);
		frame.getContentPane().add(butt4);
		
		butt5.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt5.setBackground(UIManager.getColor("Button.shadow"));
		butt5.setBounds(217, 280, 80, 49);
		frame.getContentPane().add(butt5);
		
		butt6.setBackground(UIManager.getColor("Button.shadow"));
		butt6.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt6.setBounds(323, 281, 80, 49);
		frame.getContentPane().add(butt6);
		
		butt7.setBackground(UIManager.getColor("Button.shadow"));
		butt7.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt7.setBounds(110, 346, 80, 49);
		frame.getContentPane().add(butt7);
		
		butt8.setBackground(UIManager.getColor("Button.shadow"));
		butt8.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt8.setBounds(217, 346, 80, 49);
		frame.getContentPane().add(butt8);
		
		butt9.setFont(new Font("Tahoma", Font.BOLD, 18));
		butt9.setBackground(UIManager.getColor("Button.shadow"));
		butt9.setBounds(323, 346, 80, 49);
		frame.getContentPane().add(butt9);
			
		// x³ button
		buttX3.setBackground(UIManager.getColor("Button.shadow"));
		buttX3.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttX3.setBounds(15, 150, 80, 49);
		frame.getContentPane().add(buttX3);
		
		// x² button.
		buttX2.setBackground(UIManager.getColor("Button.shadow"));
		buttX2.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttX2.setBounds(110, 150, 80, 49);
		frame.getContentPane().add(buttX2);
		
		// Sine button.
		buttSin.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttSin.setBackground(UIManager.getColor("Button.shadow"));
		buttSin.setBounds(15, 215, 80, 49);
		frame.getContentPane().add(buttSin);
		
		// Cosine button.
		buttCos.setBackground(UIManager.getColor("Button.shadow"));
		buttCos.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttCos.setBounds(15, 280, 80, 49);
		frame.getContentPane().add(buttCos);
		
		// Tangent button.
		buttTan.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttTan.setBackground(UIManager.getColor("Button.shadow"));
		buttTan.setBounds(15, 346, 80, 49);
		frame.getContentPane().add(buttTan);
		
		// Sqrt button.
		buttRoot.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttRoot.setBackground(UIManager.getColor("Button.shadow"));
		buttRoot.setBounds(217, 150, 80, 49);
		frame.getContentPane().add(buttRoot);
		
		// "." button.
		buttPoint.setFont(new Font("Tahoma", Font.BOLD, 25));
		buttPoint.setBackground(UIManager.getColor("Button.shadow"));
		buttPoint.setBounds(217, 414, 80, 49);
		frame.getContentPane().add(buttPoint);
		
		// "=" button.
		buttResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttResult.setBackground(UIManager.getColor("Button.shadow"));
		buttResult.setBounds(428, 352, 80, 114);
		frame.getContentPane().add(buttResult);
		
		// "%" button.
		buttPercent.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttPercent.setBackground(UIManager.getColor("Button.shadow"));
		buttPercent.setBounds(15, 414, 80, 49);
		frame.getContentPane().add(buttPercent);
		
		// Multiplication  button.
		buttMulti.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttMulti.setBackground(UIManager.getColor("Button.shadow"));
		buttMulti.setBounds(428, 216, 80, 49);
		frame.getContentPane().add(buttMulti);
		
		// Subtraction button.
		buttSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttSub.setBackground(UIManager.getColor("Button.shadow"));
		buttSub.setBounds(428, 281, 80, 49);
		frame.getContentPane().add(buttSub);
		
		// Addition button.
		
		buttPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttPlus.setBackground(UIManager.getColor("Button.shadow"));
		buttPlus.setBounds(323, 413, 80, 49);
		frame.getContentPane().add(buttPlus);
		
		// Division button.
		buttDividion.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttDividion.setBackground(UIManager.getColor("Button.shadow"));
		buttDividion.setBounds(428, 150, 80, 49);
		frame.getContentPane().add(buttDividion);
		
		// Cancel button with listener.
		buttAC.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttAC.setBackground(UIManager.getColor("Button.shadow"));
		buttAC.setBounds(323, 151, 80, 49);
		frame.getContentPane().add(buttAC);
		
		// Text field.
		textField.setFont(new Font("Dialog", Font.BOLD, 50));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 16, 493, 104);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Frame.
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 255, 153));
		frame.setBackground(new Color(255, 51, 255));
		frame.setForeground(Color.DARK_GRAY);
		frame.setTitle("Scientific Calculator. Version 1.00");
		frame.setBounds(100, 100, 534, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
	}
	
	
}
	
