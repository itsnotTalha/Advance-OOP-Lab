package demo;

public class Main {
    public static void main(String[] args) {
    CseStudent student = new CseStudent();
    student.setId(1);
    student.setName("Talha");

        System.out.println("ID : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println();

    Student s2 = new Student(2, "Jubayer");

        System.out.println("ID : " + s2.getId());
        System.out.println("Name : " + s2.getName());

    }

}
