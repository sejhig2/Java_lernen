package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentAhn = new Student() ; // 객체를 만들기 위한 중요한 요소
		studentAhn.StudentName = "안승연"; //  안승연을 대입
		
		System.out.println(studentAhn.StudentName());
		System.out.println(studentAhn.getStudentName());
	}
}