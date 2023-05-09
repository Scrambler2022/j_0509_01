/*
package j_0509_01;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class _00_Class_04 {
    public static void main(String[] args) {
        // 아이디, 패스워드 , 이름을 입력받아 출력하시오.
        // 문자열, 정수형, 문자열
        //-----------------------
        // 아이디     패스워드     이름
        //-----------------------
        // abcd     11111          서건웅
        String id = "scrambler"; // 넥스트라인은 그 한줄전체를 받아서 출력을 한다.
        int password = 1111222;
        String name = "서건웅";
        Scanner scan = new Scanner(System.in); // scan = 변수명
        System.out.println("ID 를 입력하세요");
        id = scan.next(); // 인트를 받는형태의 스캔 != 더블은 넥스트 더블은 실수를 받는 것
        System.out.println("pasword 를 입력하세요");
        password = scan.nextInt();
        System.out.println("이름을 입력하세요");
        name = scan.next();
        System.out.println("------------------------------------");
        System.out.println("아이디\t\t패스워드\t\t이름");
        System.out.println("------------------------------------");
        System.out.printf("%s\t\n%d\t\n%s\t\n", id,password,name);
        ㅇ
    }
}
*/






import java.util.Scanner;

public class _00_Class_04 {
    public static void main(String[] args) {
        String id = "scrambler";
        int password = 1111222;
        String name = "서건웅";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ID 를 입력하세요");
        id = scan.next();
        
        while (true) {
            System.out.println("패스워드를 입력하세요 (7글자 이하)");
            password = scan.nextInt();
            String passwordString = Integer.toString(password);
            
            if (passwordString.length() <= 7) {
                break;
            } else {
                System.out.println("패스워드는 7글자 이하로 입력해주세요.");
            }
        }
        
        System.out.println("이름을 입력하세요");
        name = scan.next();
        System.out.println("------------------------------------");
        System.out.println("아이디\t\t패스워드\t\t이름");
        System.out.println("------------------------------------");
        System.out.printf("%s\t\n%d\t\n%s\t\n", id, password, name);
    }
}
