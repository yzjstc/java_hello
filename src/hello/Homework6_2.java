package hello;
import java.util.Scanner;

public class Homework6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		String time = null;
		str = in.nextLine();
		while(str.equals("END") != true) {
			
			int lastLoc;
			int checkSum;
			int sum;
			
			if(str.startsWith("$GPRMC") == true) {
				String[] getA = str.split(",");
				//�ж��Ƿ�λ
				if( getA[2].equals("A")) {
					lastLoc = str.indexOf("*");
					checkSum = 'G';
					//����У���
					for(int i=2; i<lastLoc; i++) {
						checkSum ^= str.charAt(i); 
					}
					//�����λ��ֵ
					sum = Integer.parseInt(str.substring(lastLoc+1), 16);
					checkSum = checkSum % 65536;
					if(sum == checkSum) {					
						time = getA[1].substring(0, 6);
					}
				}
				
			}
			str = in.nextLine();
		}
		String hourstring = time.substring(0, 2);
		int hour = Integer.parseInt(hourstring)+8;
		hour = hour % 24;
		if(hour <10)
			System.out.print("0"+hour+":");
		else
			System.out.print(hour+":");
		System.out.print(time.substring(2,4)+":");
		System.out.print(time.substring(4,6));
	}
}