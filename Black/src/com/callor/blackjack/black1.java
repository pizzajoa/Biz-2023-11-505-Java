package com.callor.blackjack;

import java.util.Scanner;

public class black1 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int playerTotal = 0;
	        int dealerTotal = 0;
	        
	        System.out.println("게임을 시작합\n");
	        
	        // 내차례
	        playerTotal = (int)(Math.random() * 10 + 1);
	        playerTotal = (int)(Math.random() * 10 + 1);
	        System.out.println("당신의 점수는: " + playerTotal);
	        System.out.println("카드를 뽑으시겟습니까?(h:진행 s:멈춤 (h/s)");
	        String playerMove = input.nextLine();
}
}
