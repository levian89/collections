package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(),student1.getId());
    }
}

public class StudentsCollectionRunner
{
    public static void main( String[] args )
    {
        List<Student> students = List.of(new Student(1,"Ranga"),
                new Student(100, "Adam"),
                new Student(2, "Eve"));

        List<Student> studentsAl = new ArrayList<>(students);
        //System.out.println(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);    // using Comparable interface
        System.out.println("Asc " + studentsAl);

//        Collections.sort(studentsAl, new DescendingStudentComparator());
//        System.out.println("DescendingStudentComparator " + studentsAl);

        studentsAl.sort(new DescendingStudentComparator());  // using Comparator interface
        System.out.println("DescendingStudentComparator " + studentsAl);


    }
}
