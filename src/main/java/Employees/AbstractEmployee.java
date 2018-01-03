package Employees;

import java.util.*;

public abstract class AbstractEmployee implements IEmployee{
    String name;
    String surname;
    String occupation;
    String role;
    String university;
    String gender;
    String country;
    String email;
    ArrayList<Task> tasks;

    public AbstractEmployee(String name,String surname,String occupation,String role,String university,String gender,String country,String email) throws IllegalArgumentException{
        if (!name.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Wrong name!");
        if (!surname.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Wrong surname!");
        if (!occupation.matches("[ a-zA-Z]+")) throw new IllegalArgumentException("Wrong occupation!");
        if (!role.matches("[ a-zA-Z]+")) throw new IllegalArgumentException("Wrong role!");
        this.name=name;
        this.surname=surname;
        this.occupation=occupation;
        this.role=role;
        this.university=university;
        this.gender=gender;
        this.country=country;
        this.email=email;
    }

    public int getTotalUnits(){
        int output=0;
        for (int i=0; i<this.tasks.size(); i++){
            output+=this.tasks.get(i).getTime();
        }
        return output;
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

    public String getUniversity(){
        return this.university;
    }

    public String getGender(){
        return this.gender;
    }

    public String getCountry(){
        return this.country;
    }

    public String getEmail(){
        return this.email;
    }

    public int compareTo(IEmployee p){
        int compsurname=this.surname.compareTo(p.getSurname());
        if (compsurname==0){
            int compname=this.name.compareTo(p.getName());
            if (compname==0){
                int compoccupation=this.occupation.compareTo(p.getOccupation());
                if (compoccupation==0){
                    int x=this.getTotalUnits();
                    if (x<p.getTotalUnits()) return -1;
                    else{
                        if (x>p.getTotalUnits()) return 1;
                        else return 0;
                    }
                }
                else return compoccupation;
            }
            else return compname;
        }
        else return compsurname;
    }
}