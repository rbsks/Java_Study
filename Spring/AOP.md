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
    - Advice를 위빙하는 3가지 방식  
      - 컴파일 시에 위빙 : AOP가 적용된 새로운 클래스 파일이 생성된다  
      - 클래스 로딩시에 위빙 : 로딩한 바이트 코드를 AOP가 변경하여 사용한다   
      - 런타임 시에 위빙 : 프록시를 이용한다    
    
  - Target object  
    - 하나 또는 그 이상의 Aspect에 의해 Advice되는 객체  
    - 핵심 로직을 구현하는 클래스   
    - 스프링에서는 런타임 프록시를 사용해 구현됨  
    
  - Aspect  
    - 여러 객체에 공통으로 적용되는 공통 관점 사항   
    - 트랜젝션이나 보안등은 Aspect의 좋은 예  
  
  - AOP 주요 용어  
    ![image](https://user-images.githubusercontent.com/67041069/89755569-d953c580-db1a-11ea-9911-b64611478dfb.png)  
    
    
### Spring에서의 AOP  
  - 스프링에서는 자체적으로 런타임시에 위빙하는 프록시 기반의 AOP를 지원하고 있다  
  - 프록시 기반의 AOP는 메소드 호출 join point만 지원  
  - 스프링에서 어떤 대상 객체에 대해 AOP를 적용할 지의 여부는 설정 파일을 통해서 지정한다  
     - 스프링은 설정 정보를 이용하여 런타임에 대상 객체에 대한 프록시 객체를 생성하게 된다  
     - 따라서, 대상 객체를 직접 접근하는 것이 아니라 프록시를 통한 간접 접근을 하게 된다  
  - 스프링은 완전한 AOP 기능을 제공하는 것이 목적이 아니라 엔터프라이즈 어플리케이션을 구현하는데 필요한 기능을 제공하는 것을 목적으로 하고 있다  
  - 필드 값 변경 등 다양한 조인포인트를 이용하려면 AspectJ와 같은 다른 AOP솔 루션을 이용해야 한다  
  - 스프링에서 AOP를 구현하는 3가지 방식  
    - 스프링 API를 이용한 AOP구현  
    - XML 기반의 POJO 클래스를 이용한 AOP구현  
    - AspectJ 5/6에서 정의한 @Aspect 아노테이션 기반의 AOP구현  
  - 스프링에서 AOP를 구현하는 과정   
    - Advice 클래스를 작성한다   
    - 설정 파일에 Pointcut을 설정한다  
    - 설정 파일에 Advice와 Pointcut을 묶어 놓는 Advisor를 설정한다  
    - 설정 파일에 ProxyFactoryBean 클래스를 이용하여 대상 객체에 Advisor를 적용한다  
    - getBean() 메서드로 빈 객체(프록시 객체)를 가져와 사용한다  
    
  - 스프링 AOP는 메서드 호출 관련 Advice만 제공하며 이들 Advice는 인터페이 스형태로 제공된다  
    - MethodBeforeAdvice : 대상 객체의 메서드를 실행하기 전에 공통기능을 실행할 때 사용되는 Advice  
    - AfterReturningAdvice : 대상 객체의 메서드 실행 이후에 공통기능을 실행할 때 사용되는 Advice  
    - ThrowsAdvice : 대상 객체의 메서드가 실행하는 도중 예외가 발생할 경우 공통기능을 실 행할 때 사용되는 Advice  
    - MethodInterceptor : 위 세가지를 하나로 묶은 Advice로 메서드 실행 전, 후, 예외 발생시 공통 기능을 실행할 수 있다  
