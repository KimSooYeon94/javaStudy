// 이름과 출생연도를 입력받아 나이를 계산하고, 나이가 40살 이상인지 판별하여
// 무료암검진 대상자인지 결과를 출력하도록 프로그램 수정하기

import java.util.Scanner;
import java.util.Date;
class HealthTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age, userYear;
      int thisYear;
      thisYear = today.getYear()+1900;

      System.out.println("이름을 입력하세요 ==> ");
      name = sc.next();
      System.out.println("출생연도를 입력하세요 ==> ");
      userYear = sc.nextInt();
      age = thisYear-userYear;

      System.out.println("올해는 " + thisYear + "년도입니다.");

      if( age >= 40 ) 
        System.out.println(name + "님은 올해에 " + age + "세로 무료 암검진 대상자입니다.");
      else
        System.out.println(name + "님은 올해에" + age + " 세로 무료 암검진 대상자가 아닙니다.");     
   }
}