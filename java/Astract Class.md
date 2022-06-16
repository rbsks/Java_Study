#### Abstract Class
  - method명의 일관성은 지키고 상속받은 class 내에서 method를 Override  
  - 클래스 계층구조에서 상위에 위치, 하위 클래스를 대표하는 클래스
  - 직접 객체화(instantiation) 될 수 없음. 즉 생성자를 사용해서 객체를 생성할 수 없음
  - 다른 클래스에 의하여 상속되어야 함. 즉 하위 클래스가 없는 추상 클래스는 의미가 없음
  - 추상 클래스는 하위 클래스가 있어야 하므로 구현시 클래스 앞에 final 키워드가 올 수 없음
  - 적어도 하나 이상의 추상 메소드를 가진 클래스는 반드시 추상이어야 함

 
#### Abstract Method
  - 메소드 몸체가 없는 메소드
  - 추상 메소드 정의 시 반환형 앞에 키워드 abstract를 기술
    - 메소드 몸체 구현 없이 바로 세미콜론을 삽입
  - 추상 메소드는 private와 finaal 사용불가

  - 예제  
  ``` java  
  abstract class Dao{ // Data Access object
	
	public void show() {
		System.out.println();
		
	}
	
	public abstract Object read(); // 추상메소드 구현되지 않은 메소드
	
	public abstract void save(Object arg); 
	
}

class ArrayDao extends Dao{
	
	private Object[] array;

	@Override
	public Object read() {
	
		return null;
	}

	@Override
	public void save(Object arg) {
		
		
	}
	
}   
```  
