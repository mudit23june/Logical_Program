package smartbatch;

import java.util.Scanner;

public class StartS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[20];
		int i, n;
		n = sc.nextInt();
		for(i=0; i<n; i++)
			arr[i] = sc.next();
		for(i=0; i<n; i++)
		{
			if(arr[i].charAt(0)=='s')
				System.out.print(arr[i] + " ");
		}
	}

}
