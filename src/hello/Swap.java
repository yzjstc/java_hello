package hello;


public class Swap {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a+"  "+b);
		
		double A = 0;
		for(int  i = 0 ; i < 10 ; i++)
			A = A + 0.1;
		if ((1 - A) < 0.000000000000001)
			System.out.println("Ëû¾ÍÊÇ1");
		System.out.println(A);
		char testa = 'a';
		char testz = 'z';
		System.out.println(testz - testa);
		System.out.println((char)(testa + 1));
		char c = 97;
		System.out.println(c);
		char zhong = '·è';
		int zhongvalue = zhong;
		char testzhong = '\u9999';
		System.out.println(testzhong);
		System.out.println(zhongvalue);
		System.out.println((char)zhongvalue);
		
		float aaa = 512.2222222f;
		System.out.println(aaa);
		System.out.println(3|4);
		System.out.println(10/(3*1.0));
	}

}
