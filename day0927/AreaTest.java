import java.util.Scanner;
class AreaTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int width, height, area;
      System.out.println("�簢���� ���� ���̸� �Է��ϼ���.");
      width = sc.nextInt();
      System.out.println("�簢���� ���� ���̸� �Է��ϼ���.");
      height = sc.nextInt(); 
      area = width * height;
      System.out.println("�簢���� ������ " + area + "�Դϴ�.");
   }
}