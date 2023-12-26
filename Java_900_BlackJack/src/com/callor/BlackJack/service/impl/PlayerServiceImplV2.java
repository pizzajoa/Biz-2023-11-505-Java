package com.callor.BlackJack.service.impl;

import com.callor.BlackJack.models.CardDto;
import com.callor.BlackJack.utils.AnsiConsol;
import com.callor.BlackJack.utils.Line;

public class PlayerServiceImplV2 extends PlayerServiceImplV1{


	public PlayerServiceImplV2() {
		super("딜러");
	}
	public PlayerServiceImplV2(String playerName) {
		super(playerName);
	}
	

	@Override
	public void showCard() {
		
		if(myCardList.isEmpty()) {
			System.out.println("현재 보유중인 카드 없음");
			return;
		}
		
		Line.dline(100);
		System.out.printf("%s, 받은카드 : %d, %d점\n", this.playerName, this.myCardList.size(),getScore());
		// 카드 한장을 그리는 데 필요한 라인 수
		
		int patternsCount = myCardList.get(0).getPatterns().length;
		
		for(int lines = 0; lines < patternsCount ; lines++) {
			for(CardDto dto : myCardList) {
			//	String line = dto.getPatterns()[lines];
				
				
				String line = String.format("%10s",dto.getPatterns(lines));
				
				if("◆♣".contains(dto.suit)) {
					System.out.print(AnsiConsol.RED(line));
				} else {
					System.out.println(AnsiConsol.CYAN(line));
				}
				
				System.out.printf("%10s",line);
			}
			System.out.println();
		}
	}

	

}