package com.timecalculator;

public class TimeCalcuatorAppTest extends TimeCalcuatorApp {
	
	@Override
	protected void scanInputValues() {
		this.numBolts = 6;
		this.numMachine = 3;
		this.time =60;				
	}
	
	@Override
	protected void printResults() {
	   if(this.numProducts != 3) {
		   throw new RuntimeException("Products are not matching");
	   }	
	   
	   if(this.totalTime != 60) {
		   throw new RuntimeException("Invalid Time");
	   }
	}

}
