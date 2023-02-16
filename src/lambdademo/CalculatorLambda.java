package lambdademo;

public class CalculatorLambda {
	public static void main(String []args) {
		Calculator cadd=(x,y)->
		{
			System.out.println("The addition equals "+(x+y));
		};
		cadd.calculate(79,10);
		Calculator csubtraction=(x,y)->
		{
			System.out.println("The subtraction equals "+(x-y));
		};
		csubtraction.calculate(79,10);
		Calculator cmult=(x,y)->
		{
			System.out.println("The multiplication equals "+(x*y));
		};
		cmult.calculate(79, 10);
	}
}
