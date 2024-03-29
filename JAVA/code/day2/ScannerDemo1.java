//1.导包
import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String[] args) {
		//2.创建对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		//3.接收数据
		int numberl=sc.nextInt();
		System.out.println("请输入第二个数字");
		//再次接收第二个数据
		int number2 =sc.nextInt();
		System.out.println(numberl + number2);
	}
}