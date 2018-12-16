package com.calculator.fumie.sureerat;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
/**
 * Here is a frame that holds the bottoms. 
 * @author Sureerat and Fumie
 *
 */
public class CalculatorJFrame {
	 protected JFrame frame 		= new JFrame();
	 protected JTextField textField = new JTextField();
	 protected JButton buttDividion = new JButton("÷");
	 protected JButton buttPlus 	= new JButton("+");
	 protected JButton buttSub 		= new JButton("-");
	 protected JButton buttMulti 	= new JButton("x");
	 protected JButton buttPercent 	= new JButton("mod");
	 protected JButton buttResult 	= new JButton("=");
	 protected JButton buttPoint 	= new JButton(".");
	 protected JButton buttAC 		= new JButton("AC");
	 protected JButton buttSin 		= new JButton("sin");
	 protected JButton buttX3 		= new JButton("x3");
	 protected JButton buttX2 		= new JButton("x2");
	 protected JButton buttCos 		= new JButton("cos");
	 protected JButton buttTan 		= new JButton("tan");
	 protected JButton buttRoot 	= new JButton("√");
	 protected JButton butt0 		= new JButton("0");
	 protected JButton butt1 		= new JButton("1");
	 protected JButton butt2 		= new JButton("2");
	 protected JButton butt3 		= new JButton("3");
	 protected JButton butt4 		= new JButton("4");
	 protected JButton butt5 		= new JButton("5");
	 protected JButton butt6 		= new JButton("6");
	 protected JButton butt7 		= new JButton("7");
	 protected JButton butt8 		= new JButton("8");
	 protected JButton butt9 		= new JButton("9");
	  
