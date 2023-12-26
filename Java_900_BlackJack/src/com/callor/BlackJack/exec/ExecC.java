package com.callor.BlackJack.exec;

import java.util.Scanner;

import com.callor.BlackJack.service.CardService;
import com.callor.BlackJack.service.impl.CardServiceImplV1;

public class ExecC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CardService cardService = new CardServiceImplV1();
		//cardService.makeCardDack();
		
		while(true) {
			System.out.println(cardService.getCard());
			System.out.println("아무키나 누르세요....");
			scan.nextLine();
		}
		
	}
}
