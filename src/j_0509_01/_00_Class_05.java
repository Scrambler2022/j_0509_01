package j_0509_01;

public class _00_Class_05 {
    public static void main(String[] args) {
        int num1 =   3;
        int num2 =  4;
        int num3 =  5;
//        int result = (num2*num3)+num1;    // 23
//        System.out.println(result);
        int result = ++num3; // 5+1 = 6
        System.out.println(result);
        ++num3;
        num2++;
        int result2 = num2++; // 4
        System.out.println(result2);
        System.out.println(num2);
        
     }
}
