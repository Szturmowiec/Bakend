package Employees;

import java.util.*;

public class DeveloperReport implements IReport{
    private ArrayList<Task> tasks;
    private IEmployee employee;

    public DeveloperReport(ArrayList<Task> tasks, IEmployee employee){
        this.tasks=tasks;
        this.employee=employee;
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public IEmployee getEmployee(){
        return this.employee;
    }

    public String toString(){
        String output="Employee name: "+this.employee.getName()+", Employee surname: "+this.employee.getSurname();
        output+=", Employee occupation: "+this.employee.getOccupation()+", Employee role: "+this.employee.getRole();
        output+=", Employee university: "+this.employee.getUniversity()+", Employee gender: "+this.employee.getGender();
        output+=", Employee country: "+this.employee.getCountry()+", Employee email: "+this.employee.getEmail();
        output+="\nTasks assigned:\n";
        for (Task t: this.tasks){
            output=output+t.getType()+", time: "+t.getTime()+" hours\n";
        }
        output=output+"Total hours worked: "+this.employee.getTotalUnits();
        return output;
    }
}