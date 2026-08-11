package PolyMorphism;

public class CSE extends Department{
    public CSE(int id, String name, String location) {
        super(id, name, location);
    }

    int numOfEmployee = 20;

//    @Override
    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public CSE() {
        super();
    }

    String getCoOrdinator(){
        return "Faculty CSE";
    }
}
