import java.util.Scanner;
class BooleanTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요");
		data = sc.next();

		boolean result;
		result = data.length() >= 4;
		System.out.println(result);

	}
}
