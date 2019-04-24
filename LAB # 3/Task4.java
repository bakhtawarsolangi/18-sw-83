import java.util.*;
class Task4
{
	public static void main(String[]args)
	{
		int first_num=Integer.parseInt(args[0]);
		int second_num=Integer.parseInt(args[1]);
		char operator=args[2].charAt(0);
		switch (operator)
		{
			case '+':
			System.out.println("sum of two number is:"+(first_num+second_num));
			break;
			case '-':
			System.out.println("subtraction of two number is:"+(first_num-second_num));
			break;
			case '*':
			int a=(first_num)*(second_num);
			System.out.println("multiplication of two num is:"+a);
			break;
			case '/':
			System.out.println("division of two num is:"+((float)first_num/second_num));
			break;

		}
	}
}