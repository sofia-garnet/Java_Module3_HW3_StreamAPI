package Tasks.Filters;

import Models.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsFilters {
    public List<Student> filterByFaculty(List<Student> students,String facultyName){
        Stream<Student> stream =  students.stream();

        List<Student>  filteredStudents =  stream
                .filter(x-> x.getFaculty()==facultyName)
                .collect(Collectors.toList());

        return  filteredStudents;
    }
    public List<Student> filterByFacultyTenByCourse(List<Student> students,String facultyName, String course){
        Stream<Student> stream =  students.stream();

        List<Student>  filteredStudents =  stream
                .filter(x-> x.getFaculty()==facultyName&&x.getCourse()==course)
                .collect(Collectors.toList());

        return  filteredStudents;
    }

    public List<Student> filterByBurnAfterYear(List<Student> students,int year){
        Stream<Student> stream =  students.stream();

        List<Student>  filteredStudents =  stream
                .filter(x-> x.getYearOfBirth()>year)
                .collect(Collectors.toList());

        return  filteredStudents;
    }




}
