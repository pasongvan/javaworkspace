package modifier05_getter_setter;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.setAge(30);
        System.out.println(p.getAge());
        
        p.setAge(-1);
        System.out.println(p.getAge());

    }
}
