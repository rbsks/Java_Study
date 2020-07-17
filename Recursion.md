#### Recursion
  - Recursion alrgorithm(재귀 알고리즘)이란 특정 함수 내에서 자기 자신을 다시 호출하여 문제를 해결해나가는 함수.  
  - 원래 범위의 문제에서 더 작은 범위의 하위 문제를 먼저 해결함으로써 원래 문제를 해결해 나가는 방식.  
  - 일반 반복문을 통해 구현 가능한 기능은 재귀 알고리즘을 통해 구현이 가능하며, 반대로 재귀 알고리즘으로 구현한 기능을 반복문으로 구현 가능.  
  - 자기 자신을 계속 호출하는 방식이기 때문에 함수안에 반드시 종료 구간이 되는 Base Case를 생각하여 코드를 구현해야 한다.  
  - 예제  
  ``` java  
  package com.bit.arl;

public class Recursion {

	public static void func(int num) {
		
		if( num == 0) {
			return;
		}else {
			System.out.println("반갑습니다.");
			func(num-1);
		}
		
		
		
	}
	public static void main(String[] args) {

		func(3);
	}

}
```   
![image](https://user-images.githubusercontent.com/67041069/87786443-e57a9900-c874-11ea-979a-9ae1b6d0d765.png)
