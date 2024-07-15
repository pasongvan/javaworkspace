package java03_operator;

public class Op01_단항연산자 {

    public static void main(String[] args) {
       // 다음 중 올바른 값을 채워 넣으시오.
        int a = 5;
        System.out.println(a++); // 5 후위형: 먼저 값을 출력 후 증감
        System.out.println(++a); // 7 전위형: 먼저 값을 증감 후 출력
        System.out.println(--a); // 6
        System.out.println(a); // 6
        System.out.println(a--); // 6
        System.out.println(a++); // 5
        
        System.out.println(-a); // -6
        System.out.println(~a); // -7 : 1의 보수로 바뀜 ; 0=>1, 1=>0
        
        System.out.println(!false); // true : 논리 반전
        
    }
    
}
