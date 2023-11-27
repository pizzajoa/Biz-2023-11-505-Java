package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {

		int num1 = 7;
		boolean noPrime = false;
		int index = 2;
		for ( index = 2; index < num1; index++) {
			if (num1 % index == 0) { // prime가 아니다
				noPrime = true;
				break;
			}

		}
		if (noPrime) {
			System.out.printf("%d MOD %d = %d ", num1, index, num1 % index);
			System.out.println(num1 + "는 소수가 아님");
		} else {
			System.out.println(num1 + "는 소수임");
		}

		
			}
		}
	
