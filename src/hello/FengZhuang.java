package hello;

class A{
	private int a;
	A(int a ){
		this.a = a;
	}
	/**private的封装是针对类而言的
	 * 而不是针对对象而言的
	 * 同一个类中的所有不同的对象之间可以互相访问其他对象中的私有属性
	 * 但是离开了这个类，在其它类中创建了对象，也不能对这个对象的属性进行直接访问，只能通过public的函数进行操作
	 * 在本例中对象b 和 this 在同一个类中
	 */
	public void sum(A b) {
		int c = a + b.a;
		System.out.println(c);	
	}
}
public class FengZhuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aaa = new A(6);
		A bbb = new A(6);
		//bbb.a = 1; //该写法是错误的，因为离开了A这个类，对象是无法直接访问其内部属性的
		aaa.sum( bbb );
	}

}
