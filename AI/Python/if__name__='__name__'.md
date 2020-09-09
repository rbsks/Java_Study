### if__name__='__name__'  
  - 파이썬에서는 import로 module을 가져오면 안에 module안 코드가 실행이 되서 원치않는 코드가 실행될 수 있기 때문에   
    내가 시작하는 시작점(entry point OR main)이 어떤 파일인지 명확히 하고 의도대로 코드를 실행시키기 위해 사용  
  - calc.py에 if__name__='__main__'이 없을 경우 실행결과   
  ![image](https://user-images.githubusercontent.com/67041069/92612157-90975400-f2f4-11ea-9f08-6a4effc98a26.png)  
  ![image](https://user-images.githubusercontent.com/67041069/92612138-8aa17300-f2f4-11ea-8ae6-a6d0e0020527.png)  
  
  - calc.py에 if__name__='__main__'이 있을 경우 실행결과  
  ![image](https://user-images.githubusercontent.com/67041069/92612498-e409a200-f2f4-11ea-94d2-dd87b3f9b3d7.png)  
  ![image](https://user-images.githubusercontent.com/67041069/92612482-dfdd8480-f2f4-11ea-80d2-c0c61e8a4850.png)

  
