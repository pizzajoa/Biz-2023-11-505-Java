package jjh.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import jjh.domain.CardVO;

public class GameService {
	private List<CardVO> deck; // 덱
    private List<CardVO> playerHand; // 플레이어가 받은 카드
    private List<CardVO> dealerHand; // 딜러가 받은 카드
    private Scanner scanner;
    
    public GameService() { // 생성자
        deck = new ArrayList<>();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeDeck();
        shuffleDeck(10);
    }
    
    private void initializeDeck() { // 덱을 생성하는 함수
        String[] suits = {"하트", "다이아몬드", "클로버", "스페이드"}; // 문양 배열
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // 카드숫자 배열
        
        for(int i = 0; i < suits.length; i++) { // 문양별로 반복
        	for(int j = 0; j < ranks.length; j++) { // 카드숫자별로 반복
        		CardVO card = new CardVO(ranks[j], suits[i]); // CardVO 생성자
                deck.add(card); // 덱에 카드 추가
        	}
        }
    }

    private void shuffleDeck(int num) { // 덱을 섞는 함수
    	for(int i = 0; i < num; i++) { // 덱을 num번 섞습니다.
    		Collections.shuffle(deck);
    	}
    }
    
    public void startGame() {
        // 시작 시 카드 나눠주기
        dealInitialCards();

        // 게임 진행
        while (true) {
            displayHands();
            if (isBust(playerHand)) {
                System.out.println("점수가 21을 초과해서 게임에서 졌습니다.");
                break;
            }

            System.out.println("카드를 뽑으시겠습니까? 뽑으시려면 h를 멈추시려면 s를 입력해주세요. (h/s)");
            String choice = scanner.nextLine();

            if (choice.equals("h")) {
                playerHand.add(drawCard());
            } else if (choice.equals("s")) {
                while (calculateHandValue(dealerHand) < 17) { // 딜러의 점수가 17 미만이면 추가로 뽑기
                    dealerHand.add(drawCard());
                }

                displayHands();

                if (isBust(dealerHand) || calculateHandValue(playerHand) > calculateHandValue(dealerHand)) {
                    System.out.println("플레이어 승리");
                } else if (calculateHandValue(playerHand) < calculateHandValue(dealerHand)) {
                    System.out.println("플레이어 패배");
                } else {
                    System.out.println("무승부");
                }

                break;
            }
        }

        scanner.close();
    }
    
    private void dealInitialCards() {
        playerHand.add(drawCard()); // 플레이어 1장
        dealerHand.add(drawCard()); // 딜러 1장
        playerHand.add(drawCard()); // 플레이어 1장
        dealerHand.add(drawCard()); // 딜러 1장
    }

    private CardVO drawCard() {
        return deck.remove(0); // deck.remove는 리스트에서 제거함과 동시에 제거된값을 리턴함
    }

    private void displayHands() {
    	System.out.println("플레이어 손패 : " + playerHand + " (점수 : " + calculateHandValue(playerHand) + ")");
    	System.out.println("딜러 손패 : " + dealerHand + " (점수 : " + calculateHandValue(dealerHand) + ")");
    }

    private int calculateHandValue(List<CardVO> hand) {
        int value = 0;

        for (CardVO card : hand) {
            if ("A".equals(card.getRank())) {
                value += 1; // A는 1로 취급
            } else if (card.isFaceCard()) { // J, Q, K면 true를 리턴해주는 함수
                value += 10;
            } else {
                value += Integer.valueOf(card.getRank());
            }
        }

        return value;
    }

    private boolean isBust(List<CardVO> hand) {
        return calculateHandValue(hand) > 21;
    }
}
