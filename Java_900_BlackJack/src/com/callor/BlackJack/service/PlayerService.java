package com.callor.BlackJack.service;

import com.callor.BlackJack.models.CardDto;

public interface PlayerService {
	
	public void hit(CardDto card);
	public void showCard();
	public int getScore();
}