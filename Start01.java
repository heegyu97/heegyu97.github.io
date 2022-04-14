

public class Start01 {
	//program : 실행계획
	//programer : 실행계획만드는사람
	//class : 실행 계획의 설계도
	// public : 보안등급 - 순서: public - protected - default - private
	//Start01 : 설계도의 이름
	//중괄호는 영역의 표시 : { 영역시작, }영역종료,
	//주석 : comment: 설명달기
	//주석의종류 1 : //는 한 줄 주석
	//주석의종류 2 : /*부터 */까지 여러 줄 주석
	
	/*
	 * 여러 줄 주석
	 * 자바는 주석과 공백을 무한히 허용함
	 * 가독성 높은(읽기편한 코드작성 권장)
	 */
	
	
	/*public static void main(String[] args) 
	 * 프로그램 실행의 약속된 출발선
	 * 이름은 main method
	 * 프로그램 실행되면 main method의 첫 줄에서 마지막 줄까지 한줄씩 순서대로 실행
	 */
	public static void main(String[] args) {
		
		
		System.out.println();  //println = print +line +new
		//컴퓨터.화면.다음라인에출력, System.out.println (화면출력메소드)
		System.out.println(123);
		System.out.print(456);
		System.out.println(789);//정수 출력
		System.out.println();//줄 바꿈
		System.out.println(0.12345);// 실수 출력
		System.out.println('A');//문자 출력은 작은 따옴표,문자는 오직 한 자를 의미
		System.out.println("문자열 출력은 큰 따옴표");
		System.out.println(true);//true, false는 논리형 기호
		
		
		
		
		/*
		 * System은 현재의 컴퓨터를 의미함
		 * . : 가지고있는, 내부, 속한
		 * System.out : 시스템 내부의 out을 의미함
		 * out.ptintln : out이 가지고있는 println을 의미함
		 * out : 컴퓨터 화면으로 출력하려는 자료가 임시로 대기하는 공간이다
		 * out.ptint : 출력대상 자료를 화면으로 출력해라
		 * print : 화면 출력 ,println : 화면출력 후 줄 바꿈 (Line new)
		 * print() : () 안의 내용을 출력하라
		 * ; : semicolon : 한줄의 코딩이 끝났음을 표시
		 */
	
	}//end of main

}//end of class
