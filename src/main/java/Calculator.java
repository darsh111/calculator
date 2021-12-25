import java.util.Scanner;

class  calculating {
	private double n1, n2;     // declaration variable

	public double getAdd() {

		return n1 + n2;
	}

	public void setAdd(double num1, double num2) {        //getter and setter
		this.n1 = num1;
		this.n2 = num2;
	}

	public double getMul() {

		return n1 * n2;
	}

	public void setMul(double num1, double num2) {

		this.n1 = num1;
		this.n2 = num2;
	}

	public double getSub() {

		return n1 - n2;
	}

	public void setSub(double num1, double num2) {

		this.n1 = num1;
		this.n2 = num2;
	}

	public double getDiv() {

		return n1 / n2;
	}

	public void setDiv(double num1, double num2) {

		this.n1 = num1;
		this.n2 = num2;
	}

	public double getMod() {

		return n1 % n2;
	}

	public void setMod(double num1, double num2) {

		this.n1 = num1;
		this.n2 = num2;
	}

}

public class Calculator {

	public static void main(String[] args) {
		
		double num1, num2;
		 calculating cl = new  calculating();
		int cs;
		do {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("choose option: ");
			
		
			System.out.println("  1.Addition ");
			System.out.println("  2.Substraction");
			System.out.println("  3.Multiplication");
			System.out.println("  4.Devision");
			System.out.println("  5.Modular");
			System.out.println("  0.Exit");
			
			cs = sc.nextInt();
			switch (cs) {
			case 1:

				System.out.println("Enter number 1 please");
				num1 = sc.nextDouble();

				System.out.println("Enter number 2 please");
				num2 = sc.nextDouble();
				cl.setAdd(num1, num2);

				System.out.println("The result for the addition is" + cl.getAdd());
				break;
			case 2:

				System.out.println("Enter number 1 please");
				num1 = sc.nextDouble();

				System.out.println("Enter number 2 please");
				num2 = sc.nextDouble();
				cl.setSub(num1, num2);

				System.out.println("The result for the Subtrcration is" + cl.getSub());
				break;
			case 3:

				System.out.println("Enter number 1 please");
				num1 = sc.nextDouble();

				System.out.println("Enter number 2 please");
				num2 = sc.nextDouble();
				cl.setMul(num1, num2);

				System.out.println("The result for the Multiplication is" + cl.getMul());
				break;
			case 4:

				do {
					System.out.println("Enter number 1 please ");
					num1 = sc.nextDouble();
					if (num1 == 0) {
						System.out.println("its zero try again try again with number please");
					}
				} while (num1 == 0);

				do {
					System.out.println("Enter number 2 please");
					num2 = sc.nextDouble();
					if (num2 == 0) {
						System.out.println("its zero try again with number please");
					}
				} while (num2 == 0);
				cl.setDiv(num1, num2);
				System.out.println("The result for the Divison is" + cl.getDiv());
				break;
			case 5:

				System.out.println("Enter number 1 please");
				num1 = sc.nextDouble();
				System.out.println("Enter number 2 please");
				num2 = sc.nextDouble();
				cl.setMod(num1, num2);
				System.out.println("The result for the Modular is" + cl.getMod());
				break;
			case 0:

				break;

			default:

				System.out.println("Incorrect choice please try again");
				break;
			}

		} while (cs != 0);

		System.out.println("exit now");

	}

}
