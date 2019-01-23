package smartbatch;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int i;
		str = sc.nextLine();
		str = str.replaceAll("\\s", "");
		char arr[] = str.toLowerCase().toCharArray();
		Arrays.sort(arr);
		/*for(i=0; i<arr.length; i++)
		{
			if(arr[i] == arr[i+1])
				for(int j=i; j<arr.length; j++)
					arr[j] = arr[j+1];
		}*/
		for(i=97; i<=122; i++)
		{
			if(arr[i-97] != i)
				break;
		}
		if(i==123)
			System.out.println("Pangram");
		else
			System.out.println("Not");
		
	}

}
