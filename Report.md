''' java  
package com.bit.deom1;
/*
 *  키보드로 입력을 받아 영문 갯수, 숫자의 총합 구하기.
 */
import java.util.Scanner;

public class Report {
	
	public static void main(String[] args) {
		
		String[] in = new String[10];
		int[] nums = new int[in.length];
		Scanner sc = new Scanner(System.in);
		int Engnum = 0;
		int total = 0;
		
		
		for (int i = 0; i < in.length; i++) {
			System.out.print(i+1 + "번째 입력 값 : ");
			in[i] = sc.nextLine();
			char c = in[i].charAt(0);
			
			if( ((int)c>64 && (int)c <91) ||(int) c>96 && (int)c<123 ) {
					Engnum++;
			}else {
					nums[i] = Integer.parseInt(in[i]);
					total += nums[i];
			}
				
		}
		System.out.println("영단어의 갯수 : " + Engnum);	
		System.out.println("총 합:" + total);
		sc.close();
	}
	
}
'''
