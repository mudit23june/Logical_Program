package smartbatch;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first=0, second=1, third, i;
		System.out.println(first+" ");
		System.out.println(second+" ");
		for(i=0;i<n;i++)
		{
			third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
}
