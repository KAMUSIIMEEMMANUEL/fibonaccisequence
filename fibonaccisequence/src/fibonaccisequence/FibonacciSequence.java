package fibonaccisequence;

public class FibonacciSequence {

	public static void main(String[] args) {
	int n = 10; // Number of Fibonacci numbers to display
	int first = 0, second =1;
	
	System.out.println("FibonacciSequence:");
	for (int i = 1; i <=n; i++)
	{
		System.out.println(first + " ");
		// Calculate the next Fibonacci number
		int next = first + second;
		first = second;
		second = next;
	}

	}

}
