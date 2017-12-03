package Employees;

import java.util.*;

public class ManagerReport implements IReport{
    private ArrayList<Task> tasks;
    private int workedhours;
    private TeamManager employee;
    private ArrayList<IEmployee> subordinates;

    public ManagerReport(ArrayList<Task> tasks, TeamManager employee){
        this.tasks=tasks;
        this.workedhours=0;
        for (Task t: tasks){
            workedhours+=t.getTime();
        }
        this.employee=employee;
        this.subordinates=employee.getSubordinates();
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
            output+=t.getType()+", time: "+t.getTime()+" hours\n";
        }
        output+="Total hours worked: "+this.workedhours+"\nREPORTS OF SUBORDINATES:\n";
        for (IEmployee d: this.subordinates){
            output+=d.reportWork()+"\n\n";
        }
        return output;
    }
}
