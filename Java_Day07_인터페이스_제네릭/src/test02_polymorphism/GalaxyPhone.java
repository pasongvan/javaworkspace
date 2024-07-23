package test02_polymorphism;

// 특정 인터페이스 구현 => 인터페이스 정의된 메소드(기능) 구현 강제
public class GalaxyPhone implements AlarmSound {

	@Override
	public void playAlarm() {
		System.out.println("Ding Ding Ding!");
		
	}

}
