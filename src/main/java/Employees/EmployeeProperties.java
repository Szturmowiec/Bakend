package Employees;

public abstract class EmployeeProperties{
    private String name;
    private String surname;
    private String occupation;
    private String role;

    public EmployeeProperties(String name, String surname, String occupation, String role){
        this.name=name;
        this.surname=surname;
        this.occupation=occupation;
        this.role=role;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public String getRole(){
        return this.role;
    }
}