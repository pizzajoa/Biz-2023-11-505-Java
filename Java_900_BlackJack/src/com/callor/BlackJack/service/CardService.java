package com.callor.BlackJack.service;

import com.callor.BlackJack.models.CardDto;

public interface CardService {
	
	public void makeCardDeck();
	public CardDto getCard();

}