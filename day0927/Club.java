
import java.util.Scanner;
import java.util.Date;
class Club{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, tall;

      System.out.println("�̸��� �Է��ϼ��� ==> ");
      name = sc.next();
      System.out.println("���̸� �Է��ϼ��� ==> ");
      age = sc.nextInt();
      System.out.println("Ű�� �Է��ϼ��� ==> ");
      tall = sc.nextInt();
    
      if( age >= 20 && tall <=160 ) 
        System.out.println(name + "��, ���尡���մϴ�.");
      else
        System.out.println(name + "��, ����Ұ����մϴ�.");
   }
}