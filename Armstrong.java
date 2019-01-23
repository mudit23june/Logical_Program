package smartbatch;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j, t, c=0, r, s=0;
		//n = sc.nextInt();
		//t = n;
		for(i=1; i<=1000; i++)
		{
			t=i;
			while(t>0)
			{
				t = t/10;
				c = c + 1;
			}
			t=i;
			for(j=0; j<c; j++)
			{
				
				r = t%10;
				s = (int) (s + Math.pow(r, c));
				t = t/10;
				
			}
			if(s==i)
			{
				System.out.println(i);
			}
			s=0;
			c=0;
		}
		
		
	}

}
