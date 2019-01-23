package smartbatch;
import java.util.*;

public class Stair {

	static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	static int countWays(int s)
	{
		return fib(s+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		System.out.println(countWays(s));

	}

}
