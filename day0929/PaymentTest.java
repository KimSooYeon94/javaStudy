import java.util.Scanner;
class PaymentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String item;
		int price, cnt;
		double tot;
		System.out.print("상품 이름을 입력하세요=>");
		item = sc.next();
		System.out.print("단가를 입력하세요=>");
		price = sc.nextInt();
		System.out.print("구매 수량을 입력하세요=>");
		cnt = sc.nextInt();
		
		tot = cnt*price;

		System.out.println();
		System.out.println("***결과 출력***");
		System.out.println("상품명 : " + item);
		System.out.println("단가 : " + price);
		System.out.println("수량 : " + cnt);
		System.out.println("총금액 : " + (int)tot);


		if(cnt>=10 || tot >=20000){
			tot = tot * 0.9;
			System.out.print("지불금액은 10% 할인받아 " + (int)tot + "원 입니다.");
		}
		else
			System.out.print("지불금액은 " + (int)tot + "원 입니다.");




	}
}
