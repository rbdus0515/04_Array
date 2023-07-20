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
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 9-i;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for(int j = 0; j < num.length; j++) {
			if( j % 2 == 1) {
				sum += num[j];
			}
		}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
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
		
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		System.out.print("문자 : ");
		char ch2 = sc.next().charAt(0);
		
		int count = 0;
		
		boolean flag = false;
		
		char[] ch1 = new char[input.length()];
		
		for(int i = 0; i < ch1.length; i++) {
			ch1[i] = input.charAt(i);
			if(input.equals(ch2)) {
				System.out.println( i + "번쨰");
				flag = true;
				
			}
		}
		
		
		for(int j = 0; j < ch1.length; j++) {
			if(ch1[j] == ch2) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println( ch2 + " 개수 : " + count);
		}
		
		
		
	
		
		
	}
	
	public void practice6() {
		
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] num = new int[input];
		
		for(int i = 0; i < input; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			num[i] = sc.nextInt();
		}
		 for(int i = 0; i < input; i++) {
			 System.out.print(num[i] + " ");
		 }
		 System.out.println();
		 int sum =0;
		 for(int i = 0; i < input; i++ ) {
			 sum += num[i];
		 }
		 System.out.println("총 합 : " + sum);
		
		
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










