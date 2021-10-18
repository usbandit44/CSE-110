public class Course
{
    private String courseTitle;
    private int studentAmount;

    public Course(String name){
        courseTitle = name;
        studentAmount = 0;
    }

    public String toString(){
        return courseTitle + ", " + studentAmount;
    }

    public void add(int add){
        studentAmount =+ add;
    }

    public void drop(int drop){
        studentAmount =+ drop;
    }

    public String getName(){
        return courseTitle;
    }

    public int getNumberOfStudents(){
        return studentAmount;
    }
}