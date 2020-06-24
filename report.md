'''
package com.bit.demo2;

public class Flow01 {

	public static void main(String[] args) {
		// 1~25까지 연속하는 정수들을 출력
		for( int i = 1; i < 26; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// count가 5가 될 때마다 줄 바꿈
		int count = 0;
		for(int i = 1; i < 26; i++) {
			System.out.print(i+" ");
			count++;
			if(count == 5) {
				System.out.println();
				count = 0;
			}
		}
		
		// 차원 구조 : 2차 - 행, 열(x,y)
		// 행 : 5, 각 행마다 열 :5
		// 조건식 : 누구를 제어 할 것이고 그 기준이 뭔지 생각
		int v = 1;
		for(int row = 0; row < 6; row++) { // 대부분 밖 for문이 행
			for(int col = 0; col < 5; col++) { // 대부분 밖 for문이 열
				//System.out.print("("+row+","+col+")");
				if( v < 26) {
				System.out.print(v+",");
				}
				++v;
			}
			System.out.println();
		}
	}

}
'''
