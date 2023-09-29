import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(111,"Areen","s11923535@gmail.com");
        student.AddToUnivercity();

        Student student2 = new Student(222,"Ahmad","s11823535@gmail.com");
        student2.AddToUnivercity();

        Student student3 = new Student(333,"Ali","s11723535@gmail.com");
        student3.AddToUnivercity();




        Course course = new Course(184 , "C1" , "Assaf" , 45);
        course.AddToUnivercity();

        Course course2 = new Course(185 , "C2" , "Ymama" , 50);
        course2.AddToUnivercity();

        Course course3 = new Course(187 , "DataBase" , "Mohammad SH" , 40);
        course3.AddToUnivercity();



        student.EnrollStudentInCourse(student , course);
        student.EnrollStudentInCourse(student , course2);
        student.EnrollStudentInCourse(student , course3);

        student2.EnrollStudentInCourse(student2 , course);
        student2.EnrollStudentInCourse(student2 , course2);


        student3.EnrollStudentInCourse(student3 , course3);
        student3.EnrollStudentInCourse(student3 , course2);

        student.All_Courses_for_specific_student(student);

        student2.DrobStudentInSomeCourse(student2 , course);

        // student3.Get_All_Avalable_CoursesInUnivercity();
        //student3.Get_All_Students_In_Univercity();
       // course.All_Student_in_specific_Course(course);
       // student2.AllReport(student2 , course3);














    }


}