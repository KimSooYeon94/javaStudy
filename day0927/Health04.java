
import java.util.Scanner;
import java.util.Date;
class Health04{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age, userYear;
      int thisYear = today.getYear()+1900;
      
      System.out.println("�̸��� �Է��ϼ��� ==> ");
      name = sc.next();
      System.out.println("��������� �Է��ϼ��� ==> ");
      userYear = sc.nextInt();
      age = thisYear - userYear; 
    
      if( age >= 40 && userYear % 2 == thisYear % 2 )
         System.out.println(name + "��," + thisYear + "�⵵�� ���� �ϰ��� ������Դϴ�." );
      else
         System.out.println(name + "��," + thisYear + "�⵵�� ���� �ϰ��� ����ڰ� �ƴմϴ�." );
   }
}