package Employees;

import java.util.*;

public class TeamManager extends AbstractEmployee implements IManager{
    private ArrayList<IEmployee> subordinates;
    private int subordinatesQuantity;
    private Task currenttask;
    private ArrayList<Task> tasks;

    public TeamManager(String name, String surname, String role){
        super(name, surname, Occupations.valueOf("Manager").getOccupationName(), role);
        this.subordinatesQuantity=2;
        this.subordinates=new ArrayList<>();
        this.tasks=new ArrayList<>();
    }

    public Task getCurrenttask(){
        return currenttask;
    }

    public ArrayList<IEmployee> getSubordinates(){
        return subordinates;
    }

    public int getSubordinatesQuantity(){
        return subordinatesQuantity;
    }

    public boolean canHire(){
        return (subordinates.size()<subordinatesQuantity);
    }

    public void hire(IEmployee employee) throws ArrayFullException{
        if (!canHire()) throw new ArrayFullException();
        subordinates.add(employee);
    }

    public void fire(IEmployee employee) throws ElementNotInArrayException{
        if (!subordinates.contains(employee)) throw new ElementNotInArrayException();
        subordinates.remove(employee);
    }

    public IReport reportWork(){
        return new ManagerReport(tasks, this);
    }

    public String assign(Task task){
            this.currenttask=task;
            this.tasks.add(task);
            return task.getType()+": "+task.getTime()+" hours";
    }

    public void giveTask(Task task){
        if (this.subordinates.isEmpty() || task.getType().equals("Implement bug") || (task.getTime()==1 && this.getRole().equals("Development manager"))){
            this.assign(task);
        }
        else{
            Random r=new Random();
            int i=r.nextInt(this.subordinates.size());
            this.subordinates.get(i).giveTask(task);
        }
    }

    public String toString(){
        return "MANAGER WORK REPORT\n"+reportWork()+"\nEND OF REPORT\nCurrent task - "+this.getCurrenttask();
    }
}