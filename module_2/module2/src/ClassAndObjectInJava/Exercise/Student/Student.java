package ClassAndObjectInJava.Exercise.Student;

public class Student {
    private String name = "Jonh";
    private String classEs = "C02";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClassEs(String classEs) {
        this.classEs = classEs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classEs='" + classEs + '\'' +
                '}';
    }
}
