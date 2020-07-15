``` java  
package com.bit.arl;

public class Ascii {

	public static void main(String[] args) {  
		int i = 0;  
		// 첫번째 방법
		for(char a = 'A'; a <= 'z'; ++a) {
			
			if(a>'Z' && a < 'a') {
				continue;	
			}else if(i%5 == 0 && a != 'A' ){
				System.out.println();
				System.out.print(a);
			}else if( a == 'Z'){
				System.out.println();

			}else {
				System.out.print(a);
			}
			++i;
			if(a == 'Z') {
				i = 0;
			}
				
		}
	}  
	
		int j = 0;
		// 두번째 방법
		for(char a = 'A'; a <= 'z'; a++) {
			System.out.print(a);
			if(++j%5 == 0) {
			   System.out.println();
			}
			if(a == 'Z') {
			   System.out.println();
			   a = 'a'-1;
			   j = 0;
			}
		}

}
```  
![image](https://user-images.githubusercontent.com/67041069/87432282-bff65100-c622-11ea-8487-a0f3d8111033.png)
