//1.����
import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String[] args) {
		//2.��������
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		//3.��������
		int numberl=sc.nextInt();
		System.out.println("������ڶ�������");
		//�ٴν��յڶ�������
		int number2 =sc.nextInt();
		System.out.println(numberl + number2);
	}
}