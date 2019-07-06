
public class Subject {
	private String name;
	private Person teacher; 
	private Person Student; 
	
	Subject(String name){
		this.name = name; 
	}
	
	public void setTeacher(Person p1) {
		 this.teacher = p1;
	}
	
	public void addStudent(Student s1) {
		this.Student = s1; 
	}

	
	
}
