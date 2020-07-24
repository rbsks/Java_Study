```java  
package com.bit.model.oneservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bit.model.dao.FreesavningRepository;
import com.bit.model.dto_beans.Freesaving;

public class Oneservice {
	FreesavningRepository freesaving = new FreesavningRepository();
	Scanner sc = new Scanner(System.in);
	
	public void freesavingInsert() {
		Freesaving free = new Freesaving();
		System.out.println("자유저축 신규개설");
		System.out.print("고객명 : ");
		free.setName(sc.nextLine());
		System.out.print("금액 : ");
		free.setPrice(sc.nextInt()); 
		sc.nextLine();
		free.calc();
		freesaving.bankFreeInsert(free);
	
	}

}
```
