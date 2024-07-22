package test07_abstract;

// 추상클래스 설정
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 쓰이지 않는 코드
    // 추상 메소드 설정
    public abstract void speak();

    public void eat() {
        System.out.println(name + "가 밥을 먹고 있습니다.");
    }

    // Getter와 Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}