package hello;

class A{
	private int a;
	A(int a ){
		this.a = a;
	}
	/**private�ķ�װ���������Ե�
	 * ��������Զ�����Ե�
	 * ͬһ�����е����в�ͬ�Ķ���֮����Ի���������������е�˽������
	 * �����뿪������࣬���������д����˶���Ҳ���ܶ������������Խ���ֱ�ӷ��ʣ�ֻ��ͨ��public�ĺ������в���
	 * �ڱ����ж���b �� this ��ͬһ������
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
		//bbb.a = 1; //��д���Ǵ���ģ���Ϊ�뿪��A����࣬�������޷�ֱ�ӷ������ڲ����Ե�
		aaa.sum( bbb );
	}

}
