import java.util.Scanner;
public class calculatorChallenge
	{
static double num1;
static double num2;

		public static void main(String[] args)
			{
				firstNumber();
				secondNumber();
				operation();
				add ( num1, num2);
				subtract ( num1, num2);
				multiply ( num1, num2);
				divide ( num1, num2);
				exponents (num1, num2);
			}
		public static void firstNumber()
		{
			System.out.println("Please insert the first number");
			Scanner userDoubleInput = new Scanner(System.in);
			num1 = userDoubleInput.nextDouble();
		}
		public static void secondNumber()
		{
			System.out.println("Please insert the second number");
			Scanner userDoubleInput = new Scanner(System.in);
			num2 = userDoubleInput.nextDouble();
		}
		public static void operation()
		{
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Choose and operation (add, subtract, multiply, divide, or exponents)");
			String optype = userStringInput.nextLine();
							
		}
		public static double add( double x, double y)
		{			
			return x + y;
		}
		public static double subtract( double x, double y)
		{
			return x - y;
		}
		public static double multiply( double x, double y)
		{
			return x * y;
		}
		public static double divide( double x, double y)
		{
			return x / y;
		}
		public static double exponents( double x, double y)
		{
			return Math.pow ( x, y);
		}
		

	}
