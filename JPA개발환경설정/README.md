목적
JPA 실습 환경을 구축합니다.

출력
JpaTest 클래스를 실행하여 생성된 SQL 및 화면 출력 결과를 영상으로 기록한다.

1. src/main/resources/안에 있는 h2 db의 절대 경로 복사
2. 절대 경로를 persistence.xml에서 file: 뒤에 붙넣기
3. database 연결하기
   View -> Tool Windows -> Database => + ->
   Url 란에서 tcp부터 싹 지우고 file:절대경로 입력하기
   -> Test CONNECTION 누르기
