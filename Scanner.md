#### Sacnner  
  - Scanner의 사용법
    - import를 통해 외부 클래스를 호출해야한다. import java.util.Scanner;  
    - Scanner의 객체생성 Scanner sc = new Scanner(System.in); System.in은 입력한 값을 byte단위로 읽는다는 뜻  
    - next()라는 method를 이용해 문자열을 입력받는다. nextInt(), nextDouble(), nextLine()  
    - code 마지막에는 sc.close();를 써주지 않으면 경고가 뜨는데 별 영향은 없다.
    - 예제코드  
      ![1](https://user-images.githubusercontent.com/67041069/85404715-568e9f80-b59a-11ea-9b90-054b28621c7d.PNG)  
      next() method는 공백 이전까지의 문자열만 입력 받기 때문에 위에 예제처럼 정수 입력 후 엔터를 치면 공백 이전까지의 정수만 입력 받아서
      다음 nextLine()에서 엔터가 입력 된 줄 알고 프로그램을 종료시키기 때문에 중간에 nextLine()을 넣어 줘야한다.
