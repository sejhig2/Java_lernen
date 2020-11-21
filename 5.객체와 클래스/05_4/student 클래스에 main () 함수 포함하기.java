package classpart;
// 학생 객체 만들고 학번,이름,학년,주소 속성 부여
public class Student {
	int StudentID;
	String StudentName;
	int Grade;
	String Gddress;

	public String getStudentName( ) {
		return StudentName; // 이름을 반환하는 메서드
	}
	public String setStudentName (String name ) {
		this.StudentName = name;
	}
	// --------------Student 클래스에 main ()  함수 추가하기-------------
	public static void main(String[ ] args ) {
		Student studentHwang = new Student () ;
		studentHwang.StudentName = "황";
		
		System.out.println(studentHwang.StudentName );
	}
}
