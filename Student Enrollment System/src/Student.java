import java.util.ArrayList;
import java.util.List;

public class Student extends Univercity {

    private int StudentId;
    private String Name;
    private String Email;
    public List <Course> ListStudentcourses;

    public Student(int studentId , String name , String email){
        this.StudentId=studentId;
        this.Name=name;
        this.Email=email;
        this.ListStudentcourses=new ArrayList<Course>();

    }
    public int GetStudentId(){
        return StudentId;
    }

    public String GetName(){ return Name; }

    public String GetEmail(){return Email;}

    public void GetListStudentcourses(){
        for (Course course: ListStudentcourses) {
            System.out.println("Course_Code : " + course.GetCourseCode() + " , "+ "Title : " + course.GetTitle() + " , "+ "Instractor: "+ course.GetInstructor() +" , "+ "Max_Capacity: "+ course.GetCurrentCapacity() + " , "+ "Current_Capacity : "+course.GetCurrentCapacity());
        }

    }

    @Override
    public void AddToUnivercity(){
        if(this.Validation()){
            System.out.println("The Student who have Id " + this.GetStudentId() + " is Already exist in the Univercity");
        }
        else {
            studentslist.add(this);
        }

    };

    @Override
    public boolean Validation(){
        boolean CheackStudent=false;
        for (Student studentInUniversity:studentslist) {
            if(studentInUniversity.GetStudentId() == this.GetStudentId()){
                CheackStudent=true;
            }
        }
        if(CheackStudent){
            return true;
        }
        else {
            return false;
        }

    }

}
