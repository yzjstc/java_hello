package hello;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in); 
		int[][] data = new int [3][101];
		int max = 0;
		int count = 0;

		//输入两个数组，记录多项式1和多项式2各项的系数
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

		
		//计算两个多项式的系数和，保存到数组中
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
		//打印系数结果
		
		for (int j = max; j >= 0 && isTure; j--)
		{
//由于次数高于1次时，x后需要增加一个幂次的值
			if(j == max && data[2][j]==0)
			{
				max--;
				continue;
			}
			if(j>1)
			{	
//当系数不为零时才输出
				if(data[2][j] != 0)	
					System.out.print(data[2][j]+"x"+j);
//当下一个次幂高于1时，才需要输出+号，否则等下一次循环时直接输出数字就好了	
					if(data[2][j-1] > 0)
					System.out.print("+");
			}

//当次数为1时，直接是输出x即可
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
//当次数为0时，判断系数是否为零，不是才需要输出系数！！！
				if(data[2][j] != 0)
					System.out.print(data[2][j]);
			}
		}
		
	}

}