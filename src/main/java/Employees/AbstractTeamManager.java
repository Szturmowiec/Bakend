package Employees;

import java.util.*;

public abstract class AbstractTeamManager extends AbstractEmployee implements IManager{
    ArrayList<IEmployee> subordinates;
    int subordinatesQuantity;
    String preferences;
    Task currenttask;
    IHireBehaviour hirebehaviour;

    public AbstractTeamManager(String name, String surname, String role, int subordinatesQuantity, String university, String gender, String country, String email) throws IllegalArgumentException{
        super(name, surname, Occupations.valueOf("Manager").getOccupationName(),role,university,gender,country,email);
        if (subordinatesQuantity<=0) throw new IllegalArgumentException("Manager must have a positive amount of subordinates.");
        this.subordinatesQuantity=subordinatesQuantity;
        this.subordinates=new ArrayList<>();
        this.tasks=new ArrayList<>();
    }

    public IHireBehaviour getHirebehaviour(){
        return this.hirebehaviour;
    }

    public String getPreferences(){
        return this.preferences;
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

    public void hire(IEmployee employee){
        if (!hirebehaviour.canHire(employee,this)) return;
        subordinates.add(employee);
    }

    public void fire(IEmployee employee) throws ElementNotInArrayException{
        if (!subordinates.contains(employee)) throw new ElementNotInArrayException();
        subordinates.remove(employee);

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

    public IReport reportWork(){
        return new ManagerReport(tasks,this);
    }

    public IReport reportOwnWork(){
        return new DeveloperReport(tasks,this);
    }

    public ArrayList<IEmployee> generateWorkerList(IManager manager,ArrayList<IEmployee> workers){
        if (workers.isEmpty()) workers.add(manager);
        for (int i=0; i<manager.getSubordinates().size(); i++){
            if (manager.getSubordinates().get(i) instanceof IManager){
                workers.addAll(generateWorkerList((IManager)manager.getSubordinates().get(i),new ArrayList<>()));
            }
            else workers.add(manager.getSubordinates().get(i));
        }
        return workers;
    }

    public String generateReport(){
        String report="";
        ArrayList<IEmployee> workers=generateWorkerList(this,new ArrayList<>());
        Collections.sort(workers);
        for (int i=0; i<workers.size(); i++){
            if (workers.get(i) instanceof IManager){
                IManager m=(IManager)workers.get(i);
                report+=m.ownReport()+"\n";
            }
            else report+=workers.get(i)+"\n";
        }
        return report;
    }

    public String toString(){
        return "MANAGER WORK REPORT\n"+reportWork()+"\nEND OF REPORT\nCurrent task - "+this.getCurrenttask();
    }

    public String ownReport(){
        return "MANAGER WORK REPORT - ONLY TASKS DONE BY MANAGER HIMSELF/HERSELF\n"+reportOwnWork()+"\nEND OF REPORT\nCurrent task - "+this.getCurrenttask();
    }
}