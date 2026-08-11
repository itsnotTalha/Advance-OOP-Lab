package PolyMorphism;

public class Tournament {
    public static void main(String[] args) {
        Department s1 = new CSE(1, "talha", "noakhali");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Location: " + s1.getLocation());

        System.out.println(s1.getCoOrdinator());


        System.out.println();


        Department s2 = new EEE();
        System.out.println("Name: " + s2.getName());
        System.out.println("ID: " + s2.getId());
        System.out.println("Location: " + s2.getLocation());
        System.out.println(s2.getCoOrdinator());
        System.out.println("Number of Employee "+s1.numOfEmployee);
        System.out.println("Number of Employee "+s1.getNumOfEmployee());

    }
}
