#### Abstract  
  - method명의 일관성은 지키고 상속받은 class 내에서 method를 Override  
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
