### Object Oriented Programming  (객체 지향 프로그래밍)
  - OOP의 4개의 특성 
    - 추상화
      - 하나이상의 추상 메소드를 갖는 클래스
      - 추상 클래스를 상속하는 하위 클래스에서 추상 메소드들이 구현되어야 함
    - 상속
      - 자식 클래스가 부모 클래스의 특성을 물려 받는 것
      - 기능의 일부분만 변경하는 경우 자식 클래스가 상속을 받아 수정하여 재 사용
      - 상속은 캡슐화를 유지하고 클래스의 재사용이 용이
    - 캡슐화
      - 실제로 구현 부분을 외부로 드러내지 않는 것
      - 변수와 메소드를 하나로 묶고 필드에 접근하려면 메소드를 통해 하도록 함
    - 다형성
      - 어떤 메소드, 변수가 상황에 따라 다른 결과를 내는 것
  - OOP 5가지 원칙 SOLID
    - SRP(Single Responsibility Principle), 단일 책임 원칙(분류)
      - 한 클래스는 단일의 책임만 가져야 한다
      - 중요한 기준은 변경임. 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것
      - 결제 기능으로 예를 들면 payment는 payment service
      - TMS는 tms service, payment status는 payment status service
      - 이런식으로 기능별로 분리해주는 것이 좋다
      - 분리를 하게되면 서로 수정을해서 컨플릭이 날 확률이 적어짐
      - 컨플릭 방지 및 역할에 해당하는 서비스를 찾기 쉬움
    - OCP(Open/Closed Principle), 개방 폐쇄 원칙(교체) 
      - 확장에는 열려있고, 변경에는 닫혀있다
      - 수정하지 말고, 클래스를 신규 추가하라
      - 다형성을 활용하여 인터페이스를 구현한 새로운 클래스를 하나 만들어 새로운 기능을 구현
      - 객체를 생성하고 연관관계를 맺어주는 별도의 조립, 설정자가 필요
        - 예를 들어 MemberService가 MemberRepository의 구현체를 직접 선택하게 되면 구현체를 변경하려면 MemberService의 코드를 일부 수정해야 한다 이렇게 되면 확장에는 열려있지만 변경에는 닫혀있지 않게 됨. 이 부분을 해결하기 위해 객체를 생성하고 연관관계를 맺어주는 설정자가 필요(이것을 스프링 컨테이너가 해줌)
      - 예를 들어 merchant serivce가 있는데 처음에는 우리나라만 서비스하던 어플리케이션이 너무 잘 돼서 해외까지 진출하게 되었을 때 해외 별로 다르게 적용되는 부분 들이 있어서 같은 merchant service에다 다른 나라의 메소드를 추가하거나 기존 메소드에 조건문을 추가하여 사용 하다보면 가끔 국가 별 로직을 빼먹는 경우가 생기는 등 큰 혼동이 올 수 있다 이럴 때 OCP를 이용하여 merchant service를 interface로 만들고 나라별로 interface를 상속 받아 메소드를 직접 구현하여 쓰면 위에 언급한 문제들의 발생을 줄일 수 있다.
      - If else에서 반복적인 케이스가 보이면 클래스 분리를 고려해야 함

    - LSP(Leskov’s Substitution Principle), 리스코프 치환 법칙(교체) 
      - 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 함
      - 서브타입은 언제나 기반타입으로 교체할 수 있어야 한다.
      - 상속받은 클래스는 부모 클래스와 동일한 동작을 해야 재활용 가능성이 높아진다.
      - 서로 다른 동작, 기능을 하는 클래스가 상속 받으면 안 됨
      - 실무에서는 의외로 상속을 많이 사용하지 않는다.
      - 상속 시 오버라이드를 한 것과 아닌 것의 혼란
      - 상속 오버라이드를 잘못하면 로직 충돌(Fragile  base class)
      - 기능을 너무 확장하거나 변경하면 재활용성이 낮아짐
      - 상속의 대안 또는 상속을 잘 하는 방법
          - 상속을 위한 설계를 한 클래스만 상속하라(추상 클래스에서 절대 변하지 않는 기능들은 구현해 놓고 꼭 오버라이드 해야만 하는 메소드들만 추상화해서 설계)
          - 부모 클래스 상속 대신 인터페이스를 활용하라
          - 피할 수 없다면 상속을 하지만 부모와 상호 치환이 가능하도록 하라 (부모 클래스와 동일한 기능 제공)
      - 상속보다는 인터페이스를 고려하고 상속을 해도 비슷하게 만들어야 교체가 쉬움

    - ISP(Interface Segregation Principle), 인터페이스 분리 원칙(분류) 
      - 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 나음
      - 인터페이스를 분리하면 어떤 하나의 인터페이스가 변해도 다른 인터페이스의 영향을 주지 않아서 인터페이스가 명확해지고 대체 가능성이 높아짐
      - 인터페이스도 단일 책임을 갖도록 해야 한다
      - SRP와 다소 유사하지만 인터페이스도 단일의 책임을 갖도록 설계해야 필요한 기능만 구현하고 제공할 수 있다
      - 너무 큰 인터페이스를 만들면 빈 메서드를 만드는 경우가 발생
      - 인터페이스를 조금더 세분화해서 분리해야한다. 사용하는 기능만 구현하여 제공해야 함
      - 인터페이스도 SRP를 따라야 구현이 편리하고 재활용성이 올라감

    - DIP(Dependency Inversion Principle), 의존성 역전 원칙(교체) 
      - 추상화에 의존해야지 구현체에 의존하면 안 됨. 구현체에 의존하지 말고 인터페이스에 의존 하라는 뜻
      - 하위 모듈의 변경이 상위 모듈의 변경을 요구하는 의존성을 끊어내야 한다
      - 개발을 하다보면 내가 사용하던 라이브러리를 다른 라이브러리로 변경하면 코드를 다 뜯어 고쳐야 하는 경우가 있는데 이렇게 라이브러리에 직접적으로 의존하면 교체가 어려움
      - 보통은 상위 모듈이 하위 모듈에 의존
      - 근데 이것을 하위 모듈이 상위 모듈에 의존하게 의존성을 역전 시키는 것
      - 하위 모듈에 너무 의존하면 변경이 어려움. 중간에 인터페이스를 둬야 하위 모듈 변경이 쉬움

  - java는 객체 지향 언어이다.
  - 객체지향이란 우리가 원하는 기능이 어디있는지 빨리 찾고 각 클래스들의 재활용성이 높고 우리가 원하는 부분을 의존성이 낮아 손 쉽게 갈아 끼워서 바꿀 수 있어야 함.
  - field와 method를 member라고 부른다.  
  - 예제  
  ``` java  
  public class Dummy {  
      field : 접근자 자료형 변수명;으로 선언  
      method : 접근자 반환형 메소드명(매개변수) {
                      실행내용  
                      필드에 대한 처리 표현  
               }    
  ```  
  ``` java  
  public class Main {  
  
    public static void main(String[] args) {  
        Dummy ex(클래스형 변수) = new Dummy(); // 객체 생성
    
    }   
 ```  
 
  
  
