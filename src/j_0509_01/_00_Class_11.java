package j_0509_01;

import java.util.Scanner;

public class _00_Class_11 {
    public static void main(String[] args) {
        char ch= ' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        ch = scan.next().charAt(0);
        String result = (ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')?"영문 소문자입니다.":"영문소문자가 아닙니다.";
        System.out.println(result);
        
        
        // 소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오.
//        Scanner scan = new Scanner(System.in);
//        double pi3 = 3.12345;
//        pi3 = scan.nextDouble();
//        double result3 = Math.round(pi3*1000)/1000.0; //소수점 3째자리 반올림
//        System.out.println(result3);
        
        
        
        
        
        // double pi = 3.141592; 소수점 2자리에서 반올림해서 출력하시오.
        // 37.894
//        double pi1 = 3.7894;
//        double result1 = Math.round(pi1*10)/10.0; // 소수점 2째자리 반올림을 하여 3.8이 나온다
//
//        System.out.println(result1);
        
        
        
        
        
        // 소수점 4자리에서 반올림 출력하시오.
        // 1.변수선언 2.출력
//        double pi2 = 3.141592;
//        double result2 = Math.round(pi2*1000)/1000.0; //소수점 3째자리까지 표현한다.
//
//        System.out.println(result2);
    }
}
