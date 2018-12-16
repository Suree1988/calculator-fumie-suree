package com.calculator_fumie_sureerat;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.fumie.sureerat.CalculatorActionListener;
/**
 * We have tested all the operations with random number, 
 * both negative and positive, from the CalculatorActionListener class 
 * totally eleven tests with logging.
 * We have set for-loop to fifty iterations to each test method
 * @author Sureerat and Fumie
 *
 */
public class CalculatorActionListenerTest {
	
	CalculatorActionListener c = new CalculatorActionListener();
	Random random = new Random();
	double firstNum;
	double secondNum;
	double result;
	String resultString;
	private static final Logger logger = Logger.getLogger(CalculatorActionListenerTest.class.getName());
	

	@Test
	public void testAddition() {
		logger.info("Startar testAddition");
		for (int i = 0; i < 50; i++) {
			
			firstNum = (random.nextDouble() *20 - 10); 
			secondNum = (random.nextDouble()*20 - 10); 
			
			result = firstNum + secondNum;
			resultString=String.format("%.2f", new Object[] { Double.valueOf(result) });
			
			c.setFirstNumber(firstNum);
			c.getTextField().setText(Double.toString(secondNum));;
			c.setOperation("+");
			c.EqualTo();
			logger.info("Running test with first random number: " + firstNum +
					" and second random number: " + secondNum + " expecting: " + resultString);
			
			assertTrue(c.getFormatNum().equals(resultString));
			
		
		}
	}
	
	@Test
	public void testSubstraction() {
		logger.info("startar testSubstaction");
		for (int i = 0; i < 50; i++) {
			
			firstNum = (random.nextDouble() *20 - 10); 
			secondNum = (random.nextDouble()*20 - 10); 
			
			result = firstNum - secondNum;
			resultString=String.format("%.2f", new Object[] { Double.valueOf(result) });
			
			c.setFirstNumber(firstNum);
			c.getTextField().setText(Double.toString(secondNum));
			c.setOperation("-");
			c.EqualTo();
			logger.info("Running test with first random number: " + firstNum +
					" and second random number: " + secondNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testMultiplication() {
		logger.info("startar testMultiplication");
		for (int i = 0; i < 50; i++) {
			
			firstNum = (random.nextDouble() *20 - 10); 
			secondNum = (random.nextDouble()*20 - 10); 
			
			result = firstNum * secondNum;
			resultString=String.format("%.2f", new Object[] { Double.valueOf(result) });
			
			c.setFirstNumber(firstNum);
			c.getTextField().setText(Double.toString(secondNum));;
			c.setOperation("x");
			c.EqualTo();
			logger.info("Running test with first random number: " + firstNum +
					" and second random number: " + secondNum + " expecting: " + resultString);
			
			assertTrue(c.getFormatNum().equals(resultString));
			
		}
	}
	
	@Test
	public void testDivision() {
		logger.info("startar testDivision");
		for (int i = 0; i < 50; i++) {
			
			firstNum = (random.nextDouble() *20 - 10); 
			secondNum = (random.nextDouble()*20 - 10); 
	
			result = firstNum / secondNum;
			resultString=String.format("%.2f", new Object[] { Double.valueOf(result) });
			
			c.setFirstNumber(firstNum);
			c.getTextField().setText(Double.toString(secondNum));
			c.setOperation("÷");
			c.EqualTo();
			logger.info("Running test with first random number: " + firstNum +
					" and second random number: " + secondNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testMod() {
		logger.info("startar testMod");
		for (int i = 0; i < 50; i++) {
			
			firstNum = (random.nextDouble() *20 - 10); 
			secondNum = (random.nextDouble()*20 - 10); 
			
			result = firstNum % secondNum;
			resultString=String.format("%.2f", new Object[] { Double.valueOf(result) });
			
			c.setFirstNumber(firstNum);
			c.getTextField().setText(Double.toString(secondNum));;
			c.setOperation("mod");
			c.EqualTo();
			logger.info("Running test with first random number: " + firstNum +
					" and second random number: " + secondNum + " expecting: " + resultString);
			
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testSine() {
		
		logger.info("startar testSine");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = Math.sin(firstNum);
			resultString = String.format("%.10f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.sine();
			logger.info("Running test sine with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testCosine() {
		
		logger.info("startar testCosine");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = Math.cos(firstNum);
			resultString = String.format("%.10f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.cosine();
			logger.info("Running test cos with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testTangent() {
		
		logger.info("startar testTangent");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = Math.tan(firstNum);
			resultString = String.format("%.10f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.tangent();
			logger.info("Running test tan with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testSqrt() {
		
		logger.info("startar testSqrt");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = Math.sqrt(firstNum);
			
			resultString = String.format("%.10f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.sqrt();
			logger.info("Running test sqrt with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testX2() {
		
		logger.info("startar testX2");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = firstNum * firstNum;
			
			resultString = String.format("%.2f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.x2();
			logger.info("Running test x2 with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
	
	@Test
	public void testX3() {
		
		logger.info("startar testX3");
		
		for (int i = 0; i < 50; i++) {
				
			firstNum = (random.nextDouble() *20 - 10);  
			result = firstNum * firstNum * firstNum;
			
			resultString = String.format("%.2f", new Object[] { Double.valueOf(result) });
			c.getTextField().setText(Double.toString(firstNum));
			c.x3();
			logger.info("Running test X3 with: " + firstNum + " expecting: " + resultString);
			assertTrue(c.getFormatNum().equals(resultString));
		}
	}
}
			
				
				
			

			
		
	

