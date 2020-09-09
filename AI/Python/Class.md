### Class  
  - 객체를 좀 더 효율적으로 생성하기 위해 만들어진 구문  
  - 속성(attribute, data, variable, space) + 동작(method, operator, function)   
  - ex) list, int, dictionary  등...  
  - object : 설계된 class형태로 memory에 만들어진 class의 구체화버전 객체   
  - instance name(variable name) = Class name()  
  - init(self, 추가적인 매개변수): 로 생성자를 만들 수 있음  
  - class 내부 함수는 첫 번째 매개변수로 반드시 self를 입력해야 함. 이때 self는 자기 자신을 나타내는 dictionary이다  
  - self가 가지고 있는 속성과 기능에 접근할 때는 self.<식별자>형태로 접근  
  - Class 만들기  
  ![image](https://user-images.githubusercontent.com/67041069/92592061-f2969000-f2d9-11ea-9d4c-ec5767586c92.png)  
  - Class 매개변수를 dictionary로 받기   
  ![image](https://user-images.githubusercontent.com/67041069/92592152-1c4fb700-f2da-11ea-957f-74e306087826.png)  

### isinstance  
  - 상속 관계에 따라서 객체가 어떤 클래스를 기반으로 만들었는지 확인 할 수 있게 해주는 함수  
  - 파이썬이 기본적으로 제공하는 str(), 연산자를 사용해서 클래스의 특정 함수를 호출할 수 있게 해주는 기능이 대표적  
  - isinstance(instance, class)형태로 사용  
  ![image](https://user-images.githubusercontent.com/67041069/92594102-435bb800-f2dd-11ea-9293-89478f2f17f2.png)  
  
### inheritance  
  - 부모 클래스로 데이터형을 선언하고 자식클래스를 생성해서 할당 하는 것  
  - 부모 클래스에서 정의해둔 기능을 그대로 물려받을 수 있다  
  - 자식 클래스에서 기능을 추가하거나 코드를 재사용할 수 있다  
  - is a 관계  
  ![image](https://user-images.githubusercontent.com/67041069/92596172-63d94180-f2e0-11ea-89f2-56a0b10973f1.png)  
  
  
  
  
