package com.timecalculator.estimator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class EstimatorTest {
	
	

  @Test
  public void testEstimatorForZeroProduct() {
	  Estimator estimator  = new Estimator(0, 3, 60);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(0));
  }
  
  @Test
  public void testEstimatorForOneProduct() {
	  Estimator estimator  = new Estimator(1, 3, 60);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(60));
  } 
  
  @Test
  public void testEstimatorForTwoProduct() {
	  Estimator estimator  = new Estimator(2, 3, 60);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(60));
  } 
  
  @Test
  public void testEstimatorForthreeProduct() {
	  Estimator estimator  = new Estimator(3, 3, 60);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(60));
  }
  
  @Test
  public void testEstimatorForFourProduct() {
	  Estimator estimator  = new Estimator(4, 3, 60);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(120));
  }
  
  
  @Test
  public void testEstimationByChaningtheTime() {
	  Estimator estimator  = new Estimator(4, 3, 10);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(20));
  }
  
  @Test
  public void testEstimationByExidingtheWorkers() {
	  Estimator estimator  = new Estimator(4, 4, 10);
	 int totalTime =  estimator.calcTime();
	 assertThat(totalTime , equalTo(10));
  }

}
