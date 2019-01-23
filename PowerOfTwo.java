package smartbatch;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while(n%2==0)
		{
			n = n/2;
		}
		if(n!=1)
			System.out.println("Not");
		else
			System.out.println("Yes");
	}

}
