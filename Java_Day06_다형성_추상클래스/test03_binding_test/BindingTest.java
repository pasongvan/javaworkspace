package test03_binding_test;


class Parent {
    String x = "parent x";
    
    public void static_method() {
        System.out.println("parent method.");
    }
    
//    public static void method() {
//        System.out.println("parent static method.");
//    }
}

class Child extends Parent{
    String x = "child x";
    
    @Override
    public void method() {
        System.out.println("child method.");
    }
    
//    public static void static_method() {
//        System.out.println("child static method.");
//    }
}

public class BindingTest {
    
    public static void main(String[] args) {
    	Parent p = new Child();
    	Child c = new Child();
    	
    	System.out.println(p.x); // 멤버 변수는 부모로 나오네?
    	p.method();
    	System.out.println(c.x);
    	c.method();
    	
    	p.static_method();
    	c.static_method();
    	
    	// 다형성
    	// 행위에 대한 내용
    	// 메소드에만 적용!
    	// 동적 바인딩: 상속 + 오버라이딩
   
        
    }

}
