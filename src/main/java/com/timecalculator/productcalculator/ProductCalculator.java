package com.timecalculator.productcalculator;

public class ProductCalculator {
	
	private static final int NUM_BOLT_FOR_PRODUCT = 2;
	private static final int NUM_MACHINE_FOR_PRODUCT = 1;
	
	private int numBolts;
	private int numMachine;
	

	public ProductCalculator(int numBolts, int numMachine) {
	  this.numBolts = numBolts;
	  this.numMachine = numMachine;
	}


	public int calcuateNumProducts() {	  
	  int boltPairsForProdut = numBolts/NUM_BOLT_FOR_PRODUCT;		
	  int machinePairsForProduct  = numMachine/NUM_MACHINE_FOR_PRODUCT;	  
	  return (boltPairsForProdut <= machinePairsForProduct)?boltPairsForProdut:machinePairsForProduct;	 
	}

}
