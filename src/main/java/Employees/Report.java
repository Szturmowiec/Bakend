package Employees;

import java.util.*;

public class Report{
    private ArrayList<Task> tasks;
    private int workedhours;
    private IEmployee employee;

    public Report(ArrayList<Task> tasks, IEmployee employee){
        this.tasks=tasks;
        this.workedhours=0;
        for (Task t: tasks){
            workedhours+=t.getTime();
        }
        this.employee=employee;
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public int getWorkedhours(){
        return this.workedhours;
    }

    public IEmployee getEmployee(){
        return this.employee;
    }

    public String toString(){
        String output="Employee name: "+this.employee.getName()+", Employee surname: "+this.employee.getSurname();
        output+=", Employee occupation: "+this.employee.getOccupation()+", Employee role: "+this.employee.getRole();
        output+="\nTasks assigned:\n";
        for (Task t: this.tasks){
            output=output+t.getType()+", time: "+t.getTime()+" hours\n";
        }
        output=output+"Total hours worked: "+this.workedhours;
        return output;
    }
}