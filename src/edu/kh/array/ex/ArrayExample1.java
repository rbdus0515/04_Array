package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/* 배열 ( Array )
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 * 	 구분은 index를 이용한다. (index는 0부터 시작하는 정수)
	 * 
	 */
	
	public void ex1() {
		
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10을 대입.
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성 된 자리에 num에 저장된 값을 읽어와서 출력
		
		//----------------------------------------------------------------------
		
		// 배열 선언
		int[] arr;
		// Stack 영역에 int[] (int 배열) 자료형 공간을 4byte를 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// - 해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		// 		 Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : Heap 영역에 int 3칸짜리 int[]를 생성(할당)
		// - 생성된 int[]에는 시작 주소가 지정된다!!!
		
		// arr = new int[3];
		// (int[]) (int[]) => 같은 자료형 == 연산 가능
		
		// Heap 영역에 생성된 int[]의 시작주소를
		// Stack 영역에 생성된 arr 변수에 대입
		
		// -> arr 변수가 int[]를 참조하게 됨
		//	그래서 arr을 참조형이라고 함.
		
		
		// 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0]은 int 자료형 변수이기 때문에 정수값을 대입할 수 있다!
		
		arr[0] = 10;
		
		arr[1] = 50;
		
		arr[2] = 1000;
		
		System.out.println("arr의 주소 값 : " + arr);
		
		// 배열 요소 값 읽어오기
		System.out.println( arr[0] ); // arr이 참조하고 있는 배열의 0번째 인덱스 값을 얻어옴
		System.out.println( arr[1] ); // arr이 참조하고 있는 배열의 1번째 인덱스 값을 얻어옴
		System.out.println( arr[2] ); // arr이 참조하고 있는 배열의 2번째 인덱스 값을 얻어옴
		
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		// 배열의 길이 (몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열과 for문
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n" , i , arr[i]);
		}
		
		
	}
	
	public void ex3() {
		
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 145.7
		// 3번 키 입력 : 165.1
		// 4번 키 입력 : 172.2
		// 5번 키 입력 : 158.9
		
		// 평균 : ~cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		// double[] 자료형 참조 변수 height를 Stack 영역에 생성하고
		// height에 Heap 영역에 새로 생성된 double 5칸짜리 double[]의 시작주소를 대입
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			// 각 인덱스에 입력 받은 값을 대입(초기화)
		}
		System.out.println();
		
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			
			sum += height[i]; // 배열에 저장된 값을 sum에 누적
		}
		
		System.out.printf("평균 : %.2f\n" , sum / height.length);
		
	}
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
			
			sum += score[i];
		}
		
		// 최고, 최저점 구하기
		int max = score[0];
		int min = score[0];
		
		// 아래 for문을 이용해서 score 배열에 있는 모든 값과 max, min를 비교
		// score[i] 같이 max 보다 크면 max에 대입
		// score[i] 같이 min 보다 작으면 min에 대입
		
		for(int i = 0; i < score.length; i++) {
			
			if(score[i] > max) { // 최고점 비교
				max = score[i];
			}
			
			if(score[i] > max) { // 최저점 비교
				max = score[i];
			}
		}
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n" , (double)sum/score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
		
	}
	
	public void ex5() {
		
		// 배열 선언과 동시에 초기화
		
		char[] arr = new char[5];
		
		// char[] arr이 참조하는 배열 요소에 A,B,C,D,E 대입하기
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
			// A == 65
			// B == 66
			// C == 67
		}
		
		// Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		// Arrays.toString(배열명) : 모든 요소 값을 출력
		
		int[] arr2 = new int[4];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		// 배열 선언과 동시에 (할당 및) 초기화
		char[] arr3 = {'A','B','c','D','E'};
		// {} 중괄호는 배열의 리터럴 표기법
		
		System.out.println(Arrays.toString(arr3));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















