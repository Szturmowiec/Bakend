package Employees;

import java.util.*;

public class CompanyStructure{
    private int level;
    private IManager boss;

    public CompanyStructure(int level) throws IllegalArgumentException{
        if (level<=0) throw new IllegalArgumentException("Level must be a positive number!");
        this.level=level;
        WorkerBuilder w=new WorkerBuilder();
        this.boss=w.generateManager();
    }

    public IManager getBoss(){
        return this.boss;
    }

    public void getWorkers(IManager manager, int level){
        if (level==0) return;
        if (level==1){
            WorkerBuilder w=new WorkerBuilder();
            while (manager.getSubordinates().size()<manager.getSubordinatesQuantity()){
                manager.hire(w.generateDeveloper());
            }
        }
        else{
            Random r=new Random();
            WorkerBuilder w=new WorkerBuilder();
            while (manager.getSubordinates().size()<manager.getSubordinatesQuantity()){
                int n=r.nextInt(2);
                if (n==0) manager.hire(w.generateDeveloper());
                else{
                    IManager a=w.generateManager();
                    manager.hire(a);
                    if (manager.getHirebehaviour().canHire(a,manager)) getWorkers(a, level-1);
                }
            }
        }
    }

    public void generateCompany(){
        getWorkers(this.boss,this.level-1);
    }

    public void generateTasks(int n){
        for (int i=0; i<n; i++){
            Random r=new Random();
            int a=r.nextInt(Tasks.values().length);
            Task task=new Task(Tasks.values()[a].getTaskName(), Tasks.values()[a].getTaskTime());
            boss.giveTask(task);
        }
    }
}