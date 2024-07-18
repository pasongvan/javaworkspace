package modifier03_protected;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.age = 30; // 같은 패키지 접근 가능 
    }
}
