package smartbatch;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, c=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1; i<n; i++)
		{
			if(n%i==0)
			{
				c = c + i;
			}
		}
		if(c == n)
		{
			System.out.println("Perfect");
			
		}
		else
			System.out.println("Not");
		
	}

}
