package smartbatch;

import java.util.Scanner;

public class PowerOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, r=0;
		n = sc.nextInt();
		while(n>1)
		{
			r = n%10;
			n = n/10;
			if(r!=0)
				break;
		}
		if(n==1 && r==0)
			System.out.println("power of ten");
		else
			System.out.println("Not power of ten");
		
	}

}
