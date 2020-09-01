### 주석(Comments)  
  - 주석이란 프로그램의 실행에는 전혀 관여하지 않고 코드 중간 중간에 코드에 대한 자세한 설명을 첨부하는 것   
    - 메모를 남기고 싶을 때  
    - 코드가 아니라는 표현  
    - 실행하지 않아야 할 문장  
    - 프로그램의 가독성을 위한것으로 사람을 위한 문법  
  - 주석의 종류  
    - 행단위 : #  
    - 블럭단위 : """ """ (중첩 불가)    
    ![image](https://user-images.githubusercontent.com/67041069/91838984-4f19ff80-ec89-11ea-9576-60c9a77f9393.png)  
 
### 들여쓰기(indent)  
  - 가독성을 위해 들여쓰기를 한다, 자바에서는 {}을 사용하여 영역을 지정하지만, 파이썬은 들여쓰기를 사용하여  
    영역을 지정한다. 파이썬에서 들여쓰기란 문법적인 강제사항이다.  
  - if, for, class, def등 코드 작성시 : 다음 아랫 줄은 반드시 들여쓰기를 해야한다.  
  - 들여쓰기의 방법은 한칸, 두칸, 4칸, 탭 등 여러가지 방식이있다.  
  ![image](https://user-images.githubusercontent.com/67041069/91839574-3fe78180-ec8a-11ea-99e4-ddfee594c195.png)  
  들여 쓰기를하지 않은 노란색 부분은 error가 난다.  
  
### 행결합/행분리  
  - 행결합 : 세미콜론(;)  
    - 한행을 여러 구문을 이어서 사용할 때 쓴다.  
    ![image](https://user-images.githubusercontent.com/67041069/91839817-a53b7280-ec8a-11ea-8d5f-2991b6c4c80f.png)  
    한 줄에 한개의 명령문만 올 수 있는데 ;이 빠져서 에러가 난다.  
  
  - 행분리 : 역슬래쉬(\), 괄호()  
    - 1줄의 내용이 길어서 여러줄로 타이핑 해야 할 경우 이용  
    ![image](https://user-images.githubusercontent.com/67041069/91840154-34e12100-ec8b-11ea-8014-067ddf1a9a73.png)  
    
### 표준출력 print()  
  - ![image](https://user-images.githubusercontent.com/67041069/91840494-bb95fe00-ec8b-11ea-950d-0e3b4fa67ead.png)  
  - ex  
![image](https://user-images.githubusercontent.com/67041069/91840840-4d057000-ec8c-11ea-9f24-e26b0ba950ad.png)    
![image](https://user-images.githubusercontent.com/67041069/91840890-61e20380-ec8c-11ea-8ba1-5bb263145d6a.png)    
  - 확장문자(escape sequence)  
    - \' : 따옴표 문자  
    - \" : 쌍따옴표 문자  
    - \  : backslash 문자  
    - \a : bell 문자  
    - \b : backspace 문자  
    - \f : Formfeed 문자  
    - \n : newline 문자  
    - \r : carriage return 문자 (\n과 동일하지 않다.)  
    - \t : tab 문자  
    - \v : vertical tab 문자  
  
  - {}와 % 출력  
    - {}을 출력하려면 {{{ }}} 이렇게 세번 연달아 입력해야 한다.  
    - % 자체를 출력하려면 %% 입력해야 한다.  
    ![image](https://user-images.githubusercontent.com/67041069/91841552-8a1e3200-ec8d-11ea-8bc4-52338f0fb8cc.png)  
  
  - 형식에 format 맞추어 출력 : "출력형식".format(data...)  
    - {}을 지정하면 format에 기술한 출력 대상들이 대응되어 출력  
    - {n}안에 숫자를 지정하여 출력 대상의 위치를 지정  
    - 함수의 인자처럼 키워드를 사용하여 나타낼 수 있다.  
    - 동일한 데이터를 여러번 출력할 수 있다.  
    - 자바로는 prinf를 쓰면 동일하게 쓸 수 있다.  
    ![image](https://user-images.githubusercontent.com/67041069/91842370-e2096880-ec8e-11ea-9cfb-ce83737cb3ba.png)    
    
### 수치 연산(+, -, /, *,  **, //, %)    
  ![image](https://user-images.githubusercontent.com/67041069/91842782-999e7a80-ec8f-11ea-92c1-fe4ce6205db2.png)    
  

    
    
    
   




    
    
  
    
