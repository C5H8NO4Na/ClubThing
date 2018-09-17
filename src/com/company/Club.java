package com.company;

import java.util.ArrayList;

public class Club {
    public String name;
    public String description;
    ArrayList<Student> students;
    private final int DEFAULT_MAX=75;
    public Student president;
    public Teacher sponsor;

    public void printTotal(){
        int pos=0;
        int fr=0;
        int so=0;
        int ju=0;
        int se=0;
        while(students.get(pos)!=null){
            if(students.get(pos).grade==9){
                fr++;
            }
            else if(students.get(pos).grade==10){
                so++;
            }
            else if(students.get(pos).grade==11){
                ju++;
            }
            else if(students.get(pos).grade==12){
                se++;
            }
            pos++;
        }
        System.out.println("Number of students in "+name+"freshies: "+fr+"\nsophomores: "+so+"Juniors: "+ju+"Seniors: "+se+"Total: "+pos);
    }

    public boolean addStudent(String name, int grade){
        if(students.size()>=DEFAULT_MAX){
            return false;
        }
        Student s = new Student(name, grade);
        students.add(s);
        return true;
    }

    public boolean removeStudent(String name){
        int pos=0;
        while(students.get(pos)!=null){
            if(students.get(pos).getName().equals(name)){
                students.remove(pos);
                return true;
            }
            pos++;
        }
        return false;
    }

    public void printRoster(){
        int pos=0;
        while(students.get(pos)!=null){
            int y=2031-students.get(pos).grade;
            System.out.println(students.get(pos).getName()+", "+y);
            pos++;
        }
    }

    public void printClub(){
        System.out.println(name+"\n"+description);
    }

    public void setSponsor(String name){
        sponsor=new Teacher(name);
    }
}
