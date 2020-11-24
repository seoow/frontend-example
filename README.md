# 1. 블로킹

```java
public static void main(Stromg[] args) {
    //블로킹
    final Scanner scanner = new Scanner(System.in);
    scanner.next();
    System.out.println("next가 종료되기 전까지 이곳에 못옴.")
}
```

코드 실행 흐름이 블로킹 연산이 종료되기 전까지 멈춰있음.

대표적인 예
 - IO
    -소켓
    -파일
 - 사용자 입력

# 2. 스레드

 - 시분할: 주어진 시간 조각(퀀텀 타임)을 받아서 각스레드가 실행됨
 - 컨텍스트: 실행하고 있던 시점의 상태(문맥)
 - 컨텍스트 스위칭: 기존의 실행 정보를 저장하고 다른 컨텍스트로 전환하는 것
 - 동시성: 동시에 실행되는 것 처럼 보임
 - 병렬성: 실제로 동시에 실행 됨

 ## 2.1. 자바에서 스레드 생성 및 실행

 - Runnable 인터페이스
 - Thread 상속

  ### 2.1.1 

  ```java 

   ### 2.1.2. Thread  상속

   1. Thread 클래스를 상속 받음
   2. run 메소드 오버라이드해서 수행할 작업 정의

 ## 2.2. 스레드 우선순위

    - 어떤 스레드가 더 중요한가?
     - 중요할 수록 CPU에게 더 많은 관심을 받고 많이 실행

 ## 2.3. 동기화(synchronization)


  ### 2.3.2. 문제 해결

  어떤 스레드가 사용하고 있는 '공유 객체'가 다른 스레드에 의한 변경되는 것을 막기 위해 작업이 끝날 때 까지 접근하지 못하도록 해야 데이터의 오염을 막을 수 있다. 이 막는 행위가 'lock'임.

  `sychronized` 키워드 사용.

  ### 2.3.3. 동기화 사용 시 주의점

  - 공유 객체에 접근하는 스레드가 많아지면 프로그램 전체성능 하락할 우려가 존재함
  - 공유 객체에 접근해서 작업하는 시간이 길어지면 프로그램 전체 성능 하락할 우려가 존재함
  
 ## 2.4. 스레드 상태(라이프사이클)

 - 생성됨(NEW)
  - 실행 대기(RUNNABLE)
  - 실행
  - 일시 정지
 - 종료

 ## 2.5. 스레드 상태 제어

 - sleep
 - join

 ## 2.6. 결론

 - 실행 흐름을 두 개 이상 만들 수 있음
  - 블로킹 되는 부분을 다른 실행 흐름에 넘기면 메인스레드는 하던 일을 마저 할 수 있음

  ## 2.7. 고민거리

  - 스레드가 많이젼 성능이 좋아질까???

# 3. IO
 - 스트림은 데이터가 단일 방향으로 연속으로 흐르는 것을 의미

 출발지
 - 키보드
 - 파일(읽기)
 - 소켓(외부의 데이터가 프로그램으로)

 도착지(출력)
 - 화면
 - 파일(쓰기)
 - 소켓(프로그램에서 데이터가 외부로)

  ## 3.1. 입력 스트림 / 출력 스트림

  출발지냐 도착지냐

   1. 프로그램이 도착지인 경우
    1. 파일 읽기
    2. 데이터 수신(소켓)
    3. 키 입력
   2. 프로그램이 출발지인 경우
    1. 파일 쓰기
    2. 데이터 송신(소켓)
    3. 화면 출력

 스트림은 크게 두 종류로 구분됨
   - 바이트 기반(텍스트를 포함한 이미지, 파일 등)
   - 문자 기반(텍스트)

 바이트 기반 스트림의 입력 스트림과 출력 스트림 최상위 클래스
    - InputStream (abstract)
    - OutputStream (abstract)

 문자 기반 스트림
  - Reader (Input)
  - Writer (Output)

 ## 3.2. InputStream (도착지)

 InputStream - 바이트 기반 스트림의 최상위 클래스

 - `int read()`: 한 바이트만 읽음
 - `int read(byte[] b)`: 파라미터로 넘겨준 b에 데이터를 저장하고, 읽은 바이트 수를 반환 함
 - `int read(byte[] b, int offset, int length)`
  - length개의 바이트를 읽어서
  - b[offset]에 저장
  - void close()` : 자원을 반납하고 입력 스트림을 닫음(필수)

 ## 3,3,  OutputStream (출발지)

 OutputStream - 바이트 기반 출력 스트림의 최상위 클래스

 - 'void write(int b)`: int 중에서 끝의 바이트 하나만 씀
 - `void write(byte[] b`): 출력 스트림으로 b를 보냄
 - `void write(byte[] b, int offset, int length)`: b[offset]부터 length만큼을 출력
 - `void flush()`: 버퍼에 있는 모든 데이터 출력(보냄)
 - `void close()`: 자원을 반납하고 출력 스트림을 닫음 (필수)

 # 3.4. Reader (도착지)

 - `int read(char[] cbuf)`: cbuf에 읽은 문자 배열을 저장하고 읽은 문자 수를 리턴(int)
 - `void close()`: 사용한 자원 반납. 입력 스트림 닫음 (필수)

3.5. Writer (출발지)

 - `void write(char[] cbuf)`: cbuf를 출력함
 - `void close()`

3.6. 파일 입출력

 파일 읽기
 
 - File
 - FileInputStream/FileOutputStream
 - FileReader / FileWriter

  ### 3.6.1. File 클래스

  ```java
  File file = new File("/path/to/file");
  ```

  - `boolean exists()` : 해당 파일이 존재하는지 여부
  - 'boolean createNewFile() : 생성 성공시 true
  - long

# 4. 네트워크

 - ip 주소 : 네트워크 상에서 컴퓨터를 식별학기 위한 주소
 - port: 컴퓨터에서 프로그램을 구분하기 위한 번호

 ## 4.1. Socket

 서버 소켓 생성 방법

 ```java
int 포트번호 = 12345;
 final ServerSocker serverSocket = new ServerSocket(포트번호);
 ```

 서버 소켓으로 클라이언트 접속 대기

 ```java
 final Socket client = serverSocket.accept();
 ```

 - accept는 blocking
 - 접속이 되고 나면 'socket' 변환

 클라이언트 소켓

 ```java
 final String ip = "localhost"
 final int port = 12345;
 final Socket socket = new Socket(ip, port);
 ```

 소켓 (서버, 클라 동일)에서 스트림 얻기

 ```java
 socket.getInputStream();
 socket.




