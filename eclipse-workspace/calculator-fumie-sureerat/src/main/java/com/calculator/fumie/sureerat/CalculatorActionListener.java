package com.calculator.fumie.sureerat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class is extending CalculatorJFrame class
 * and implementing ActionListener
 * also implementing two interfaces, 
 * culatorBasicOperationsInterface and CalculatorAdvancedOperationsInterface.
 *
 * @author Sureerat and Fumie
 *
 */

public class CalculatorActionListener extends CalculatorJFrame
implements ActionListener, CalculatorBasicOperationsInterface, CalculatorAdvancedOperationsInterface{

	 private double firstNumber;
	 private double secondNumber;
	 private double result;
	 private String enterNumber;
	 private String operation;
	 private String formatNum;
	  
	 public CalculatorActionListener() {
	    butt0.addActionListener(this);
	    butt1.addActionListener(this);
	    butt2.addActionListener(this);
	    butt3.addActionListener(this);
	    butt4.addActionListener(this);
	    butt5.addActionListener(this);
	    butt6.addActionListener(this);
	    butt7.addActionListener(this);
	    butt8.addActionListener(this);
	    butt9.addActionListener(this);
	    buttAC.addActionListener(this);
	    buttPlus.addActionListener(this);
	    buttSub.addActionListener(this);
	    buttMulti.addActionListener(this);
	    buttDividion.addActionListener(this);
	    buttPercent.addActionListener(this);
	    buttResult.addActionListener(this);
	    buttPoint.addActionListener(this);
	    buttSin.addActionListener(this);
	    buttCos.addActionListener(this);
	    buttTan.addActionListener(this);
	    buttRoot.addActionListener(this);
	    buttX2.addActionListener(this);
	    buttX3.addActionListener(this);
	  }
	 
//Listener 
	 public void actionPerformed(ActionEvent e) {
	    
	      if (e.getSource() == butt0) {
	        enterNumber = (textField.getText() + butt0.getText());
	        textField.setText(enterNumber);
	      }
	      else if (e.getSource() == butt1) {
	        enterNumber = (textField.getText() + butt1.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt2) {
	        enterNumber = (textField.getText() + butt2.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt3) {
	        enterNumber = (textField.getText() + butt3.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt4) {
	        enterNumber = (textField.getText() + butt4.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt5) {
	        enterNumber = (textField.getText() + butt5.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt6) {
	        enterNumber = (textField.getText() + butt6.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt7) {
	        enterNumber = (textField.getText() + butt7.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt8) {
	        enterNumber = (textField.getText() + butt8.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == butt9) {
	        enterNumber = (textField.getText() + butt9.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == buttAC) {
	        textField.setText(null);
	      } else if (e.getSource() == buttPlus) {
	        addition();
	      } else if (e.getSource() == buttSub) {
	        subtraction();
	      } else if (e.getSource() == buttMulti) {
	        multiplication();
	      } else if (e.getSource() == buttDividion) {
	        division();
	      } else if (e.getSource() == buttPercent) {
	        mod();
	      } else if (e.getSource() == buttResult) {
	        EqualTo();
	      } else if (e.getSource() == buttPoint) {
	        enterNumber = (textField.getText() + buttPoint.getText());
	        textField.setText(enterNumber);
	      } else if (e.getSource() == buttSin) {
	        sine();
	      } else if (e.getSource() == buttCos) {
	        cosine();
	      } else if (e.getSource() == buttTan) {
	        tangent();
	      } else if (e.getSource() == buttRoot) {
	        sqrt();
	      } else if (e.getSource() == buttX2) {
	        x2();
	      } else if (e.getSource() == buttX3) {
	        x3();
	      }
	   
	  }
	  

	  public void addition() {
		//convert number from textField to be the double argument  
	    firstNumber = Double.parseDouble(textField.getText());
	    
	    //The text will disappear after clicking the plus button.
	    textField.setText("");
	    operation = "+";
	  }
	  

	  public void subtraction() {
	    firstNumber = Double.parseDouble(textField.getText());
	    textField.setText("");
	    operation = "-";
	  }
	  

	  public void multiplication() {
	    firstNumber = Double.parseDouble(textField.getText());
	    textField.setText("");
	    operation = "x";
	  }
	  


	public void division() {
	    firstNumber = Double.parseDouble(textField.getText());
	    textField.setText("");
	    operation = "÷";
	  }
	  


	public void mod() {
	    firstNumber = Double.parseDouble(textField.getText());
	    textField.setText("");
	    operation = "mod";
	  }
	  
	//For sine, cosine, tangent, sqrt, x2 and x3 methods 
	//The user will see the answer directly after pressing these buttons.
	public void sine() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = Math.sin(firstNumber);
	    
	    //Decimal numbers are limited to ten digits only. 
	    formatNum = String.format("%.10f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	  }
	  

	public void cosine() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = Math.cos(firstNumber);
	    formatNum = String.format("%.10f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	  }
	  

	  public void tangent() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = Math.tan(firstNumber);
	    formatNum = String.format("%.10f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	  }
	  

	  public void sqrt() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = Math.sqrt(firstNumber);
	    formatNum = String.format("%.10f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	  }
	  

	  public void x2() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = (firstNumber * firstNumber);
	    formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	   
	  }
	  

	  public void x3() {
	    firstNumber = Double.parseDouble(String.valueOf(textField.getText()));
	    result = (firstNumber * firstNumber * firstNumber);
	    formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	    textField.setText(String.valueOf(formatNum));
	  }

	  //The code is for when the user presses the equals button,
	  //the answer is displayed in textField. 
	  public void EqualTo() {
	    secondNumber = Double.parseDouble(textField.getText());
	    
	    if (operation == "+") {
	      result = (firstNumber + secondNumber);
	      formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	      textField.setText(formatNum);
	    }
	    else if (operation == "-") {
	      result = (firstNumber - secondNumber);
	      formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	      textField.setText(formatNum);
	    } else if (operation == "x") {
	      result = (firstNumber * secondNumber);
	      formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	      textField.setText(formatNum);
	    } else if (operation == "÷") {
	      result = (firstNumber / secondNumber);
	      formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	      textField.setText(formatNum);
	    } else if (operation == "mod") {
	      result = (firstNumber % secondNumber);
	      formatNum = String.format("%.2f", new Object[] { Double.valueOf(result) });
	      textField.setText(formatNum);
	    }
	  }

	 /**
	  * All these getters and setters use for the Unit test
	  * @param firstNumber
	  */
	  public void setFirstNumber(double firstNumber) {
		  this.firstNumber = firstNumber;
	  }
	  
	  /**
	   * 
	   * @param secondNumber
	   */
	  public void setSecondNumber(double secondNumber) {
		  this.secondNumber = secondNumber;
	  }
	  
	  /**
	   * 
	   * @param operation
	   */
	  public void setOperation(String operation) {
		  this.operation = operation;
	  }
	  
	  /**
	   * 
	   * @return formatNum;
	   */
	  public String getFormatNum() {
		return formatNum;
	}
	  
	  /**
	   * 
	   * @return result;
	   */
	  public double getResult() {
		return result;
	}
	  

}
