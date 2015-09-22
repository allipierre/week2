
public class Test {

	public static void main(String[] args) {
		TaxCalculator item1=new TaxCalculator("Book 3",7,4.95);
		TaxCalculator item2=new TaxCalculator("Movie",19,29.95);
		TaxCalculator item3=new TaxCalculator("Book 2",7,9.95);
		TaxCalculator item4=new TaxCalculator("Computer",19,499.00);
		TaxCalculator item5=new TaxCalculator("Book",7,9.95);
		
		System.out.println(""+item1.printItem()+" ,NettSum is :"+item1.netSum()+ " ,Tax rate is: "+item1.taxe());
		System.out.println(""+item2.printItem()+" ,NettSum is :"+item2.netSum()+ " ,Tax rate is: "+item2.taxe());
		System.out.println(""+item3.printItem()+" ,NettSum is :"+item3.netSum()+ " ,Tax rate is: "+item3.taxe());
		System.out.println(""+item4.printItem()+" ,NettSum is :"+item4.netSum()+ " ,Tax rate is: "+item4.taxe());
		System.out.println(""+item5.printItem()+" ,NettSum is :"+item5.netSum()+ " ,Tax rate is: "+item5.taxe());
		System.out.println("a total sum including all taxes :"+(item1.totalSum()+item2.totalSum()+item3.totalSum()+item4.totalSum()+item5.totalSum()));

	}

}
