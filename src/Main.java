import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        //STUDENTS
        Student John=new Student("John",0000);
        Student Amy=new Student("Amy",0001);


        //COURSES
        Course Math=new Course("Math",0);
        Course Science=new Course("Science",0);

        ArrayList<Course> courseList=new ArrayList<>();
        courseList.add(Math);




        System.out.println(Math);
        System.out.println(Science);
        System.out.println(John);
        System.out.println(Amy);





    }
}
