package hello;

public class Getwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 0;
		//BREAK:
		while(j < 1000) {
			String result = "";
			for (int i = 0; i<6 ;i++) {
				int intVal = (int) (Math.random()*26+97);
				result += (char)intVal;
				if(intVal == 101 ) {
					System.out.println("���ǵ�"+ j +"�Σ�Ȼ������ѭ��");
					return;
				}
				
//				if(intVal == 99 ) {
//					System.out.println("���ǵ�"+ j +"�Σ�Ȼ������ѭ��");
//					break BREAK;
//				}
			}
			System.out.println(result);
			j++;
		}
		System.out.println("520");
			}

}
