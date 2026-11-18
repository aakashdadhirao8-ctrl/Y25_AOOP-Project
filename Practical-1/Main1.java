class Student {
    int studentID;
    String name;
    int age;

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------------------");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aakash", 20);
        Student s2 = new Student(102, "Rahul", 21);
        Student s3 = new Student(103, "Priya", 19);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}