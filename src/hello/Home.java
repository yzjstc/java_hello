package hello;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in); 
		int[][] data = new int [3][101];
		int max = 0;
		int count = 0;

		//�����������飬��¼����ʽ1�Ͷ���ʽ2�����ϵ��
		while (count < 2)
		{
			int first = in.nextInt();
			int second = in.nextInt();
			data[count][first]=second;
			if(first <0 || first > 100)
				break;
			if(first > max)
				max = first;
			while(first != 0)
			{
				first = in.nextInt();
				second = in.nextInt();
				data[count][first]=second;
			}
			count++;
		}

		
		//������������ʽ��ϵ���ͣ����浽������
		for(int i = max;i >= 0;i--)
		{
			data[2][i]=data[0][i]+data[1][i];
		}
		
		boolean isTure = true;
		int sum = 0;
		for (int j = 0;j <= max; )
		{
			if(data[2][j++] == 0)
				sum++;
		}
		if (sum == max + 1) {
			System.out.print(0);
			isTure = false;
		}
		//��ӡϵ�����
		
		for (int j = max; j >= 0 && isTure; j--)
		{
//���ڴ�������1��ʱ��x����Ҫ����һ���ݴε�ֵ
			if(j == max && data[2][j]==0)
			{
				max--;
				continue;
			}
			if(j>1)
			{	
//��ϵ����Ϊ��ʱ�����
				if(data[2][j] != 0)	
					System.out.print(data[2][j]+"x"+j);
//����һ�����ݸ���1ʱ������Ҫ���+�ţ��������һ��ѭ��ʱֱ��������־ͺ���	
					if(data[2][j-1] > 0)
					System.out.print("+");
			}

//������Ϊ1ʱ��ֱ�������x����
			else if(j > 0)
			{
				if(data[2][j] != 0 && data[2][j] != 1)	
					System.out.print(data[2][j]+"x");
				if (data[2][j] != 0 && data[2][j] == 1) 
					System.out.print("x");
				if(data[2][j-1] > 0)
					System.out.print("+");
			}
			else
			{	
//������Ϊ0ʱ���ж�ϵ���Ƿ�Ϊ�㣬���ǲ���Ҫ���ϵ��������
				if(data[2][j] != 0)
					System.out.print(data[2][j]);
			}
		}
		
	}

}