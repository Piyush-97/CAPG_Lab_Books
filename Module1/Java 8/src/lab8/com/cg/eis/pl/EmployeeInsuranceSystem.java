package lab8.com.cg.eis.pl;

public class EmployeeInsuranceSystem {
	
	static String calcGST(String productQR) {
		int GST = 0;
		final int GST_Rate = 12;
		String[] products = productQR.split("@");
		for (String product:products) {
			String[] rateQuantity = product.split(",");
			GST += Integer.parseInt(rateQuantity[0]) * Integer.parseInt(rateQuantity[1]);
		}
		return Integer.toString(GST * GST_Rate / 100);
	}
	
	
	
	
	
	public static void main(String[] args) {
		String productQR = "250,10@100,3@50,7";
		System.out.println(calcGST(productQR));
		
	}
}
