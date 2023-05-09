package j_0509_01;

import java.util.Scanner;

public class _00_Class_03 {
    public static void main(String[] args) {
        
        double kor = 0;
        int eng = 98;
        int math = 100;
        String name = "서건웅";
        // 데이터 입력 받기 스캐너에 마우스 갖다대고 옵션 엔터! 그럼 임포트 됨
        Scanner scan = new Scanner(System.in); // scan = 변수명
        System.out.println("이름을 입력하세요.");
        // name = scan.next(); // 너무 좋아요
        name = scan.nextLine(); // 너무 좋아요 함께 해요.
        
        System.out.println("국어점수를 입력하세요");
        kor = scan.nextDouble(); // 인트를 받는형태의 스캔 != 더블은 넥스트 더블은 실수를 받는 것
        System.out.println("영어점수를 입력하세요");
        eng = scan.nextInt();
        System.out.println("수학점수를 입력하세요");
        eng = scan.nextInt();
        
        double total = kor+eng+math;
        double avg = total/3.0;
        System.out.println("------------------------------------");
        System.out.println("국어\t\t영어\t\t수학\t\t합계\t\t평균");
        System.out.println("------------------------------------");
        System.out.printf("%s\t%f\t\t%d\t\t%d\t\t%f\t\t%.2f \n", name,kor,eng, math,total,avg);
        
        
    }
}
