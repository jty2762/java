/* 암호는 key 값을 이용하여 평문을 암호문으로 만드는 것이다. 암호문을 만드는 
자바 프로그램을 설계하라.*/

import java.util.Scanner; 

public class password {
	
	public static void main(String[] args) {
	//스캐너를 정의함
		Scanner scan = new Scanner(System.in);
		
	//평문 문자열을 입력받는다.
		System.out.print("평문을 입력(4글자):");
		String Input_string = scan.nextLine();
		
	//암호 key를 입력받는다.
		System.out.print("암호키 입력:");
		int key = scan.nextInt();
		
	//평문 문자열을 문자 배열로 변환한다.
		char ConvertChar_fromInputString[] = Input_string.toCharArray();
		char OutputString[] = new char[4];
		int Temp[] = new int[4];
		
	//key값을 이용하여 평문을 암호문으로 변환한다.
		for(int i=0; i<ConvertChar_fromInputString.length;i++) {
			Temp[i] = ConvertChar_fromInputString[i] + key;
			OutputString[i] = (char) Temp[i];
		}
		
	//암호문을 출력한다.
		System.out.print("암호문 출력:");
		for(int j=0;j<OutputString.length;j++) {
			System.out.print(OutputString[j]);
		}
		
	//다시 평문으로 만든다.
		System.out.print("\n");
		System.out.print("평문 출력");
		for(int k=0;k<OutputString.length;k++) {
		    System.out.print((char)(OutputString[k]-key));			
		}

		scan.close();
	}

}
