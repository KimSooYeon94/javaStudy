import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a,b,add,sub,multi,div;
      System.out.println("첫번째 정수를 입력하세요.");
      a = sc.nextInt();
      System.out.println("두번째 정수를 입력하세요.");
      b = sc.nextInt(); 
      add = a + b;
      sub = a - b;
      multi = a * b;
      div = a / b;
      System.out.println(" ** 결과 출력 ** ");
      System.out.println(" 더하기 : " + add);
      System.out.println(" 빼기 : " + sub);
      System.out.println(" 곱하기 : " + multi);
      System.out.println(" 나누기 : " + div);
   }
}