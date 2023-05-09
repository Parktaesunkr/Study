package tr0509;

public class HeadMountedDisplayTester {

	public static void main(String[] args) {
		HeadMountedDisplay hmd = new HeadMountedDisplay();
		
		hmd.putOn(); // 착용
		hmd.putOff(); // 해제
		hmd.changeSkin(Skinnable.YELLOW); // 스킨변경
		hmd.putSkin(); // 스킨 표시
		
		Wearable w = hmd;
		w.putOn();
		w.putOff();
		
		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK);
		
		hmd.putSkin();

	}

}
