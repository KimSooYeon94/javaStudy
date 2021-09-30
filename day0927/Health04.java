
import java.util.Scanner;
import java.util.Date;
class Health04{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age, userYear;
      int thisYear = today.getYear()+1900;
      
      System.out.println("이름을 입력하세요 ==> ");
      name = sc.next();
      System.out.println("출생연도를 입력하세요 ==> ");
      userYear = sc.nextInt();
      age = thisYear - userYear; 
    
      if( age >= 40 && userYear % 2 == thisYear % 2 )
         System.out.println(name + "님," + thisYear + "년도에 무료 암검진 대상자입니다." );
      else
         System.out.println(name + "님," + thisYear + "년도에 무료 암검진 대상자가 아닙니다." );
   }
}