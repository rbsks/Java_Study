package variable.use;

import java.util.Date;

import variable.scope.A;

public class Main1 {

	public static void main(String[] args) {
		A client1 = new A(); // 사용할 수 있는 권한을 부여 받음(접속)
		A.applicationScope=999;
		client1.sessionScope=789;
		System.out.println(client1.applicationScope);
		A client2 = new A();
		client2.sessionScope = 901;
		client2.applicationScope = 0;
		
		Date today = new Date();
		System.out.println(today);
		client1.requestMethod(today);
		System.out.println(today);
		System.out.println(client1.applicationScope);
	}

}
