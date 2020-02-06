import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Student {

    //FIELDS----------------------------------------------------------
    public String firstname;
    public int id;
    private Course[] subjects;


    //CONSTRUCTORS----------------------------------------------------------
    Student(String firstname, int id) {
        this.firstname = firstname;
        this.id = id + 1;
        this.subjects = new Course[8];
    }


    //METHODS----------------------------------------------------------
    //METHODS: RETURN FIELDS
    public String firstname() {
        System.out.println(firstname);
        return firstname;
    }

    public int id() {
        System.out.println(id);
        return id;
    }

    public String toString(){
        System.out.println("Class[subjectname="+firstname+","+id+"]");
        return "";
    }

    //METHODS: ADD COURSE IN STUDENT ARRAY & PRINT STUDENTS COURSES
    public static Course[] addX(int n, Course arr[], Course x) {
        int i;
        Course newarr[] = new Course[n];
        for (i = 0; i < arr.length; i++)
            newarr[i] = arr[i];
        newarr[newarr.length-1] = x;
        return newarr;
    }

    public static void main(String[] args) {
        int n=2;
        int y;
        Course[] arr = {new Course("Science",91)};
        System.out.println("---STUDENT COURSES---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Course x= new Course("Math",88);
        arr=addX(n,arr,x);
        System.out.println();
        System.out.println("---STUDENT COURSES (UPDATED)---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    //METHODS: FIND AVERAGE GRADE OF COURSES
        int avg=0;
        int allgrades=(91+88);
        avg=allgrades/2;
        System.out.println("Average Grades: "+avg);
        }
    }




    /*public void setSubjects(List<Student> subjects) {
        this.subjects = subjects;

    }
    public List<Student> getSubjects(){
        System.out.println(subjects);
        return subjects;
    }
    List<Student> subjects=new ArrayList<Student>();*/
