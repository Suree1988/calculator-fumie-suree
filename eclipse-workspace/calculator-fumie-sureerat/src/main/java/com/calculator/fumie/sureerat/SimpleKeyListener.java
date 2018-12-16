package com.calculator.fumie.sureerat;

import java.awt.event.KeyEvent;
/**
 * The user can't be use complete 
 * the number by keyboard to our calculator.
 * @author Sureerat and Fumie
 *
 */

public class SimpleKeyListener implements java.awt.event.KeyListener{

	 public SimpleKeyListener() {}
	  
	  public void keyTyped(KeyEvent evt) {
	    char c = evt.getKeyChar();
	    if ((!Character.isDigit(c)) && (c != '\b') && (c != ''))
	    {
	      evt.consume();
	    }
	  }
	  
	  public void keyPressed(KeyEvent arg0) {}
	  
	  public void keyReleased(KeyEvent arg0) {}
}
