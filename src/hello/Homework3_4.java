package hello;

import java.util.Scanner;

public class Homework3_4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		int remainder[] = new int[6];
		int count=0;
		if(number >= -100000 && number <= 100000)
		{
			
			if(number == 0)
			{
				System.out.print("ling");
			}
			else if(number < 0)
			{
				System.out.print("fu ");
				number = -number;
			}
			while (number > 0)
			{
				remainder[count++] = number % 10;
				number /= 10;
			}
			while (count-- > 0)
			{
				switch (remainder[count]) 
				{
					case 0:
						System.out.print("ling");
						break;

					case 1:
						System.out.print("yi");
						break;
						
					case 2:
						System.out.print("er");
						break;
						
					case 3:
						System.out.print("san");
						break;
						
					case 4:
						System.out.print("si");
						break;
						
					case 5:
						System.out.print("wu");
						break;
						
					case 6:
						System.out.print("liu");
						break;
						
					case 7:
						System.out.print("qi");
						break;
						
					case 8:
						System.out.print("ba");
						break;
						
					case 9:
						System.out.print("jiu");
						break;
				}
				if(count > 0) {
					System.out.print(" ");
				}
			}
		}
	}

}