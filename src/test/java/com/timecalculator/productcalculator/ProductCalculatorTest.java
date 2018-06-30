package com.timecalculator.productcalculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import com.timecalculator.productcalculator.ProductCalculator;



public class ProductCalculatorTest {
	
	
  @Test
  public void testZeroProductCreated() {	  
	ProductCalculator  productCalc = new ProductCalculator(0,0); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(0));	  
  }
  
  @Test
  public void testOneProductIsCreated() {
    ProductCalculator  productCalc = new ProductCalculator(2,1); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(1));	  
  }
  
  @Test
  public void testTwoProductIsCreated() {
    ProductCalculator  productCalc = new ProductCalculator(4,2); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(2));	  
  }
  
  @Test
  public void testThreeProductIsCreated() {
    ProductCalculator  productCalc = new ProductCalculator(6,3); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(3));	  
  }
  
  @Test
  public void testTwentyProductIsCreated() {
    ProductCalculator  productCalc = new ProductCalculator(40,20); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(20));	  
  }
 
  @Test
  public void testIfEqualNumberOFBoltsAndMachine() {
    ProductCalculator  productCalc = new ProductCalculator(4,4); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(2));	  
  }

  @Test
  public void testIfMoreMachineAndLessBoltProvided() {
    ProductCalculator  productCalc = new ProductCalculator(2,4); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(1));	  
  } 
  
  @Test
  public void testIfLessMachineAndMoreBoltProvided() {
    ProductCalculator  productCalc = new ProductCalculator(10,1); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(1));	  
  } 
  
  @Test
  public void testIfZeroMachineProvided() {
    ProductCalculator  productCalc = new ProductCalculator(10,0); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(0));	  
  }  
  
  @Test
  public void testIfZeroBoltProvided() {
    ProductCalculator  productCalc = new ProductCalculator(0,10); 
	int numOfProduct = productCalc.calcuateNumProducts();
	assertThat(numOfProduct , equalTo(0));	  
  } 
  
}
