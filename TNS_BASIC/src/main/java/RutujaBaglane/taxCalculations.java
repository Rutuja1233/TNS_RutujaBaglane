package RutujaBaglane;

public class taxCalculations {
	//function to calculate tax
	public void calculateTax(Scanner Scanner) {//next scanner is referance and we can take any name ass a referance
		if(Scanner.getAge()> 65 || Scanner.getGender().equalsIgnoreCase("female"));
		{
			Scanner.setTax(0);
			System.out.println("Tax not applicable");
		}
		else {
			if(Scanner.getIncome()<= 160000) {
				Scanner.getTax(0);
			}
			else if(Scanner.getIncome()>160000 && Scanner.getIncome() <= 500000) {
				Scanner.setTax(Scanner.getIncome() - 160000 * 10/100);
			}
			else if(Scanner.getIncome()>500000 && Scanner.getIncome() <= 800000) {
				Scanner.setTax(Scanner.getIncome() - 500000 * 20/100 + 34000);  //from above conditon we calculated 34000
			}
			else {
				Scanner.setTax(Scanner.getIncome( - 800000) *30/100 + 94000);
			}
		}
	}
}