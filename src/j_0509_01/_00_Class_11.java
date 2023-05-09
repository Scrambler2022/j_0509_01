package j_0509_01;

public class _00_Class_11 {
    public static void main(String[] args) {
        // double pi = 3.141592; 소수점 2자리에서 반올림해서 출력하시오.
        // 37.894
        double pi1 = 3.7894;
        double result1 = Math.round(pi1*10)/10.0; // 소수점 2째자리 반올림을 하여 3.8이 나온다
    
        System.out.println(result1);
        
        
        
        
        
        // 소수점 4자리에서 반올림 출력하시오.
        // 1.변수선언 2.출력
        double pi2 = 3.141592;
        double result2 = Math.round(pi2*1000)/1000.0; //소수점 3째자리까지 표현한다.
        
        System.out.println(result2);
    }
}
