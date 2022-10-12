# 🤜 Java-study-blog
> ### 부산대학교 2학년 2학기 김태연 교수님의 『플랫폼기반프로그래밍』 강의의 실습 내용을 정리한 저장소입니다.
> 📌 자바 언어를 이용해 기본적인 객체지향 프로그래밍을 학습하고, 이를 활용하여 GUI, Database, Network 등의 응용 프로그래밍 기술을 사용합니다.
# 🖥 1 부터 8-2 까지 .. 
Java 언어를 통해 객체지향 개념을 학습합니다. 기본 개념에 interface, thread, exception handling까지 이어 Java 프로그래밍을 실습합니다. 
이후 network, GUI, database를 활용한 응용 프로그래밍을 합니다.
# 🖥 10. Swing
목적 : Java 스윙 (Swing) 라이브러리를 이용하여 GUI 프로그램을 작성하는 연습을 합니다.

#### ⛓ 10-1.
- 설명 : Swing API 를 이용해서 Hello World 를 출력하는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/PzUKHyhHq98XLBvD8)

#### ⛓ 10-2.
- 설명 : Swing API 를 이용해서 버튼을 생성하고, 클릭 시 특정 동작을 수행하는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/ZupD712nWnMtW9nf7)

#### ⛓ 10-3.
- 설명 : Swing API 를 이용해서 JTextField 와 JTextArea 를 생성합니다. JTextField 에 텍스트를 입력 후 엔터키를 누르면, 해당 텍스트가 JTextArea 에 추가되는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/VQzSxNraKRHD3ixaA)

#### ⛓ 10-5.
- 설명 : Swing API 를 이용해서 JDialog 을 생성합니다. 버튼을 클릭하면 JDialog 가 화면에 표시됩니다. 입력 창에 hello 을 입력하면 JDialog가 종료되는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/JWDfGBwR9HW1fHUL6)
#### ⛓ 10-6.
- 설명 : Swing API 를 이용해서 JTable 을 생성합니다. JTable 의 행을 하나 선택 후 버튼을 클릭하면, JTable의 선택된 행의 정보가 콘솔창에 출력되는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/Q4gqaRKASBXogRn78)

#### ⛓ 과제 10.
- 설명 : KA sports Football 프로젝트의 게임 GUI 개발팀이 되어 선수 검색 화면을 개발합니다.
- [실행영상](https://photos.app.goo.gl/Wtiu1UFoAZguwSTLA)

# 🖥 12. Swing & Network
목적 : ExecutorService 를 이용한 high-level concurrency 를 연습하고, java 스윙 (Swing) 라이브러리의 SwingWorker 를 이용하여 GUI 프로그램을 작성하는 연습을 합니다.
#### ⛓ 12-3.
- 설명 : 우리의 HTTP 서버는 /api/hello  url 을 통해 Hello, World 문자열을 반환하는 서비스를 제공합니다.
#### ⛓ 12-5.
- 설명 : Swing API 를 이용해서 JProgressBar 을 생성합니다. start 버튼을 클릭하면, 작업 진행 상황이 프로그레스 바를 통해 표시되며, JTextArea 에도 문자열로 표시됩니다.
- [실행영상](https://photos.app.goo.gl/xH9dm5L9YHWggAir7)

#### ⛓ 과제12.
- 설명 : 멀티쓰레드 기반의 서버와 GUI 클라이어트 구현해 봅니다. HttpClient를 GUI로 구현합니다. 유저의 입력이 비동기로 처리될 수 있도록 SwingWorker를 이용합니다. 서버가 다수 클라이언트의 요청을 동시에 처리할 수 있도록 구현합니다. 

# 🖥 13. Database
목적 : 데이터베이스에 대해 이해하고 실습합니다.
#### ⛓ JPA개발환경설정
- 설명 : 데이터베이스 실습 환경을 구축합니다. 제공된 H2  데이터베이스 파일과 설치 영상을 참고하여 자신만의 데이터베이스 개발 환경을 설정해 봅니다.
#### ⛓ 13-2.
- 설명 : SQL 을 작성하는 연습을 합니다. Database2 강의 영상을 참고하여 SQL을 실습하고, 그 과정을 녹화하여 자신만의 Database2 영상을 만듭니다.
- [실행영상](https://photos.app.goo.gl/gx9igNfewRVdDkQc6)

#### ⛓ 13-3.
- 설명: JDBC 를 사용하는 연습을 합니다. Database3 강의 영상의 JdbcTemplate 을 참고하여 Club 의 목록을 출력하는 프로그램을 작성해 봅니다.
- [실행영상](https://photos.app.goo.gl/XMn2LPwr92ujG3EF9)

#### ⛓ 13-4.
- 설명 : JPA  실습 환경을 구축합니다. 제공된 H2  데이터베이스 파일, persistence.xml, 엔티티 클래스(Player, Club, Country), JpaTest 클래스를 사용하여 JPA 개발 환경을 설정해 봅니다.
- [실행영상](https://photos.app.goo.gl/eDavs2xdaCsU5ZVA7)