package Employees;

import java.util.*;

public class TeamManager extends AbstractEmployee implements IManager{
    private ArrayList<IEmployee> subordinates;
    private int subordinatesQuantity;

    public TeamManager(String name, String surname, String role, int subordinatesQuantity){
        super(name,surname,"Manager",role);
        this.subordinatesQuantity=subordinatesQuantity;
        this.subordinates=new ArrayList<>();
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

    public Report reportWork(){
        return new Report(new ArrayList<Task>(), this);
    }

    public String assign(Task task){
        return "l";
    }
}