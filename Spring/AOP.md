### AOP  
  - AOP는 문제를 바라보는 관점을 기준으로 프로그래밍하는 기법이다.  
  - AOP에서 중요한 개념은 횡단 관점의 분리 Separation of Cross-Cutting Concern이다.  
  - OOP를 더욱 OOP답게 만들어 준다.  
  - 공통관심사항(cross-cutting concern) : 개발자, 운영자 관점, 핵심관심사항(core concern) : 사용자 관점  
  - 핵심 로직을 구현한 코드에서 공통 기능을 직접 호출하지 않고 횡단 관점까지 분리함으로써 각 모듈로부터 관점에 관한 코드를 완전히 제거하는 것을 목표로 한다.    
  - 횡단관점의 분리  
    ![image](https://user-images.githubusercontent.com/67041069/89755519-b4f7e900-db1a-11ea-9a1b-35451982a99d.png)  
    
  - Join Point
    - 클래스의 인스턴스 생성 시점, 메소드 호출 시점 및 예외 발생 시점과 같이 애플리케이션을 실행할 때 특정 작업이 시작되는 시점  
    - Advice를 적용 가능한 지점  
    - 스프링 AOP에서는 메소드 실행으로 표현됨  
  
  - Advice
    - 특정한 Joint point에서의 행위(삽입되어져 동작할 수 있는 코드).  
    - Before advice, After returning advice, After throwing advice, After (finally) advice, Around advice  
  
  - Pointcut  
    - Joint point의 부분집합  
    - 실제로 Advice가 적용되는 Joint point  
    - 스프링에서는 정규 표현식이나 AspectJ의 문법을 이용하여 Pointcut을 정의할 수 있음   

  - Weaving  
    - Advice(공통코드)를 핵심 로직 코드에 삽입하는 것  
    
  - Target object  
    - 하나 또는 그 이상의 Aspect에 의해 Advice되는 객체  
    - 핵심 로직을 구현하는 클래스   
    - 스프링에서는 런타임 프록시를 사용해 구현됨  
    
  - Aspect  
    - 여러 객체에 공통으로 적용되는 공통 관점 사항   
    - 트랜젝션이나 보안등은 Aspect의 좋은 예  
  
  - AOP 주요 용어  
    ![image](https://user-images.githubusercontent.com/67041069/89755569-d953c580-db1a-11ea-9911-b64611478dfb.png)
