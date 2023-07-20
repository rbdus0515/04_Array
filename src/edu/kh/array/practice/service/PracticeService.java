package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int[] num = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.print(num[i] + " ");
		}
		for(int j = 0; j < num.length; j++) {
			if(j % 2 == 0) {
				sum += num[j];	
			}
		}
			
		System.out.println();
		System.out.print("짝수 번째 인덱스 합 : " + sum);
		
			
			
		
		
		
		
	}
		
	public void practice2() {
		
		// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int[] num = new int[9];
		
		int sum = 0;
		
		for(int i = 9; i >= 0; i--) {
			num[i] = 
			System.out.print(i + " ");
		}
			
		
	}
	
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] num = new int[input];
		
		for(int i = 0; i < num.length; i++ ) {
			num[i] = i+1;
			System.out.print(num[i] + " ");
		}
		
		
	}
	
	public void practice4() {
		
		// 정수 5개를 입력 받아 배열을 초기화 하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		// 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
		int[] num = new int[5];
		
		boolean flag = false;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("입력 "+ i + " : ");
			num[i] = sc.nextInt();
		}
			System.out.print("검색할 값 : ");
			int input = sc.nextInt();
		
			for(int i = 0; i < num.length; i++) {
				
				if( num[i] == input ) {
					System.out.println("인덱스 : " + i);
					flag = true;
				}
			}
			if( !flag ) {
				System.out.println("일치하는 값이 존재하지 않습니다.");
			}
		
		
		
		
		
		
	}
	
	public void practice5() {
		
	}
	
	public void practice6() {
		
	}
	
	public void practice7() {
		
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
	}
	
	public void practice14() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}










