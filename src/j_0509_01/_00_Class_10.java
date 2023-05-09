package j_0509_01;

import java.util.Scanner;

public class _00_Class_10 {
    public static void main(String[] args) {

        // double num = 56.124586 소수점 3자리 절사 2자리까지 존재
//       double num = 56.124586;
//       double result = (int)(pi*100) / 100.0;
//        System.out.println(result);
    
        // 실수 소수점 7자리까지 입력받아, 소수점 4자리 까지만 출력하시오.
        // 1.변수선언 2.입력 3.출력
        double num2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("실수를 입력하세요.");
        num2 = scan.nextDouble(); // 실질적인 입력
        double result2 = (int)(num2*10000)/10000.0;
        System.out.println(result2);
        
        
//        double pi = 3.141592;
//        double result =  (int)(pi *1000)/ 1000;
//        System.out.println(result);
    
    }
}
