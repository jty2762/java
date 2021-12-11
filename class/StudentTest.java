public class StudentTest {
    private int studentID = 50; //학번
	private String studentName = "taeyun"; //학생 이름
	
	public StudentTest(){
	} //생성자
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
        System.out.println("setStudentID : "+studentID); 
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
        System.out.println("setStudentName : "+studentName);
	}

	public void printStudentId(int studentID) {
		System.out.println(studentID); 
	}

	public static void main(String[] args) {
		StudentTest studentPark = new StudentTest();
		
        System.out.println(studentPark.studentID);
        System.out.println(studentPark.studentName);
		studentPark.setStudentID(150); 
		studentPark.setStudentName("pimang");
        studentPark.printStudentId(20);
	}
}