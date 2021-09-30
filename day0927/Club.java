
import java.util.Scanner;
import java.util.Date;
class Club{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, tall;

      System.out.println("이름을 입력하세요 ==> ");
      name = sc.next();
      System.out.println("나이를 입력하세요 ==> ");
      age = sc.nextInt();
      System.out.println("키를 입력하세요 ==> ");
      tall = sc.nextInt();
    
      if( age >= 20 && tall <=160 ) 
        System.out.println(name + "님, 입장가능합니다.");
      else
        System.out.println(name + "님, 입장불가능합니다.");
   }
}