// 영문,숫자와 기호를 문자와 문자 코드로 표시
package tr0510;

public class PrintAscii {

	public static void main(String[] args) {
	for(char i = 0x21; i <= 0x7E; i++)
		System.out.printf("%c %04x\n",i,(int)i);

	}

}
