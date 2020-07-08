#### File  
  - java.io 패키지는 기존의 파일이나 폴더에 대한 제어를하는데 사용하는 File class를 제공한다.  
  - 하드디스크에 존재하는 실제 파일이나 디렉토리가 아니고 그것에 대한 경로(pathname) 또는 참조(reference)를 추상화한 객체.  
  - 새 파일에 대한 경로나 만들고자하는 디렉토리를 캡슐화한 것.  
  - 예제  
  ``` java  
  	public static void main(String[] args) throws IOException {
		String fname =  "C:\\Users\\bitcamp\\Desktop\\java-edu\\java-edu\\file_ex\\test.txt"; // 경로/파일이름.확장자
		// file system에 따라 경로 구분자가 다르다.
		System.out.println(File.separator);
		File file1 = new File(fname);
		if(file1.exists()) { // 파일이 존재한냐 안하냐 확인하는 if문
			System.out.println("있다.");
			
		}else {
			System.out.println("없다.");
			file1.createNewFile(); // 시스템 자원을 사용시 에러 확인하기
		}
	}
```   
  파일을 생성할 때 file.exists()를 이용해 파일이 있는지 없는지 검사 후 있으면 넘어가고 없으면 파일을 생성.  
  
  
``` java  
	public static void filereader(String[] args) throws IOException {
		File file = new File("data\\sample.txt");  
    System.out.println(file.getAbsolutePath()); // 절대경로 경로보는법.  
		FileReader rd = new FileReader(file);
		char[] cbuf = new char[(int)file.length() +2]; // 배열 길이는 항상 file의 사이즈보다 좀 더 크게 잡아줘야 한다. 
		rd.read(cbuf);
		String ss = String.valueOf(cbuf);
		System.out.println(ss);
		
	}
 ```    
 파일에 있는 값을 읽어오는 방법.
