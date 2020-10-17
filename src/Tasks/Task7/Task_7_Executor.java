package Tasks.Task7;

import Models.Student;
import Tasks.Reducers.StudentReducers;

import java.util.List;

public class Task_7_Executor {
    public static void Start(List<Student> students) {

        System.out.println("=================Task 7=================");
        StudentReducers studentReducers = new StudentReducers();
        System.out.println("-----------------Part 1-----------------");
        String result = studentReducers.reduceToInitialsFacultyAndGroup(students, 3);
        System.out.println(result);

    }
}
