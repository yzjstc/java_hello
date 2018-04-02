package hello;

import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int starNum = in.nextInt();
		char[][] starsPicture = new char[starNum][starNum*2-1];
		for(int i = 0; i < starNum ; i++) {
			for(int j = 0 ; j < starNum * 2 -1 ; j++) {
				
				if (j >= starNum - 1 - i && j <= starNum -1 + i) {
					starsPicture[i][j] = '*';
				}
			}
		}
		int rowLength = starsPicture.length;
		for( int i = 0 ; i < rowLength ; i++ ) {
			for (int j = 0 ; j < starsPicture[i].length ; j++) {
				System.out.print(starsPicture[i][j]);
			}
			System.out.println();
		}
		
		in.close();
	}
	
	

}
