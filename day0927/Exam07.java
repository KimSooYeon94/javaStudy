import java.util.Scanner;
class Exam07{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int comp, C, eng, math, avg;
      System.out.println("��ǻ�� ���� ������ �Է��ϼ���.");
      comp = sc.nextInt();
      System.out.println("C��� ���α׷��� ������ �Է��ϼ���.");
      C = sc.nextInt();      
      System.out.println("���� ������ �Է��ϼ���.");
      eng = sc.nextInt();
      System.out.println("�Ϲ� ���� ������ �Է��ϼ���.");
      math = sc.nextInt();
      avg = (comp + C + eng + math) / 4;
      System.out.println("�л��� ���� ��� ������ " + avg + "�� �Դϴ�.");
   }
}