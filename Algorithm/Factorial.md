``` java  
package com.bit.arl;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int j = sc.nextInt();
		int result1 = 1;
		int result2 = 1;
		for(int i = 1; i <= j; i++) {
			if(i==j) {
				System.out.print(1 + " ");
			}else if(i==1) {
				System.out.print(j + " * ");
			}else {
				System.out.print(j-i+1 + " * ");
			}
			
			result1 *= i;
		}
		System.out.println("= "+result1);  
                for(int i = j; i >= 1; i--) {
			if(i==1) {
			  System.out.print(1 + " ");
			}else {
			  System.out.print(i + " * ");
			}
			result2 *= i;
                }
                System.out.println("= " + result2);
		sc.close();
	}

}
```  
![image](https://user-images.githubusercontent.com/67041069/87432013-668e2200-c622-11ea-875e-f91382a691cf.png)
