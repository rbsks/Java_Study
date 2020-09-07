### list  
  - 파이썬에서 리스트의 의미는 여러 가지 자료를 저장할 수 있는 자료  
  - 숫자, 문자, 수식등이 개별적인, 독립적인 자료였다면 리스트는 독립적인 자료들을 모아서 사용할 수 있게 해주는 특별한 형태의 자료  
  - 리스트 생성법은 대괄호[]에 자료를 쉼표로 구분. 대괄호[] 내부에 넣는 자료를 요소(element)라고 부름 [요소,요소,요소....]    
  - 대괄호[]안에 요소들의 번호를 index라고 부름. 파이썬은 0부터 시작  
  - index 기반으로 값을 저장  
  - 리스트의 요소 추가하기 
    - append : 리스트 뒤에 요소추가  
    ![image](https://user-images.githubusercontent.com/67041069/92393590-141d3d80-f15b-11ea-889e-52bd696b3086.png)  
    - insert : 원하는 위치에 요소 추가     
    ![image](https://user-images.githubusercontent.com/67041069/92393705-429b1880-f15b-11ea-9e2d-d6a0865c94bc.png)  
    
### dictionary  
  - 키를 기반으로 값을 저장하는 것  
  - { "key" : "value } 형태로 저장  
  - 요소에 접근할 때 리스트 처럼 대괄호[]안에 키를 입력하여 접근. {}를 이용하여 접근하지 않는다. 처음에 많이 하는 실수이니 조심  
  ![image](https://user-images.githubusercontent.com/67041069/92395151-d40b8a00-f15d-11ea-8d7a-b50ad87a4278.png)
  
  
### tuple  
  - 함수와 함께 많이 사용되는 리스트와 비슷한 자료형으로, 리스트와 다른 점은 한번 결정된 요소는 바꿀 수 없다는 것  
  - (데이터, 데이터, 데이터,...)로 선언. 요소를 하나만 가지는 튜플은 (데이터, ) 형식으로 선언  
  ![image](https://user-images.githubusercontent.com/67041069/92395661-a4a94d00-f15e-11ea-9ebd-fdf0abed0c23.png)   
  요소를 바꾸면 에러
