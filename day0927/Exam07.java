import java.util.Scanner;
class Exam07{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int comp, C, eng, math, avg;
      System.out.println("컴퓨터 개론 점수를 입력하세요.");
      comp = sc.nextInt();
      System.out.println("C언어 프로그래밍 점수를 입력하세요.");
      C = sc.nextInt();      
      System.out.println("영어 점수를 입력하세요.");
      eng = sc.nextInt();
      System.out.println("일반 수학 점수를 입력하세요.");
      math = sc.nextInt();
      avg = (comp + C + eng + math) / 4;
      System.out.println("학생의 과목 평균 점수는 " + avg + "점 입니다.");
   }
}