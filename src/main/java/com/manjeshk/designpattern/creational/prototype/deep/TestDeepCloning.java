package com.manjeshk.designpattern.creational.prototype.deep;

import java.util.List;

public class TestDeepCloning {

    public static void main(String[] args) {
        try {
            Students students = new Students();
            students.loadStudentData();

            //clone method to get Student object

            Students students1 = (Students) students.clone();
            Students students2 = (Students) students.clone();

            List<String> studentList1 = students1.getStudentList();
            studentList1.add("David");

            List<String> studentList2 = students2.getStudentList();
            studentList2.remove("Lisa");

            System.out.println("students = " + students.getStudentList());
            System.out.println("studentList1 = " + studentList1);
            System.out.println("studentList2 = " + studentList2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
