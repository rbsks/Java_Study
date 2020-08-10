### Annotation  
  - @Required  
    - org.springframework.beans.factory.annotation.Required  
    - 속성 또는 setter메서드에  
    - 필수 속성이 되게 함  
  
  - @Autowired  
    - org.springframework.beans.factory.annotation.Autowired  
    - 속성, 생성자, setter메서드  
    - 타입에 의존하는 객체를 삽입해 줌  
    
  - @Qualifier  
    - org.springframework.beans.factory.annotation.Qualifier  
    - @Autowired 와 같이 사용  
    - 같은 타입의 빈 객체들이 있을 경우 특정 빈을 사용하도록 함  
    - 설정파일의 <qualifier>태그의 value 속성의 값을 아노테이션 값으로 사용  
    - &#60;bean id="foo" class="x.y.Foo"&#62;  
    - &#60;qualifier value="action"/&#62;  
    - @Qualifier("action")  
    - public void setFoo(@Qualifier("action") Foo foo){}  
  
  - @Resource  
   - javax.annotation.Resource  
   - Java SE 6 과 Java EE5에 추가  
   - 필요한 자원을 자동으로 연결시켜 줌  
   - name 속성을 이용하면 속성과 이름이 틀릴 때 사용  
      - @Resource(name="myFoo")  
    
  - @PostConstruct, @PreDestroy  
    - javax.annotation.PostConstruct, javax.annotation.PreDestroy;  
    - lifecycle 아노테이션  
  
  - &#60;context:component-scan&#62;   
    - xml 설정파일에 여러 빈 정보를 추가하지 않고 특정한 클래스를 빈으로 등록 가능  
    - &#60;context:component-scan base-package:"패키지명"/&#62;  
    - 스프링 2.0 이후  
      - @Repository  
    - 스프링 2.5 이후  
      - @Component  
        - org.springframework.stereotype.Component  
        - 자동으로 빈으로 등록되게 함  
        - 빈의 이름은 첫 문자만 소문자이고 나머지는 클래스 이름과 동일  
        - 빈의 이름을 지정해 주려면 @Component("myFoo");  
        - @Scope("prototype")으로 빈의 범위를 지정할 수 있음  
          - org.springframework.context.annotation.Scope  
    - @Service  
    - @Controller  
