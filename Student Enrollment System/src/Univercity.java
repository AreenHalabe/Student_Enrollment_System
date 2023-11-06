import java.util.ArrayList;
import java.util.List;

public abstract class  Univercity implements Validations  {
    public static List<Student> studentslist = new ArrayList<>();
    public static List<Course> coursesList = new ArrayList<>();

    public abstract void AddToUnivercity();

    public void Get_All_Avalable_CoursesInUnivercity(){
        for (Course course: coursesList) {
            System.out.println("Course_Code : " + course.GetCourseCode() + " , "+ "Title : " + course.GetTitle() + " , "+ "Instractor: "+ course.GetInstructor() +" , "+ "Max_Capacity: "+ course.GetMaxCapacity() + " , "+ "Current_Capacity : "+course.GetCurrentCapacity());
        }
    }

    public void Get_All_Students_In_Univercity(){
        for (Student student:studentslist) {
            System.out.println("Student_Id : "+ student.GetStudentId() +  " , " + "Student_Name : " + student.GetName() + " , " + "Student_Email : " +student.GetEmail());
        }



    }


    public void EnrollStudentInCourse(Student student , Course NewCourse){

        if(student.Validation() && NewCourse.Validation()){
            boolean StudentIsAlredyInCourse = false;
            for (Course course: student.ListStudentcourses) {
                if(course.GetCourseCode()==NewCourse.GetCourseCode()){
                    StudentIsAlredyInCourse = true;
                }
            }
            if(StudentIsAlredyInCourse){
                System.out.println("Student Is Alredy Enroll in this Course");
            }
            else {
                if(NewCourse.GetCurrentCapacity() < NewCourse.GetMaxCapacity()){
                    student.ListStudentcourses.add(NewCourse);
                    NewCourse.SetCurrentCapacity(1);
                }
                else{
                    System.out.println("The Course is Full");
                }

            }
        }

        else{
            System.out.println("Cheack From Student And Course {Student or Course are Not Exist In Univercity}");
        }

    }


    public void DrobStudentInSomeCourse(Student student , Course course){



        if(student.Validation() && course.Validation()){
            boolean StudentNotHaveCourse=false;
            for (Course studcourse: student.ListStudentcourses) {
                if(studcourse.GetCourseCode()==course.GetCourseCode()){
                    student.ListStudentcourses.remove(studcourse);
                    course.SetCurrentCapacity(-1);
                    break;
                }
            }

            if(StudentNotHaveCourse){
                System.out.println("The Student Not Have Course");
            }
        }

        else{
            System.out.println("Cheack From Student And Course {Student or Course are Not Exist In Univercity}");
        }

    }


    public void All_Courses_for_specific_student(Student SpecificStudent){
        if(SpecificStudent.Validation()){
            System.out.println("All Courses which has Student_Id (" + SpecificStudent.GetStudentId() + ") is registered");
            for (Course StudentCourse : SpecificStudent.ListStudentcourses) {
                System.out.println("Course_Code : " + StudentCourse.GetCourseCode() +" , " + "Course_Title : "+StudentCourse.GetTitle() );
            }
        }

        else {
            System.out.println("The Student is Not exist in Universtiy");
        }

    }

    public void All_Student_in_specific_Course(Course SpecificCourse){
        if(SpecificCourse.Validation()){
            System.out.println("All Students who registered for this course");
            for (Student StudentInCourse : studentslist) {
                for (Course course : StudentInCourse.ListStudentcourses) {
                    if(course.GetCourseCode()==SpecificCourse.GetCourseCode()){
                        System.out.println("Student_Name : " + StudentInCourse.GetName() + " , " + "Student_ID : " + StudentInCourse.GetStudentId() );
                    }
                }
            }

        }
        else {
            System.out.println("The Course Not exist in the Univecity");
        }

    }

    public void AllReport(Student student , Course course){
        Get_All_Avalable_CoursesInUnivercity();
        All_Courses_for_specific_student(student);
        All_Student_in_specific_Course(course);
    }

}
