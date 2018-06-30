package com.timecalculator.estimator;

public class Estimator {

  private int numProducts;
  private int numWorkers;
  private int timeInSeconds;
  
  public Estimator(int numProducts, int numWorkers, int timeInSecond) {
    this.numProducts = numProducts;
    this.numWorkers  = numWorkers;
    this.timeInSeconds = timeInSecond;
    		
  }

  public int calcTime() {
	 int totalIteration = 0; 
	 if(numProducts > 0) {
		 totalIteration = numProducts/numWorkers;	
		 if(totalIteration > 0) {
			 totalIteration += numProducts%numWorkers;			 
		 } else {
			 totalIteration = 1;
		 }
	 }	  
	 return totalIteration * timeInSeconds;
  }

}
