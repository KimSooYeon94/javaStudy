// �̸��� ��������� �Է¹޾� ���̸� ����ϰ�, ���̰� 40�� �̻����� �Ǻ��Ͽ�
// ����ϰ��� ��������� ����� ����ϵ��� ���α׷� �����ϱ�
// ���ش� 2021������ ���صΰ� ���α׷���


import java.util.Scanner;
class HealthTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, year;
      System.out.println("�̸��� �Է��ϼ��� ==> ");
      name = sc.next();
      System.out.println("��������� �Է��ϼ��� ==> ");
      year = sc.nextInt();
      age = 2021-year;
      if( age >= 40 ) 
        System.out.println(name + "���� ���ؿ� " + age + "���� ���� �ϰ��� ������Դϴ�.");
      else
        System.out.println(name + "���� ���ؿ� " + age + "���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");     
   }
}