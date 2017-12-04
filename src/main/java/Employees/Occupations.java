package Employees;

public enum Occupations{
    Manager("Manager"),
    Developer("Developer");

    private final String name;

    private Occupations(String name){
        this.name=name;
    }

    public String getOccupationName(){
        return this.name;
    }
}