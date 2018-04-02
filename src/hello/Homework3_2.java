package hello;

import java.util.Scanner;

public class Homework3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int shuwei = 0, shuzi, sum=0, c = 1;
		if (a >= 0 && a <= 1000000) 
		{
			while (a > 0)
			{
				int b = 0;
				shuzi = a % 10;
				shuwei++;
				if(((shuzi % 2 ==0) && (shuwei %2 ==0))||((shuzi % 2 != 0)&&(shuwei % 2 != 0)))
				{
					b=1;
				}
				sum += (c*b);
				c *= 2;
				a /= 10;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
