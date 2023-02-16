package day13;

import lambdademo.Calculator;

public class GreetingLambda {
	public static void main(String[] args) {
		Greeting birthday=(s)->
		{
			System.out.println(s);
		};
		birthday.showMessage("Happy Birthday");
		Greeting newyear=(s)->
		{
			System.out.println(s);
		};
		newyear.showMessage("Happy New Year");
	}
}