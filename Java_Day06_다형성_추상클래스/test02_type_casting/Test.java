package test02_type_casting;

public class Test {
    public static void main(String[] args) {
    	// 참조형 변수의 형 변환
    	// 1. 묵시적 형변환: 자손 타입 => 조상 타입
    	Person p = new Student();
    	
    	// 2. 명시적 형변환: 조상 타입 => 자손 타입
//    	Student st = (Student) new Person(); // 되는 것 같다!?
//    	st.eat(); // 안됨!
    	// 컴파일은 되었지만 실행 중 에러 발생
    	// 컴파일: 문법적 오류 없음
    	
    	// 명시적 형 변환인데도 에러가 안나는 경우
    	// 자손 객체 => 부모 클래스 => 자손 객체
        Student st = (Student) p;
        
        // 객체배열관리: 다형성 이용 대표적 사례
        Person[] persons = new Person[3];
        persons[0] = new Person("Park", 27);
        persons[1] = new Student("Kim", 22, "Java");
        persons[2] = new Student("Lee", 29, "Java");
        
        for(Person person : persons) {
//        	System.out.println(person);
//        	person.eat();
        	
        	//Student 객체만 출력하기
//        	if (person instanceof Student)
//        		System.out.println(person);
        	
        	//Person인 것 만 출력
        	if (!(person instanceof Student))
        		System.out.println(person);
        }
        
        // instanceof 연산자
        // 객체변수 instanceof 클래스이름
        // 해당 클래스 인스턴스인지? <= 이게 아니라
        // 해당 클래스로 묵시적 형변환이 가능한지 <= 이거임!
        // 자손 클래스는 부모클래스이기도 함!
        // 학생은 사람이다
        
        
    }
}
