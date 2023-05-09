package j_0509_01;

import java.util.Scanner;

public class _00_Class_08 {
    public static void main(String[] args) {
        
        char ch = 'A';
        int num = ch+1;
        System.out.println((char) num);
        //대문자 입력시 소문자로 출력하시오.
        //1. 변수선언 2. 입력 3. 출력
        char ch2 = ' ' ;
        Scanner scan = new Scanner(System.in);
        System.out.println("대문자를 입력하세요.");
        ch = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
        char ch3 = (char) (ch+32);
        System.out.println("입력한 대문자 : "+ ch);
        System.out.println("변환된 문자 : "+ ch2);
        
        //소문자를 입력받아 대문자로 출력하시오.
        char ch4 = 'a';
        //Scanner scan = new Scanner(System.in);
        System.out.println("소문자를 입력하세요.");
        ch = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
        char ch5 = (char) (ch+32);
        System.out.println("입력한 소문자"+ ch);
        System.out.println("변환된 문자"+ch2);
        //이항연산자
        /*int num = 10;
        double  num2 = 10;
        double  num3 = num + num2;
        System.out.println();*/
    }
}
