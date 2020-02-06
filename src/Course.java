public class Course {

    //FIELDS----------------------------------------------------------
    public String subjectname;
    private int subjectgrade;

    //CONSTRUCTORS----------------------------------------------------------
    Course(String subjectname, int subjectgrade){
        this.subjectname=subjectname;
        this.subjectgrade=subjectgrade;
    }

    //METHODS----------------------------------------------------------
    //METHODS: RETURN FIELDS
    public String getSubjectname(){
        System.out.println(subjectname);
        return subjectname;
    }
    public int getSubjectgrade(){
        System.out.println(subjectgrade);
        return subjectgrade;
    }
    public String toString(){
        System.out.println("Class[subjectname="+subjectname+"]");
        return "";
    }
}
