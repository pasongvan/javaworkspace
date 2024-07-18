package modifier07_object_array;

public class StudentManager {
	// Student의 배열을 가지고 있는 객체
	// => 한개의 객체만 생성 => 싱글턴
	
	Student[] arr = new Student[100]; // 빈 배열
	int size = 0; // 실제 들어있는 개수
	
	// 1개의 인스턴스
	private static StudentManager instance = new StudentManager();
	
	private StudentManager() {}
		
	// 인스턴스 가져오기 메소드
    public StudentManager getInstance() {
    	return instance;
    }
    
    // 학생추가 메소드
    public void addStudent(Student st) {
    	if(size<100) {
    		arr[size] = st;
    		size++;
    	} else {
    		System.out.println("더 이상 추가 불가");
    	}
    }
}
