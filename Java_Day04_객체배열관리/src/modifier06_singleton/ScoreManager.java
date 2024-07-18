package modifier06_singleton;

// 점수를 관리하는 객체
// 점수는 1개만 있음
// => 객체도 1개만 만든다
public class ScoreManager {
	private int score;
	
	// 싱글턴으로 만들기
	
	// 2. 내가 인스턴스는 한개만 만들어 가지고 있자
	private static ScoreManager manager = new ScoreManager();
	
	// 1. 오로지 1개만 생성되도록 => 외부에서 생성자 호출 못하도록 해야
	//	-생성자를 private으로 만든다.
	private ScoreManager() {}
	
	// 3. 인스턴스를 외부에서 가져다 쓸 수 있도록 public으로 getter 추가
	// 4. static 추가: 외부에서 객체 생성 없이 클래스 이름으로 바로 접근할 수 있도록
	public static ScoreManager getInstance() {
		return manager;
	}
}
