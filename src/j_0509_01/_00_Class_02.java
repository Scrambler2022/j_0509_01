package j_0509_01;

public class _00_Class_02 {
    public static void main(String[] args) {
        int kor = 100;
        int eng = 90;
        int math = 89;
        int total = kor+eng+math;
        double avg = total/3.0;
        System.out.println("------------------------------------");
        System.out.println("국어\t\t영어\t\t수학\t\t합계\t\t평균");
        System.out.println("------------------------------------");
        System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f \n", kor,eng, math,total,avg);

    }
}
