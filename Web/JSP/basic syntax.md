### jsp 기본 구성 요소
  - 주석(Comment) : <%-- --%>페이지 소스보기에서도 안보인다, <!-- --> 페이지 소스보기에서 보인다  
  - 지시어(Directive) : <%@ %> , 지시어는 클라이언트의 요청에 의해 해당하는 jsp 페이지 실행 시 그 페이지에서만 필요한 환경을 설정하는 경우 사용. 한 마디로 설정 정보를 지정하는 것
    - page 지시어 : <%@page %>  
    - include 지시어 : <%@include %>  
    - taglib 지시어 : <%@taglib %>  
  - jsp page scripting elements  
    - scriptlet : <% %>  
    - 표현식(expression) : <%= %>, 가장 중요!! 요즘에는 대신에 el($)tag를 씀. system.out.print와 같다
    - 선언(declaration) : <%! %>, java로 따지면 static선언한거랑 비슷
  
