import java.util.Scanner;
class Test 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int a, b, add, sub, multi, div, mode;
		System.out.print("첫번째 수를 입력하세요==> ");
		a = sc.nextInt();
		System.out.print("첫번째 수를 입력하세요==> ");
		b = sc.nextInt();
		add = a + b;
		sub = a - b;
		multi = a * b;
		div = a / b;
		mode = a % b;
	
		System.out.println(a + "+" + b + "=" + add);
		System.out.println(a + "-" + b + "=" + sub);
		System.out.println(a + "*" + b + "=" + multi);
		System.out.println(a + "/" + b + "=" + div);
		System.out.println(a + "%" + b + "=" + mode);
	}
}
