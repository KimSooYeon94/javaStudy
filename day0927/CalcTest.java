import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a,b,add,sub,multi,div;
      System.out.println("ù��° ������ �Է��ϼ���.");
      a = sc.nextInt();
      System.out.println("�ι�° ������ �Է��ϼ���.");
      b = sc.nextInt(); 
      add = a + b;
      sub = a - b;
      multi = a * b;
      div = a / b;
      System.out.println(" ** ��� ��� ** ");
      System.out.println(" ���ϱ� : " + add);
      System.out.println(" ���� : " + sub);
      System.out.println(" ���ϱ� : " + multi);
      System.out.println(" ������ : " + div);
   }
}