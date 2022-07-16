### Controller와 RestController의 차이
  - Controller : 응답값이 기본적으로 HTML을 주도록 되어있음
  - RestController : 응답값으로 REST API 요청에 대한 응답(주로 JSON)을 주도록 되어있음
  - 매핑 어노테이션
    - RequestMapping : GET, POST 등 요청 방식을 직접 지정
  - 축약형 매핑 어노테이션
    - GetMapping : 데이터를 가져올 때 사용(R)
    - PostMapping : 데이터를 전송할 때 사용(C)
    - PutMapping : 데이터를 전체 수정할 때 사용(U)
    - PatchMapping : 데이터를 일부 수정할 때 사용(U)
    - DeleteMapping : 데이터를 삭제할 때 사용(D)

#### HTTP 요청 파라미터 전송
  - GET, DELETE
    - PathVariable : 요새는 id를 path에 넣는 것을 선호
    - @PathVariable("id") String id 이런식으로 사용
    - 여러개 넣는것이 가능
    - Query-params : 파라미터들이 많을 때 PathVariable 보다 선호
    - 게시판의 검색, 필터, 페이징에서 많이 사용
    - required(default = true), defaultValue 설정 가능

  - POST, PUT, PACTH
    - @RequestBody : http body 정보를 편리하게 받을 수 있음
    - 주로 사용하는 메세지 포맷은 JSON(현재 사실상 표준)
    - @RequestHeader : http header 정보를 편리하게 받을 수 
