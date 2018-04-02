package hello;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countOfJiShu = 0, countOfOuShu = 0 ;
		Scanner in = new Scanner(System.in);
		int a;
		while((a = in.nextInt()) != -1 ) 
		{
			if(a > 0 && a < 100000)
			{
				if(a % 2 ==0 )
				{
					countOfOuShu++;
				}
				else
				{
					countOfJiShu++;
				}
			}
			else
			{
				continue;
			}
		}
		System.out.println(countOfJiShu +" "+ countOfOuShu);
		in.close();
	}

}
