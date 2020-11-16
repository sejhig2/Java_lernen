//나이에 따른 다른 문장 출력하기

package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge ;
		
		if (age < 8 ) { 
			charge = 1000;
			System.out.println("취학 전 아동입니다");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");		
	}
		else  {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는" + charge + "원 입니다.");
	}
}

//---------------------------------------------------
//case 연습하기
package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : 
			medalColor = 'G'; // ranking 과  case 1 에서 1이랑 같은지 비교
			break; 
		case 2 : 
			medalColor = 'S';
			break; 
		case 3 :
			medalColor = 'B';
			break; 
		default : 
				medalColor = 'A'; // 문자 하나일 때는  작은 따옴표로 해라 ㅜ_ㅠ 오류 나더라
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor +"입니다.");
	}

}

//-------------------------------
// switch 와 case 를 활용해서 메달 색깔 정하기
메달 색깔 정하기
package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : 
			medalColor = 'G'; // ranking 과  case 1 에서 1이랑 같느냐
			break; 
		case 2 : 
			medalColor = 'S';
			break; 
		case 3 :
			medalColor = 'B';
			break; 
		default : 
				medalColor = 'A'; // 문자 하나일 때는  작은 따옴표로 해라 ㅜ_ㅠ 오류 나더라
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor +"입니다.");
	}

}

//-------------예제 ) 월을 입력받고 계절 출력하기 (switch 문에 break 가 필요 없는 경우)

package ifexample;

import java.util.Scanner;

public class Jahreszeit {

	public static void main(String[] args) {
		System.out.println("월을 숫자로 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int season_num = scan.nextInt();
		String season_str ;
		
		String seaseon_str;
		switch(season_num)
		{
		case 12 :
		case 1 :
		case 2 :
			season_str = "겨울";
			System.out.println(season_str + "입니다");
			break;
		case 3 :
		case 4 :
		case 5 :
			season_str = "겨울";
			System.out.println(season_str + "입니다");
			break;
		case 6 :
		case 7 :
		case 8 :
			season_str = "여름";
			System.out.println(season_str + "입니다");
			break;
		case 9 :
		case 10 :
		case 11 :
			season_str = "가을";
			System.out.println(season_str + "입니다");
			break;
		}
		

	}

}