	 public CalculatorJFrame() {
	    butt0.setFont(new Font("Tahoma", 1, 18));
	    butt0.setBounds(110, 414, 80, 49);
	    frame.getContentPane().add(butt0);
	    
	    butt1.setBackground(UIManager.getColor("Button.shadow"));
	    butt1.setFont(new Font("Tahoma", 1, 18));
	    butt1.setBounds(110, 216, 80, 49);
	    frame.getContentPane().add(butt1);
	    
	    butt2.setFont(new Font("Tahoma", 1, 18));
	    butt2.setBackground(UIManager.getColor("Button.shadow"));
	    butt2.setBounds(217, 216, 80, 49);
	    frame.getContentPane().add(butt2);
	    
	    butt3.setFont(new Font("Tahoma", 1, 18));
	    butt3.setBackground(UIManager.getColor("Button.shadow"));
	    butt3.setBounds(323, 216, 80, 49);
	    frame.getContentPane().add(butt3);
	    
	    butt4.setFont(new Font("Tahoma", 1, 18));
	    butt4.setBackground(UIManager.getColor("Button.shadow"));
	    butt4.setBounds(110, 280, 80, 49);
	    frame.getContentPane().add(butt4);
	    
	    butt5.setFont(new Font("Tahoma", 1, 18));
	    butt5.setBackground(UIManager.getColor("Button.shadow"));
	    butt5.setBounds(217, 280, 80, 49);
	    frame.getContentPane().add(butt5);
	    
	    butt6.setBackground(UIManager.getColor("Button.shadow"));
	    butt6.setFont(new Font("Tahoma", 1, 18));
	    butt6.setBounds(323, 281, 80, 49);
	    frame.getContentPane().add(butt6);
	    
	    butt7.setBackground(UIManager.getColor("Button.shadow"));
	    butt7.setFont(new Font("Tahoma", 1, 18));
	    butt7.setBounds(110, 346, 80, 49);
	    frame.getContentPane().add(butt7);
	    
	    butt8.setBackground(UIManager.getColor("Button.shadow"));
	    butt8.setFont(new Font("Tahoma", 1, 18));
	    butt8.setBounds(217, 346, 80, 49);
	    frame.getContentPane().add(butt8);
	    
	    butt9.setFont(new Font("Tahoma", 1, 18));
	    butt9.setBackground(UIManager.getColor("Button.shadow"));
	    butt9.setBounds(323, 346, 80, 49);
	    frame.getContentPane().add(butt9);
	    

	    buttX3.setBackground(UIManager.getColor("Button.shadow"));
	    buttX3.setFont(new Font("Tahoma", 1, 18));
	    buttX3.setBounds(15, 150, 80, 49);
	    frame.getContentPane().add(buttX3);
	    

	    buttX2.setBackground(UIManager.getColor("Button.shadow"));
	    buttX2.setFont(new Font("Tahoma", 1, 18));
	    buttX2.setBounds(110, 150, 80, 49);
	    frame.getContentPane().add(buttX2);
	    

	    buttSin.setFont(new Font("Tahoma", 1, 18));
	    buttSin.setBackground(UIManager.getColor("Button.shadow"));
	    buttSin.setBounds(15, 215, 80, 49);
	    frame.getContentPane().add(buttSin);
	    

	    buttCos.setBackground(UIManager.getColor("Button.shadow"));
	    buttCos.setFont(new Font("Tahoma", 1, 18));
	    buttCos.setBounds(15, 280, 80, 49);
	    frame.getContentPane().add(buttCos);
	    

	    buttTan.setFont(new Font("Tahoma", 1, 18));
	    buttTan.setBackground(UIManager.getColor("Button.shadow"));
	    buttTan.setBounds(15, 346, 80, 49);
	    frame.getContentPane().add(buttTan);
	    

	    buttRoot.setFont(new Font("Tahoma", 1, 18));
	    buttRoot.setBackground(UIManager.getColor("Button.shadow"));
	    buttRoot.setBounds(217, 150, 80, 49);
	    frame.getContentPane().add(buttRoot);
	    

	    buttPoint.setFont(new Font("Tahoma", 1, 25));
	    buttPoint.setBackground(UIManager.getColor("Button.shadow"));
	    buttPoint.setBounds(217, 414, 80, 49);
	    frame.getContentPane().add(buttPoint);
	    

	    buttResult.setFont(new Font("Tahoma", 1, 18));
	    buttResult.setBackground(UIManager.getColor("Button.shadow"));
	    buttResult.setBounds(428, 352, 80, 114);
	    frame.getContentPane().add(buttResult);
	    

	    buttPercent.setFont(new Font("Tahoma", 1, 16));
	    buttPercent.setBackground(UIManager.getColor("Button.shadow"));
	    buttPercent.setBounds(15, 414, 80, 49);
	    frame.getContentPane().add(buttPercent);
	    

	    buttMulti.setFont(new Font("Tahoma", 1, 18));
	    buttMulti.setBackground(UIManager.getColor("Button.shadow"));
	    buttMulti.setBounds(428, 216, 80, 49);
	    frame.getContentPane().add(buttMulti);
	    

	    buttSub.setFont(new Font("Tahoma", 1, 18));
	    buttSub.setBackground(UIManager.getColor("Button.shadow"));
	    buttSub.setBounds(428, 281, 80, 49);
	    frame.getContentPane().add(buttSub);
	    


	    buttPlus.setFont(new Font("Tahoma", 1, 18));
	    buttPlus.setBackground(UIManager.getColor("Button.shadow"));
	    buttPlus.setBounds(323, 413, 80, 49);
	    frame.getContentPane().add(buttPlus);
	    

	    buttDividion.setFont(new Font("Tahoma", 1, 18));
	    buttDividion.setBackground(UIManager.getColor("Button.shadow"));
	    buttDividion.setBounds(428, 150, 80, 49);
	    frame.getContentPane().add(buttDividion);
	    

	    buttAC.setFont(new Font("Tahoma", 1, 16));
	    buttAC.setBackground(UIManager.getColor("Button.shadow"));
	    buttAC.setBounds(323, 151, 80, 49);
	    frame.getContentPane().add(buttAC);
	    

	    textField.setFont(new Font("Dialog", 1, 50));
	    textField.setHorizontalAlignment(4);
	    textField.setBounds(15, 16, 493, 104);
	    frame.getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    textField.addKeyListener(new SimpleKeyListener());
	    

	    frame.setResizable(false);
	    frame.getContentPane().setBackground(new Color(0, 255, 153));
	    frame.setBackground(new Color(255, 51, 255));
	    frame.setForeground(Color.DARK_GRAY);
	    frame.setTitle("Calculator_Fumie_Sureerat. Version 1.00");
	    frame.setBounds(100, 100, 534, 534);
	    frame.setDefaultCloseOperation(3);
	    frame.getContentPane().setLayout(null);
	    frame.setVisible(true);
	  
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


}
