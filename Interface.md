#### Interface  
  - Interface는 class가 아니다.  
  - 변수선언 불가, 상수만 선언 가능.  
  - 추상 메소드만 작성 가능.  
  - 다중 상속이 가능.  
  - interface - abstract method - implements 순으로 작성  
  - 예제  
  ``` java  
  interface Workable{ // 1. interface
	// 설계 개념
	final int code = 0; // final keyword를 안써도 interface는 default가 final이기 때문에 final을 안써줘도 되는데 쓰는게 좋다.

	// 2. abstract class
	public abstract void todo(); // abstract가 없어도 추상메소드로 잡힘.
	public abstract void something();
	
}

class WorkImpl implements Workable { // 3. implements class 상속과 다르게 다중이 가능

	@Override
	public void todo() {
		System.out.println("ll");
	}

	@Override
	public void something() {
		System.out.println("kk");
	} 
	
}  
```
