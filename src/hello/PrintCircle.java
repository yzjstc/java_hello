package hello;

import java.util.Scanner;

public class PrintCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int starNum = in.nextInt();
		char[][] starsPicture = new char[starNum*2+1][starNum*2+1];
		for(int i = 0; i < starNum*2+1 ; i++) {
			for(int j = 0 ; j < starNum*2+1 ; j++) {
				double round = Math.sqrt(Math.pow((1.0*starNum-i), 2.0)+Math.pow((starNum-j), 2));
				if (Math.round(round)-starNum <= 0.001 && Math.round(round)-starNum >= 0) {
					starsPicture[i][j] = '*';
				}
			}
		}
		int rowLength = starsPicture.length;
		for( int i = 0 ; i < rowLength ; i++ ) {
			for (int j = 0 ; j < starsPicture[i].length ; j++) {
				System.out.printf("%c", starsPicture[i][j]);
			}
			System.out.println();
		}
		
		in.close();
	}

}
