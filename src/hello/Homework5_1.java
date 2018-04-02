package hello;

import java.util.Scanner;

public class Homework5_1 {

	public static int getPrime(int num) {
		int size = (int)Math.sqrt(num)+1;
		int Prime = 0;
		boolean isPrime = false;
		for(int i = 2; i <= size; i++)
		{
			if (num % i == 0) {
				Prime = i;
				isPrime = true;
				break;
			}
		}
		if(!isPrime)
			Prime = num;
		return Prime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.print(num+"=");
		int sumOfPrime = 1;
		int oldnum = num;
		while (num > 1) {
			int prime = getPrime(num);
			sumOfPrime *=prime;
			System.out.print(prime);			
			if(sumOfPrime < oldnum ) {
				System.out.print("*");
			}else
				break;
			num /= prime;
		}	
	}

}
