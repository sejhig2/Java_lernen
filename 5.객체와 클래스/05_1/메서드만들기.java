package classpart;
// 학생 객체 만들고 학번,이름,학년,주소 속성 부여
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo( ) {
		System.out.println(studentID+ studentName + grade + address );
	}
}