import static org.junit.Assert.*;

import org.junit.Test;


public class UniTest {

	TaxCalculator item1=new TaxCalculator("Book 3",7,4.95);
	TaxCalculator item2=new TaxCalculator("Movie",19,29.95);
	TaxCalculator item3=new TaxCalculator("Book 2",7,9.95);
	TaxCalculator item4=new TaxCalculator("Computer",19,499.00);
	TaxCalculator item5=new TaxCalculator("Book",7,9.95);
	@Test
	public void netSumTest() {
		assertTrue(0.7071428571428572==item1.netSum());
		assertTrue(1.5763157894736841==item2.netSum());
		assertTrue(1.4214285714285713==item3.netSum());
		assertTrue(26.263157894736842==item4.netSum());
		assertTrue(1.4214285714285713==item5.netSum());
		
	}
	
    public void taxeTest() {
		assertEquals(7,item1.taxe());
		assertTrue(7==item1.taxe());
		assertEquals(19,item2.taxe());
		assertTrue(19==item2.taxe());
		assertEquals(7,item3.taxe());
		assertTrue(7==item3.taxe());
		assertEquals(19,item4.taxe());
		assertTrue(19==item4.taxe());
		assertEquals(7,item5.taxe());
		assertTrue(7==item5.taxe());
	}
    
     public void totalSumTest() {
 		assertTrue(553.8000000000001==item1.totalSum());
 		
	}
     
     public void printItemTest() {
    	 assertEquals("Book 3",item1.printItem());
 		assertTrue("Book 3"==item1.printItem());
 		assertEquals("Movie",item2.printItem());
 		assertTrue("Movie"==item2.printItem());
 		assertEquals("Book 2",item3.printItem());
 		assertTrue("Book 2"==item3.printItem());
 		assertEquals("Computer",item4.printItem());
 		assertTrue("Computer"==item4.printItem());
 		assertEquals("Book",item5.printItem());
 		assertTrue("Book"==item5.printItem());
 	
 	}

}
