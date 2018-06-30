package com.timecalculator;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.timecalculator.estimator.Estimator;
import com.timecalculator.productcalculator.ProductCalculator;

public class TimeCalcuatorApp {
	
	private static final int TOTAL_WORKERS = 3;
	
	protected int numMachine;
	protected int numBolts;
	protected int time;
	protected int numProducts;
	protected int totalTime;

	private static final Logger LOG = Logger.getLogger(TimeCalcuatorApp.class.getName());

	public static void main(String[] args) {
		new TimeCalcuatorApp().runCalcuator();
	}

	public void runCalcuator() {
		scanInputValues();
		calcuateNumProducts();
		calcuateTotalEstimate();
		printResults();
	}

	protected void scanInputValues() {
		Scanner sc = new Scanner(System.in);

		LOG.info("X = ");
		numMachine = sc.nextInt();

		LOG.info("Y = ");
		numBolts = sc.nextInt();

		LOG.info("N = ");
		time = sc.nextInt();
		sc.close();
	}
	
	
	private void calcuateNumProducts() {
		ProductCalculator productCalcuator = new ProductCalculator(numBolts, numMachine);
		numProducts = productCalcuator.calcuateNumProducts();		
	}
	
	private void calcuateTotalEstimate() {
		Estimator estimator = new Estimator(numProducts, TOTAL_WORKERS,time);
		totalTime = estimator.calcTime();
    }
	
	protected void printResults() {	
		if(LOG.isLoggable(Level.INFO)) {
			LOG.info(concatString("Total Products = ", numProducts));	
		}
		
		if(LOG.isLoggable(Level.INFO)) {
			LOG.info(concatString("Total Time Taken = ", totalTime));	
		}
		
	}
	
	private String concatString(String msg, int parameter) {
        return msg+parameter;
	}
	
	
}
