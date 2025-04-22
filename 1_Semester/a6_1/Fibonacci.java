package a6_1;

public class Fibonacci {
	public static int fibonacci (int n) {
		
		if (n == 0)
		return 1;
		
		if (n == 1)
		return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int fibonacciIterativ(int n) {
		
		if (n < 0) {
	        return 0;
	    }

	    if (n == 0 || n == 1) {
	        return 1;
	    }

	    int a = 0; //vorletzte fibonacci zahl
	    int b = 1; // letzte fibonacci zahl
	    int fib = 1;

	    for (int i = 2; i <= n; i++) {		// fängt bei 2 an da 0 und 1 oben schon bekannt sind
	        fib = a + b;
	        a = b;
	        b = fib;
	    }

	    return fib;
	}
}

