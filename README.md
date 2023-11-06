# Student_Enrollment_System
Class Courses : 
Create a new variable named CurrentCapacity : To know the number of current students in the course
-------

Class Univercity :
1- I created an abstract Class: In order not to create an object from it, because it is a general thing that has more than one job, I must determine what type of object I will create from it.

2- I created a static type List of Course and List of Students so that I can store students and the course in the university, and I created it static because it is related to the class.

3- I created the function adding from type abstract : Because the definition differs if the addition is a student or a course, instead of knowing them at the university and repeating the codes I created it an abstract function, and from the student I made a definition to add the student to the university, and from the course I made a definition to add the course to the university.
------------------
 Class interface Validation :
 I created an interface called Verification: to verify students and courses when adding them, and when you want to verify a student in the course and vice versa, whether they are registered at the university or not. Interface created it so that it could be used for students and courses, but with a different implementaion
