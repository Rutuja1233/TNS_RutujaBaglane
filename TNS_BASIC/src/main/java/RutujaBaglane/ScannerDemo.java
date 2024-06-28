package RutujaBaglane;

public class ScannerDemo {
	public static void main(String[]arge) {
		Scanner ob = new Scanner(System.in);     //ctrl+shift+o for importing all required lib
		
		String name;
		System.out.println("Enter your name: ");
		name =ob.next();
		
		System.out.println("Enter age :");
		int age = ob.nextInt();
		
		System.out.println("Enter gender: ");
		String gender = ob.next();
		
		System.out.println("Enter income");
		int income = ob,nextInt();
		
		//person object and initialize value using 
		Scanner.setAge(age);
		
		
		
		
		
		System.out.println("Scanner");
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(Scanner);
		System.out.println("after calculation of tax");
		System.out.println(Scanner);
		
	}

}
