package demo;
import java.util.*;

public class Student {
    int id;
    String name;
    String dept;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        dept = "CSE";

        String text = "Creating object";
        System.out.print(text);

        for (int i = 0; i < 10; i++) {
            int dots = i % 4; // 0, 1, 2, 3

            System.out.print("\r" + text);

            for (int j = 0; j < dots; j++) {
                System.out.print(".");
            }

            System.out.print("   ");

            System.out.flush();

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.flush();
        System.out.println();



    }

    public Student() {
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
}
