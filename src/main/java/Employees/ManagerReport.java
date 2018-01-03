package Employees;

import java.util.*;

public class ManagerReport implements IReport{
    private ArrayList<Task> tasks;
    private IManager employee;
    private ArrayList<IEmployee> subordinates;

    public ManagerReport(ArrayList<Task> tasks, IManager employee){
        this.tasks=tasks;
        this.employee=employee;
        this.subordinates=employee.getSubordinates();
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public IEmployee getEmployee(){
        return this.employee;
    }

    public String toString(){
        String output="Employee name: "+this.employee.getName()+", Employee surname: "+this.employee.getSurname()+", Employee preferences: "+this.employee.getPreferences();
        output+=", Employee occupation: "+this.employee.getOccupation()+", Employee role: "+this.employee.getRole();
        output+=", Employee university: "+this.employee.getUniversity()+", Employee gender: "+this.employee.getGender();
        output+=", Employee country: "+this.employee.getCountry()+", Employee email: "+this.employee.getEmail();
        output+="\nTasks assigned:\n";
        for (Task t: this.tasks){
            output+=t.getType()+", time: "+t.getTime()+" hours\n";
        }
        output+="Total hours worked: "+this.employee.getTotalUnits()+"\nREPORTS OF SUBORDINATES:\n";
        for (IEmployee d: this.subordinates){
            output+=d.reportWork()+"\n\n";
        }
        return output;
    }
}