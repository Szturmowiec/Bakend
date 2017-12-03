package Employees;

import java.util.*;

public class Developer extends AbstractEmployee{
    private Task currenttask;
    private ArrayList<Task> tasks;

    public Task getCurrenttask(){
        return this.currenttask;
    }

    public Developer(String name, String surname, String role){
        super(name,surname,"Developer",role);
        this.tasks=new ArrayList<>();
    }

    public String assign(Task task){
        this.currenttask=task;
        this.tasks.add(task);
        return task.getType()+": "+task.getTime()+" hours";
    }

    public Report reportWork(){
        return new Report(tasks, this);
    }

    public String toString(){
        return "WORK REPORT\n"+reportWork()+"\nEND OF REPORT\nCurrent task - "+this.getCurrenttask();
    }
}