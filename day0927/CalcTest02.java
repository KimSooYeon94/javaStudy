import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a,b,add,sub,multi,div;
      System.out.println("ù��° ������ �Է��ϼ���.");
      a = sc.nextInt();
      System.out.println("�ι�° ������ �Է��ϼ���.");
      b = sc.nextInt(); 
      System.out.println(" ** ��� ��� ** ");
      System.out.println(" ���ϱ� : " + (a+b));
      System.out.println(" ���� : " + (a-b));
      System.out.println(" ���ϱ� : " + (a*b));
      System.out.println(" ������ : " + (a/b));
   }
}