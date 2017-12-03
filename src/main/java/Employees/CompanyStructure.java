package Employees;

import java.util.*;

public class CompanyStructure{
    private final int level;
    private final TeamManager boss;
    private final String[] tasks={"Implement bug", "Dig a trench", "Make a coffee", "Open fire", "Cease fire", "Reload", "Commit a suicide"};
    private final int[] times={1,2,3,4,5};

    public CompanyStructure(int level){
        this.level=level;
        WorkerBuilder w=new WorkerBuilder();
        this.boss=w.generateManager();
    }

    public TeamManager getBoss(){
        return this.boss;
    }

    public void getWorkers(TeamManager manager, int level){
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
            int a=r.nextInt(7);
            int b=r.nextInt(5);
            Task task=new Task(tasks[a], times[b]);
            boss.giveTask(task);
        }
    }
}