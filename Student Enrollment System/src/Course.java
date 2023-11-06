import java.security.PublicKey;

public class Course extends Univercity {
    private int CourseCode;
    private String Title;
    private String Instructor;

    private int MaxCapacity;
    private int CurrentCapacity;

    public Course(int courseCode , String title , String instructor , int maxCapacity){
        this.CourseCode=courseCode;
        this.Title=title;
        this.Instructor=instructor;
        this.MaxCapacity=maxCapacity;
        this.CurrentCapacity=0;
    }

    public int GetCourseCode(){
        return CourseCode;
    }

    public String GetTitle(){
        return Title;
    }

    public String GetInstructor(){
        return Instructor;
    }

    public int GetMaxCapacity() {return MaxCapacity;}

    public int GetCurrentCapacity(){
        return CurrentCapacity;
    }

    public void SetCurrentCapacity(int NewCurrentCapacity){
        CurrentCapacity += NewCurrentCapacity;
    }

    @Override
    public void AddToUnivercity(){

        if(this.Validation()){
            System.out.println("The course that has this code " + this.GetCourseCode() + " is Already exist in the Univercity");
        }
        else {
            coursesList.add(this);
        }

    }

    @Override
    public boolean Validation(){
        boolean CheackCourse = false;
        for (Course courseInUnivercity : coursesList) {
            if(courseInUnivercity.GetCourseCode() == this.GetCourseCode()){
                CheackCourse=true;
            }
        }

        if(CheackCourse){
            return true;
        }

        else {return false;}
    }





}
