package test04_inheritance;

public interface Speakable {
	
	// 인터페이스 다중 상속 시
	// 시그니처(반환형, 메소드, (매개변수))가 겹쳐도 상관없음
	// 어차피 구현부가 없으니까
	// 클래스가 구현할 때 내용을 정의하면 됨
	void eat(); 
	void speak();

}
