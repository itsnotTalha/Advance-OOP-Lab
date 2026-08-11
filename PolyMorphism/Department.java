package PolyMorphism;

public class Department {
    int id;
    String name;
    String location;
    int numOfEmployee = 10;


    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public Department() {
        this.id = 0;
        this.name = "No Name";
        this.location = "No location";
    }

    public Department(int id, String name, String location ) {
        this.id = id;
        this.location = location;
        this.name = name;
    }

    String getCoOrdinator(){
        return "Faculty A";
    }

    public Department(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
