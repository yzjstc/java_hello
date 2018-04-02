package hello;

public class Testfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[10][10];
		for( int i = 0 ;i < 10 ;i++) {
			for (int j = 0 ; j < 10; j++) {
				table[i][j] = j;
			}
		}
		for( int i = 0 ;i < 10 ;i++) {
			for (int j = 0 ; j < 10; j++) {
				System.out.print(" "+table[i][j]);
			}
			System.out.println();
		}
	}

}
