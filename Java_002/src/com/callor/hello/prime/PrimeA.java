package com.callor.hello.prime;

import java.net.MulticastSocket;

public class PrimeA {
	public static void main(String[] args) {
/*		int num = 0;
		for( int i = 2; i < num-1 ; i++ ){
			for( int j =0; j <= i ; j++) {
				if (i % j == 0)
					num = num+1;
		}
		if (num==2) 
			System.out.println(i + ",");
			
		}
*/
		int num = 9;
		System.out.println("============");
		System.out.println(num + "는 Prime Number 인가?");
		System.out.println("------------");
		for(int i = 2; i < num ; i++) {
			
			System.out.printf("%d MOD %d = %d", num, i, num % i);
			System.out.println("");
			
			
			
		}
		
		
		
		
	}
}
