``` java  
package com.bit.start;

import java.sql.Connection;
import com.bit.model.view.View;
import com.bit.util.DBConnection;

public class Start {

	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		View start = new View();
		start.start();
	}

}
```
