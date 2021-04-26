# 멀티캠퍼스 AI 서비스 플랫폼 구현 강좌 

### JAVA 기초 강의

*2021-03-29* ~

1. 구구단
2. 달력 제작
3. 클래스 사용
4. 인터페이스 사용
5. 쓰레드 활용



2021-04-12 ~

1. Oracle 설치
2. SQL 쿼리
3. JAVA, Oracle 연동
4. Jdbc 활용
5. Java Oracle 커넥션

```java
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		
		Class.forName(driver);
		con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		return con;
	}
```

6. Java query 명령어

```java
public void query1() throws ClassNotFoundException, SQLException {
    Connection con = this.getConnection();
    String sql = "INSERT INTO testTBL2(id,username,age) "
    Statement stmt = con.createStatement();
    PreparedStatement pstmt = con.prepareStatement(sql);
    int affectedCount = pstmt.executeUpdate();
    ResultSet rs = pstmt.executeQuery();
	}
```



2021-04-21 ~

1. eclipse editor 설정
2. HTML 태그, 속성
3. CSS 태그, 속성
4. 웹 레이아웃