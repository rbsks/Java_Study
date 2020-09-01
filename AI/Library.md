### Numpy  
  - NumPy는 파이썬으로 과학 계산을 하려면 꼭 필요한 패키지입니다. 
    다차원 배열을 위한 기능과 선형대수연산과 푸리에 변환 같은 고수준 수학 함수와 
    유사pseudo 난수 생성기를 포함합니다.   
  - scikit-learn에서 NumPy 배열은 기본 데이터 구조입니다.  
    scikit-learn은 NumPy 배열 형태의 데이터를 입력으로 받습니다.   
    그래서 우리가 사용할 데이터는 모두 NumPy 배열로 변환되어야 합니다.   
    NumPy의 핵심 기능은 다차원(n-차원) 배열인 ndarray 클래스입니다.   
    이 배열의 모든 원소는 동일한 데이터 타입이어야 합니다.  
    
    ![image](https://user-images.githubusercontent.com/67041069/91690931-b8264800-eba1-11ea-8d9d-349eac6491cd.png)  
    
### Pandas  
  - pandas는 데이터 처리와 분석을 위한 파이썬 라이브러리.    
  - R의 data.frame을 본떠서 설계한 DataFrame이라는 데이터 구조를 기반으로 만들어졌다.  
    간단하게 말하면 pandas의 DataFrame은 엑셀의 스프레드시트와 비슷한 테이블 형태라고 할 수 있다.   
    pandas는 이 테이블을 수정하고 조작하는 다양한 기능을 제공한다.  
  - 특히, SQL처럼 테이블에 쿼리나 조인을 수행할 수 있다.    
  - 전체 배열의 원소가 동일한 타입이어야 하는 NumPy와는 달리 pandas는 각 열의 타입이 달라도  
    다(예를 들면 정수, 날짜, 부동소숫점, 문자열). SQL, 엑셀 파일, CSV 파일 같은 다양한 파일과   
    데이터베이스에서 데이터를 읽어 들일 수 있는 것이 pandas가 제공하는 또 하나의 유용한 기능이다.  
    
    ![image](https://user-images.githubusercontent.com/67041069/91691088-08050f00-eba2-11ea-81a2-631d837df620.png)  
    
### Matplotlib  
  - matplotlib은 파이썬에서 매트랩과 유사한 대표적인 과학 계산용 그래프 라이브러리다.   
  - 선 그래프, 히스토그램, 산점도 등을 지원하며 출판에 쓸 수 있을 만큼의 고품질 그래프를 그려줍니다.  
    데이터와 분석 결과를 다양한 관점에서 시각화 해보면 매우 중요한 통찰을 얻을 수 있습니다.  
  - 주피터 노트북에서 사용할 때는 %matplotlib notebook이나 %matplotlib inline 명령을 사용하면 브라우저에     서 바로 이미지를 볼 수 있습니다. 대화식 환경을 제공하는 %matplotlib notebook 명령을 권장합니다.  
   ![image](https://user-images.githubusercontent.com/67041069/91786587-ea3bb680-ec42-11ea-8b79-     46aef375db6c.png)  
   ![image](https://user-images.githubusercontent.com/67041069/91786595-ef006a80-ec42-11ea-96db-81047b8117a0.png)    

