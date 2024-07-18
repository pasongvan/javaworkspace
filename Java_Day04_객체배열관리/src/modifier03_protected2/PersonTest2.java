package modifier03_protected2;

import modifier03_protected.Person;

// 상속
public class PersonTest2 extends Person{
    public static void main(String[] args) {
        PersonTest2 p = new PersonTest2();

        // 상속 받은 다른 클래스에서는 가능
        p.age = 10;
        
    }
}
