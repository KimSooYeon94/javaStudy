import java.util.Scanner;
class FirstChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요");
        data = sc.next();
		char first;
		first = data.charAt(0);
		System.out.println("첫번째에 있는 문자는 " + first);
		//System.out.println("첫번째에 있는 문자는 " + first = data.charAt(0));
		//String first = data.charAt(0)+"";
		//String first = data.substring(0,1); //0번째 있는 숫자 하나를 돌려준다
		//System.out.println("첫번째에 있는 문자는 " + first);

	}
}
