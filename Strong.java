package smartbatch;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int i, c =0, t, f=1, s=0, r;
		t = n;
		while(t>=1)
		{
			t = t/10;
			c = c + 1;
		}
		t = n;
		while(c>0)
		{
			r = t%10;
			for(i=1; i<=r; i++)
			{
				f = f*i;
			}
			s = s + f;
			t = t/10;
			f = 1;
			c--;
		}
		if(s==n)
			System.out.println("Strong");
		else
			System.out.println("Not");
	}

}
