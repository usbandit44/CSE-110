/*-------------------------------------------------------------
//AUTHOR: Arvin Edouard
//FILENAME: Student.java
//SPECIFICATION: allows the user to update and get students name grade and id and compare students
//FOR: CSE 110 - Lab #9
//TIME SPENT: 30 minutes
//-----------------------------------------------------------*/

public class Student {
    
    private String fullName;
    private String id;
    private double grade;
    private int numUpdated;
    private int numAccessed;

    public Student(){
        fullName = "";
        id = "";
        grade = 0.0;
        numUpdated = 0;
        numAccessed = 0;
    }

    public Student(String name, String studentId, double studentGrade){
        fullName = name;
        id = studentId;
        grade = studentGrade;
        numUpdated = 0;
        numAccessed = 0;
    }

    public String getFullname(){
        numAccessed++;
        return fullName;
    }  

    public String getAsuID(){
        numAccessed++;
        return id;
    }

    public double getGrade(){
        numAccessed++;
        return grade;
    }

    public void setName(String name){
        numUpdated++;
        fullName = name;
    }

    public void setId(String studentId){
        numUpdated++;
        id = studentId;
    }

    public void setGrade(double studentGrade){
        numUpdated++;
        grade = studentGrade;
    }

    public int getNumOfUpdates(){
        numAccessed++;
        return numUpdated;
    }

    public int getNumOfAccessed(){
        numAccessed++;
        return numAccessed;
    }

    public boolean equals(Student stud){
        if(id == stud.getAsuID()){
            return true;
        } else if(fullName.toUpperCase().compareTo(stud.getFullname().toUpperCase()) == 0){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String str = "[Name: " + fullName + ", ASUID: " + id + ", Grade: " + grade + "]";     
        return str;
    }
}

