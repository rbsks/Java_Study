```java  
package com.bit.deom1;
/*
 *  키보드로 입력을 받아 영문 갯수, 숫자의 총합 구하기.
 */
import java.util.Scanner;

public class Report {
	
	public static void main(String[] args) {
		
		String[] in = new String[10]; // 문자열 배열 객체생성
		int[] nums = new int[in.length]; // 정수 배열 객체생성
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		int engNum = 0; // 영어 갯수 카운터
		int iCount = 0;
		int total = 0; // 정수 총합
		
		
		for (int i = 0; i < in.length; i++) {
			System.out.print(i+1 + "번째 입력 값 : "); // 0번부터 시작이므로 +1을 해서 첫번째, 두번째...로 만들어 줌
			in[i] = sc.nextLine(); // 문자열로 입력값 받기
			char c = in[i].charAt(0); // in[i]에 해당하는 0번째 index에 들어있는 값을 확인
			
			if( ((int)c>64 && (int)c <91) ||(int) c>96 && (int)c<123 ) { // 아스키코드로 영어인지 아닌지 확인
					engNum++;
			}else if((int)c>47 && (int)c<58){// 영어가 아니면..
					nums[i] = Integer.parseInt(in[i]); // 문자열을 정수로 바꿔줌
					total += nums[i]; // 정수의 총 합
					iCount++;
			}
				
		}
		System.out.println("영단어의 갯수 : " + engNum);	
		System.out.println("총 합:" + total+", 숫자 개수 : "+iCount);
		sc.close();
	}
	
}


```
