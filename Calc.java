package smartbatch;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		while(true)
		{
	    System.out.println("Choose");
	    System.out.println("1. add 2. sub 3. multiply 4. divide 5. exit");
	    c = sc.nextInt();
	    switch(c)
	    {
	    case 1: System.out.println(a+b);
	    		break;
	    case 2: System.out.println(a-b);
	    		break;
	    case 3: System.out.println(a*b);
	    		break;
	    case 4: System.out.println(a/b);
	    		break;
	    default: System.exit(0);
	    }
		}
		}

}
