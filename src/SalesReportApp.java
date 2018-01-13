import java.text.NumberFormat;

public class SalesReportApp {

	public static void main(String[] args) {
		System.out.println("The Sales report application\n");
		NumberFormat currency = NumberFormat.getCurrencyInstance();
			
		double [][] sales = {
				{1540.0, 2010.0, 2450.0, 1845.0},
				{1130.0, 1168.0, 1847.0, 1491.0},
				{1580.0, 2305.0, 2710.0, 1284.0},
				{1105.0, 4102.0, 2391.0, 1576.0}
		};
		
		System.out.println("Region\tQ1\t\tQ2\t\tQ3\t\tQ4");
		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "\t");
			for ( int j = 0; j < 4; j++) {
				System.out.print(currency.format(sales[i][j]) + "\t");
			}
			System.out.println();		
		}
		System.out.println();	
		
		double [] regionSales = new double [4];
		
		for (int i = 0; i < 4; i++) {
			for ( int j = 0; j < 4; j++) {
				regionSales[i]+=sales[i][j];
			}
		}	
		System.out.println("Sales by region: ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Region " + (i+1) + ": " + currency.format(regionSales[i]));
		}
		
		System.out.println();	
		
		double [] quarterSales = new double [4];
		
		for (int i = 0; i < 4; i++) {
			for ( int j = 0; j < 4; j++) {
				quarterSales[i]+=sales[j][i];
			}
		}	
		
		System.out.println("Sales by quarter: ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Q" + (i+1) + ": " + currency.format(quarterSales[i]));
		}
		
		System.out.println();	
		
		double totalSales = 0;
		for (int i = 0; i < 4; i++) {
			totalSales += quarterSales[i];
			}		
		System.out.println("Total sales: " + currency.format(totalSales));		
	}
}
