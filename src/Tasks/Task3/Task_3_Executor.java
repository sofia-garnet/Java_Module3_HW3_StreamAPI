package Tasks.Task3;

import Models.Student;
import Tasks.Filters.StudentsFilters;
import Tasks.Reducers.StudentReducers;
import Tools.Tools;

import java.util.List;

public class Task_3_Executor {

    public  static void Start(List<Student> students ){

        System.out.println( "=================Task 3=================");
        StudentsFilters task03Collect= new StudentsFilters();
        StudentReducers studentReducers= new StudentReducers();
        System.out.println( "-----------------Part 1-----------------");
        List<Student> filteredByFacultyStudents=  task03Collect.filterByFaculty(students,"Faculty4");
        Tools.ListShow(filteredByFacultyStudents);
        System.out.println( "-----------------Part 2-----------------");
        List<Student> filteredByFacultyThenByCourseStudents=  task03Collect.filterByFacultyTenByCourse(students,"Faculty4","Course3");
        Tools.ListShow(filteredByFacultyThenByCourseStudents);
        System.out.println( "-----------------Part 3-----------------");
        List<Student> filteredByBurnAfterYearStudents=  task03Collect.filterByBurnAfterYear(students,1994);
        Tools.ListShow(filteredByBurnAfterYearStudents);
        System.out.println( "-----------------Part 4-----------------");
        List<String> filteredByGroupAndMapInitialsStudents=  studentReducers.filteredByGroupAndMapInitials(students,"Group4");
        Tools.ListShow(filteredByGroupAndMapInitialsStudents);

    }

}
