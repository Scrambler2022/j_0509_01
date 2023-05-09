package j_0509_01;

public class _00_Class_01 {
    public static void main(String[] args) {
        // 변수 - 8가지
        // 논리형 - boolean
        // 문자형 - char    '    '
        // 정수형 - byte, short, int, long
        // 실수형 - float, double
        //문자열 - String

        char ch = 'a'; // 한글자만 가능 = ASCII  코드로 저장
        int num = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;
        int[] vars = new int[10];
        for (int i = 0; i < 10; i++) {
            vars[i] = i + 1;
        }
        System.out.printf("더하기 결과값 : %d        \n",num + num ); // %n 줄단락 변경   %랑 \ 랑 같대
        System.out.printf("나누기 결과값 : %f         \n", num/(double)num2); //



        System.out.println("더하기 결과값 : "+ (num + num2)); // ln 줄단락 변경
        System.out.println(num-num2);
        System.out.println(num*num2);
        System.out.println(num/(double)num2);
        System.out.println(7+5);
        System.out.println(7-5);
        System.out.println(7*5);
        System.out.println(7/5);

    }
}
