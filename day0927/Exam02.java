import java.util.Scanner;
class Exam02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double x;
      System.out.println("�Ǽ� x �� �Է��ϼ���.");
      x = sc.nextDouble();
    //  y = (3*x*x*x)-(7*x*x)+9;
      double y = 3*Math.pow(x,3) - 7*Math.pow(x,2) +9;  
      System.out.println("x = " + x + " �� ��");
      System.out.println("(3x^3) - (7x^2) + 9 = " + y);
   }
}