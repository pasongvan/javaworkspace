package modifier06_singleton;

public class ScoreTest {
    public static void main(String[] args) {

    	// ScoreManager sm = new ScoreManager(); // private이라 불가

    	// getInstance static 메소드를 이용해 객체를 가져온다
    	// 두개는 같은 객체; 참조값 같음
    	ScoreManager sm1 = ScoreManager.getInstance();
    	ScoreManager sm2 = ScoreManager.getInstance();
    }
}
