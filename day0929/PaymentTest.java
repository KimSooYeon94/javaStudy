import java.util.Scanner;
class PaymentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String item;
		int price, cnt;
		double tot;
		System.out.print("��ǰ �̸��� �Է��ϼ���=>");
		item = sc.next();
		System.out.print("�ܰ��� �Է��ϼ���=>");
		price = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���=>");
		cnt = sc.nextInt();
		
		tot = cnt*price;

		System.out.println();
		System.out.println("***��� ���***");
		System.out.println("��ǰ�� : " + item);
		System.out.println("�ܰ� : " + price);
		System.out.println("���� : " + cnt);
		System.out.println("�ѱݾ� : " + (int)tot);


		if(cnt>=10 || tot >=20000){
			tot = tot * 0.9;
			System.out.print("���ұݾ��� 10% ���ι޾� " + (int)tot + "�� �Դϴ�.");
		}
		else
			System.out.print("���ұݾ��� " + (int)tot + "�� �Դϴ�.");




	}
}
