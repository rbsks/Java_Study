#### List  
  - List 자료형에는 ArrayList, LinkedList, Vector가 있다.  
  - 애플리케이션 새발 업무에 List collection이 많이 쓰이고 특히 ArrayList가 많이 사용된다.  
  - 객체를 일렬로 늘어놓은 구조이다. add, contain, get, size, remove, clear 메서드가 선언 되어 있다.  
  
#### ArrayList  
  - List collection 인터페이스를 구현한 클래스이다.  
  - 일반 배열과 인덱스로 객체를 관리한다는 점은 동일하지만 크기를 동적으로 늘릴 수 있는 차이가 있다.  
  - 제네릭스는 클래스형만 사용 가능  
  - 예제  
  ``` java  
  List<Integer> nums = new ArrayList<Integer>();
  nums.add(1); // 0번 배열에 값 추가  
  nums.add(2); // 1번 배열에 값 추가  
  nums.add(2, 3);  // 2번 배열에 값 추가
  System.out.println(nums.size()); // 현재 배열 사이즈 출력  
  ```  
  
