import java.util.Scanner;
class FirstChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��ϼ���");
        data = sc.next();
		char first;
		first = data.charAt(0);
		System.out.println("ù��°�� �ִ� ���ڴ� " + first);
		//System.out.println("ù��°�� �ִ� ���ڴ� " + first = data.charAt(0));
		//String first = data.charAt(0)+"";
		//String first = data.substring(0,1); //0��° �ִ� ���� �ϳ��� �����ش�
		//System.out.println("ù��°�� �ִ� ���ڴ� " + first);

	}
}