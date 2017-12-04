package Employees;

import java.util.*;

public class CompanyStructure{
    private final int level;
    private final TeamManager boss;

    public CompanyStructure(int level) throws IllegalArgumentException{
        if (level<=0) throw new IllegalArgumentException("Level must be a positive number!");
        this.level=level;
        WorkerBuilder w=new WorkerBuilder();
        this.boss=w.generateManager();
    }

    public TeamManager getBoss(){
        return this.boss;
    }

    public void getWorkers(TeamManager manager, int level){
        if (level==0) return;
        if (level==1){
            WorkerBuilder w=new WorkerBuilder();
            manager.hire(w.generateDeveloper());
            manager.hire(w.generateDeveloper());
        }
        else{
            WorkerBuilder w=new WorkerBuilder();
            TeamManager a=w.generateManager();
            TeamManager b=w.generateManager();
            manager.hire(a);
            manager.hire(b);

            getWorkers(a, level-1);
            getWorkers(b, level-1);
        }
    }

    public void generateCompany(){
        getWorkers(this.boss, this.level-1);
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