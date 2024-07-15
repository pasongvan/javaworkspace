package java05_loop;

public class Loop01_for {
    public static void main(String[] args) {
        // for (초기화; 조건식; 증감식) { 반복 내용}
        // 조건식을 비워두면 항상 참으로 인식해서 끝나지 않음
        // 반복 횟수를 알고 있을 때 사용하면 좋다. 
        
        for (int i=0; i< 5; i++) {
            System.out.println(i);
        }
        
        for(int i = 0, j = 30; i < 10 && j >= 20; i+=10, j+=2) {
            System.out.println(i + " " + j);
        }
        
        // 중첩 반복문 (구구단)
        
        for (int i=2; i<=9; i++) {
            System.out.println(i+"단");
            for(int j=1; j<=9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
