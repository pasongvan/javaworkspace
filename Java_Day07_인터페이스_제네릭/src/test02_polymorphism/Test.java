package test02_polymorphism;

public class Test {

	public static void main(String[] args) {
		// 인터페이스 다형성
		AlarmSound galaxyPhone = new GalaxyPhone();
		AlarmSound iPhone = new Iphone();
		
		galaxyPhone.playAlarm();
		iPhone.playAlarm();
		
		AlarmSound[] phones = {new GalaxyPhone(), new Iphone()};
		for (AlarmSound phone : phones) {
			phone.playAlarm();
		}

	}

}
