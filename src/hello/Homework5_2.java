package hello;

import java.util.Scanner;

public class Homework5_2 {
	
	public static boolean isPerfectNum(int num) {
		int sum = 0;
		int oldnum = num;
		for(int i = 1;i < num /2+1; i++) {
			if(num % i == 0) {
				sum += i;
			}		
		}
		if(sum == oldnum)	
			return true;
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int sumOfPerfectNum = 0;
		int flag = 1;
		while(n <= m) {
			if(isPerfectNum(n)) {
				if(flag == 1) {
					flag++;
					System.out.print(n);
					sumOfPerfectNum++;
				}else {
					System.out.print(" "+n);
					sumOfPerfectNum++;
				}
			}
				n++;
				
			
		}
		if (sumOfPerfectNum < 1) {
			System.out.print("NIL");
		}
		
	}

}
