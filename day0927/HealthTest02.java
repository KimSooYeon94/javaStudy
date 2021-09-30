// 이름과 출생연도를 입력받아 나이를 계산하고, 나이가 40살 이상인지 판별하여
// 무료암검진 대상자인지 결과를 출력하도록 프로그램 수정하기
// 올해는 2021년으로 정해두고 프로그래밍


import java.util.Scanner;
class HealthTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, year;
      System.out.println("이름을 입력하세요 ==> ");
      name = sc.next();
      System.out.println("출생연도를 입력하세요 ==> ");
      year = sc.nextInt();
      age = 2021-year;
      if( age >= 40 ) 
        System.out.println(name + "님은 올해에 " + age + "세로 무료 암검진 대상자입니다.");
      else
        System.out.println(name + "님은 올해에 " + age + "세로 무료 암검진 대상자가 아닙니다.");     
   }
}