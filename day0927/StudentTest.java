import java.util.Scanner;
class StudentTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int kor, eng, math, tot, avg;
      System.out.println("�л��� �̸��� �����ΰ���?");
      name = sc.next();
      System.out.println("���� ������?");
      kor = sc.nextInt();
      System.out.println("���� ������?");
      eng = sc.nextInt();
      System.out.println("���� ������?");
      math = sc.nextInt();
      tot = kor + eng + math;
      avg = tot / 3;
      System.out.println(" ** ��� ��� ** ");
      System.out.println(" �̸� : " + name);
      System.out.println(" ���� : " + kor);
      System.out.println(" ���� : " + eng);
      System.out.println(" ���� : " + math);
      System.out.println(" ���� : " + tot);
      System.out.println(" ��� : " + avg);
   }
}