package com.manjeshk.designpattern.creational.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {

    private List<String> studentList;

    public Students() {
        studentList = new ArrayList<String>();
    }

    public Students(List<String> studentList) {
        this.studentList = studentList;
    }

    public void loadStudentData(){
        //Make database call
        studentList.add("Peter");
        studentList.add("Shally");
        studentList.add("John");
        studentList.add("Anson");
    }


    public List<String> getStudentList() {
        return studentList;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();
        for (String student : this.studentList) {
            tempList.add(student);
        }
        return new Students(tempList);
    }

}
