package tr0508;

import java.util.Scanner;

public class HumanPlayer extends Player{
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public int nextHand() {
		do {
			System.out.print("가위바위보!!!0..가위/1..바위/2..보 : ");
			hand = sc.nextInt();
		}while(hand <0 || hand > 2);
		return hand;
	}
	

}
