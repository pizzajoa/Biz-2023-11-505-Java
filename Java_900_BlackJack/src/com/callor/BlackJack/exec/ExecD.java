package com.callor.BlackJack.exec;

import com.callor.BlackJack.service.CardService;
import com.callor.BlackJack.service.PlayerService;
import com.callor.BlackJack.service.impl.CardServiceImplV1;
import com.callor.BlackJack.service.impl.PlayerServiceImplV2;

public class ExecD {
	
	public static void main(String[] args) {
		CardService cardService = new CardServiceImplV1();
		PlayerService 딜러 = new PlayerServiceImplV2();
		PlayerService 타짜1 = new PlayerServiceImplV2("홍길동");
		PlayerService 타짜2 = new PlayerServiceImplV2("이몽룡");
		
		for(int i = 0 ; i < 2 ; i++) {
			딜러.hit(cardService.getCard());
			타짜1.hit(cardService.getCard());
			타짜2.hit(cardService.getCard());
		}
		
		System.out.println("딜러=====================");
		딜러.showCard();
		
		System.out.println("타짜1====================");
		타짜1.showCard();

		System.out.println("타짜2====================");
		타짜2.showCard();

		
		if(딜러.getScore() > 타짜1.getScore() 
				&& 딜러.getScore() > 타짜2.getScore() ) {
			System.out.printf("딜러 승 : %d\n",딜러.getScore());
		} else if(타짜1.getScore() > 딜러.getScore() 
				&& 타짜1.getScore() > 타짜2.getScore() ) {
			System.out.printf("타짜1 승 : %d\n",타짜1.getScore());
		} else if(타짜2.getScore() > 딜러.getScore() 
				&& 타짜2.getScore() > 타짜1.getScore() ) {
			System.out.printf("타짜2 승 : %d\n",타짜2.getScore());
		} else {
			System.out.println("무 승부");
		}
		
	}

}
