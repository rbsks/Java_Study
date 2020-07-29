package variable.scope;

import java.util.Date;

public class A {
	public static int applicationScope;
	public int sessionScope;
	
	public void requestMethod(Date requestScope) {
		int pageScope = 12;
		requestScope.setYear(2023);
	}
}
