public class Main {
    public static void main(String args[]) throws TooManyStudentsException {
        
        Person p1 = new Person("Jan", 50);
        Student s1 = new Student("Jasiek", 20);
        Person p3 = (Person)s1;
        
        p1.sayHelloTo(p3); //Hi Jasiek!
        p3.sayHelloTo(p1); //Hi Jan!
        
        Subject s = new Subject("GUI");
        s.setTeacher(p1);
        
        s.addStudent(s1);
        
        System.out.println(s); //GUI, teacher: Jan, students: Jasiek
        
    }
}