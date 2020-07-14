``` java  
package com.bit.arl;

public class Star {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

}
```  
![image](https://user-images.githubusercontent.com/67041069/87431911-43637280-c622-11ea-90f7-288933708fcf.png)

