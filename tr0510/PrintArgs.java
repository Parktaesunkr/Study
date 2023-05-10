// 커맨드라인 인수 표시
package tr0510;

public class PrintArgs {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "] =" + args[i]);

	}

}
