### MyBatis   
  - MyBatis는 SQL mapper이다  
  - 자바객체를 실제 sql문장에 맵핑(자바 코드에서 sql 관련부분 제거)  
  - sql 문장은 자동 생성되는 것은 아니고 개발자가 기술해 줌  
  - 맵핑 자제는 데이터베이스의 entity와 관계에 독립적임. mapping 자체가 sql문에 국한  
  - 실제적으로 모든 임베디드 sql 시스템은 모두 sql mapper로 간주  
    - MyBatis SQL Maps, Oracle SQLJ, Forte 4GL Embebded SQL, Pro*C Embedded SQL  
  - iBatis sql map의 경우 xml에 임베디드된 sql(자바코드의 sql을 xml파일로 분리)  
