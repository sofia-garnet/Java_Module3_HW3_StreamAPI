package Tasks.Task4;

import Models.Student;
import Tasks.Counts.StudentsCounts;

import java.util.List;

public class Task_4_Executor {
    public  static void Start(List<Student> students ){

        System.out.println( "=================Task 4=================");
        StudentsCounts task03Collect= new StudentsCounts();
        System.out.println( "-----------------Part 1-----------------");
        long countStudentsInFaculty=  task03Collect.getCountByFaculty(students,"Faculty4");
        System.out.println("Students in faculty Faculty4: "+ countStudentsInFaculty);


    }
}
