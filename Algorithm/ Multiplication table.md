``` java  
package com.bit.arl;

public class gogodan {

	public static void main(String[] args) {

		for(int i = 2; i < 10; i+=2) {
			System.out.println(i+"단\t"+ (i+1) +"단\t");
			for(int j = 1; j < 10; j++) {
				for(int k = i; k < i+2; k++) {
					System.out.print(k+"*"+j+"="+k*j+"\t");
				}
				System.out.println();
			}
			System.out.println();

		}
	}
	
}
```  
![image](https://user-images.githubusercontent.com/67041069/87432143-90dfdf80-c622-11ea-9980-8ae74e32eef1.png)
