package smartbatch;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int i, c=0;
		str = sc.next();
		char st[] = str.toLowerCase().toCharArray();
		for(i=0; i<st.length; i++)
		{
			c = c + st[i]-96;
		}
		System.out.println(c);
	}

}
