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
					System.out.println("这是第"+ j +"次，然后跳出循环");
					return;
				}
				
//				if(intVal == 99 ) {
//					System.out.println("这是第"+ j +"次，然后跳出循环");
//					break BREAK;
//				}
			}
			System.out.println(result);
			j++;
		}
		System.out.println("520");
			}

}
