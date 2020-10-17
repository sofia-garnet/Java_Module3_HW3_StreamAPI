package Tasks.Task5;

import Models.Student;
import Tasks.Changer.StudentChanges;
import Tools.Tools;

import java.util.List;

public class Task_5_Executor {
    public static void Start(List<Student> students) {

        System.out.println("=================Task 5=================");
        StudentChanges studentsChanger = new StudentChanges();
        System.out.println("-----------------Part 1-----------------");
        List<Student> studentsInNewFaculty = studentsChanger.changeStudentsFaculty(students, "SuperNewFaculty");
        Tools.ListShow(studentsInNewFaculty);
        System.out.println("-----------------Part 2-----------------");
        List<Student> studentsInNewGroup = studentsChanger.changeStudentsGroup(students, "SuperNewGroup");
        Tools.ListShow(studentsInNewGroup);

    }
}
