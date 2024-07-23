package test05_normal_box;

class Box {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}

public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box(); // 아무거나 다 들어가는 박스
		
		// 넣을 때 Object로 넣고
		box.setObj(11);;
		box.setObj("Hello");
		box.setObj(41.22);
		
		// 꺼낼 때도 Object로 꺼내고
		Object obj = box.getObj();
		
		// 사용시 형변환 해야..
		if (obj instanceof Double) {
			System.out.println("실수형 값입니다.");
		}
		
		
	}
}








