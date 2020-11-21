package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
// 인스턴스 하나!
		Student student1 = new Student(  );
		student1.StudentName = "안연수";
		System.out.println(student1.getStudentName()); // 곧바로 studentName 으로 접근해서 이름을 가져오지 않고 getStudentName 으로 가져오는 이유는?
// 인스턴스 둘!
		Student student2 = new Student ( ) ;
		student2.StudentName ="안승연";
		System.out.println(student2.getStudentName());
	}
}