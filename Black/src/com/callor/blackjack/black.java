package com.callor.blackjack;

import java.util.Scanner;

public class black {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerTotal = 0;
        int dealerTotal = 0;
        
        System.out.println("게임을 시작합니다\n");
        
        // 내차례
        playerTotal += (int)(Math.random() * 9 );
        playerTotal += (int)(Math.random() * 9 );
        System.out.println("당신의 점수는: " + playerTotal);
        System.out.println("카드를 뽑으시겟습니까?(h:진행 s:멈춤 (h/s)");
        String playerMove = input.nextLine();
        
        while (playerMove.equals("h")) {
            int hit = (int)(Math.random() * 10);
            playerTotal += hit;
            System.out.println(hit + "점을 얻었습니다" + ". 총 점수는 " + playerTotal);
            if (playerTotal > 21) {
                System.out.println("파산! 딜러가 이겼습니다!");
                break;
            }
            System.out.println("카드를 뽑으시겟습니까?(h:진행 s:멈춤 (h/s)");
            playerMove = input.nextLine();
        }
        
        // 딜러차례
        dealerTotal += (int)(Math.random() * 10);
        dealerTotal += (int)(Math.random() * 10);
        System.out.println("\n딜러의 점수는: " + dealerTotal);
        
        while (dealerTotal < 17) {
            int hit = (int)(Math.random() * 10);
            dealerTotal += hit;
            System.out.println(hit + "점을 얻었습니다" + ". 총 점수는 " + + dealerTotal);
        }
        
        // 승자결정
        if (dealerTotal > 21) {
            System.out.println("딜러 파산! 당신이 이겼습니다!");
        } else if (dealerTotal > playerTotal) {
            System.out.println("패배! 딜러가 이겼습니다!");
        } else {
            System.out.println("당신이 이겼습니다!");
        }
        
        input.close();
    }
}
