import static org.junit.Assert.*;

import org.junit.Test;


public class MyTest {
	//instantiate MyCalculator
	MyCalculator mc = new MyCalculator();
	
	@Test		//test nfactorial
	public void testNfactorial() {
		assertEquals(1,mc.nfactorial(0));		//0!==1
		assertEquals(1,mc.nfactorial(1));		//1!==1 
		assertEquals(120,mc.nfactorial(5));		//5!== 120
		assertEquals(3628800,mc.nfactorial(10));//10!==3628800
		
		
	}

	@Test		//test binarysearch
	public void testBinarySearch() {
		int arr[] = {1, 12, 2, 5, 34};				//array
			
		assertEquals(2,mc.binarySearch(arr, 2)); 	//function must return 2
		assertEquals(1,mc.binarySearch(arr, 78));	//function must return 1
		assertEquals(4,mc.binarySearch(arr, 34));	//function must return 4
		assertEquals(1,mc.binarySearch(arr, 12));	//function must return 1
		assertEquals(0,mc.binarySearch(arr, 1));	//function must return 0
		
		
		
	}
//end of test
}
