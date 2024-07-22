package test05_inheritance;
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("고양이가 말합니다: 야옹");
    }
}