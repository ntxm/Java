package TestRepl;
import java.util.Scanner;
class FunctionsTest implements Functions {
	
	double result;

	@Override
	public void display() {
		System.out.println("Result is ::: " + this.result);
		
	}

	@Override
	public double adding(double firstNumber, double secondNumber) {
		this.result = firstNumber + secondNumber;
		return result;
	}

	@Override
	public double subtracting(double firstNumber, double secondNumber) {
		this.result = firstNumber - secondNumber;
		return result;
	}

	@Override
	public double multiply(double firstNumber, double secondNumber) {
		this.result = firstNumber * secondNumber;
		return result;
	}

	@Override
	public double dividing(double firstNumber, double secondNumber) {
		this.result = firstNumber / secondNumber;
		return result;
	}
	
	public static void main(String[] args) {
		double firstNumber = 100.00; 
		double secondNumber = 20.00;
		
		FunctionsTest obj = new FunctionsTest();
		obj.adding(firstNumber, secondNumber);
		obj.display();
		obj.subtracting(firstNumber, secondNumber);
		obj.display();
		obj.multiply(firstNumber, secondNumber);
		obj.display();
		obj.dividing(firstNumber, secondNumber);
		obj.display();
		
		
	}
	
}