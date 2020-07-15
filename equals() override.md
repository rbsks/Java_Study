#### equals  
``` java  


@Override // 오버라이딩

	public boolean equals(Object obj) { //부울 타입의 이퀄즈 매서드. (오브젝트 타입의 obj를 파라미터로)

		if (this == obj) // obj와 this의 주소를 비교하겠다.

			return true; // 주소가 값인 경우에 true를 반환한다.

		if (obj == null) // 매개변수 null 일 경우에 아래를 반환한다.

			return false; // false 반환

		if (getClass() != obj.getClass()) // getClass 메서드가  obj.getClass() 의 것과 다를때 아래를 실행

			return false; // false반환

		Member other = (Member) obj; // obj를 타입캐스팅.

		if (age != other.age) // member의 age가 매개변수의 age값과 다를 경우 아래를 실행

			return false; // 다르면 false

		if (birthDate == null) { // member의 birthDate가  null이면 아래를 실행

			if (other.birthDate != null) // 받는 값의 birthDate가 null이 아닐경우 아래를 실행

				return false; // false

		} else if (!birthDate.equals(other.birthDate)) // member의 birth가 null이 아닐 때 값 비교

			return false; // 같지않으면 false

		if (name == null) { // member의 name값이 null이고

			if (other.name != null) // 매개변수의 name이 null이 아닐 경우 아래를 실행

				return false; // false를 리턴.

		} else if (!name.equals(other.name)) // member의 birth가 null이 아닐 경우 아래를 실행

			return false; //  false 리턴

		return true; // true 를 리턴

	}
```  
