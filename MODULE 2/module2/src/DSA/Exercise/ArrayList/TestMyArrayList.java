package DSA.Exercise.ArrayList;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student student1 = new Student(1,"Nghĩa");
            Student student2 = new Student(2,"Trường");
            Student student3 = new Student(3,"Quỳnh");
            Student student4 = new Student(4,"Quốc");
            Student student5 = new Student(5,"Đạt");
            Student student6 = new Student(6,"Khải");

            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            MyArrayList<Student> newStudentMyArrayList = new MyArrayList<>();

            studentMyArrayList.add(student1);
            studentMyArrayList.add(student2);
            studentMyArrayList.add(student3);
            studentMyArrayList.add(student4);
            studentMyArrayList.add(student5);
            studentMyArrayList.add(student6,2);
//            studentMyArrayList.clear();
            System.out.println(studentMyArrayList.size());
            for (int i = 0; i < studentMyArrayList.size(); i++){
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.println(student.getId());
                System.out.println(student.getName());
            }
            System.out.println(studentMyArrayList.size());
            System.out.println(studentMyArrayList.get(2).getName());
//            System.out.println(studentMyArrayList.indexOf(student3));
            System.out.println(studentMyArrayList.contains(student2));
            newStudentMyArrayList = studentMyArrayList.clone();
            for (int i = 0; i < newStudentMyArrayList.size(); i++){
                System.out.println(newStudentMyArrayList.get(i).getName());
            }
            Student student = newStudentMyArrayList.remove(0);
            System.out.println(student.getName());
        }
    }
}
