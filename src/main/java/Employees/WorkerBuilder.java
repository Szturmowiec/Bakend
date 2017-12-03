package Employees;

import java.util.*;

public class WorkerBuilder{
    private final String[] names={"Adam", "Donald", "Elizabeth", "Carl", "John", "Louis", "Pit", "Tom", "Roger"};
    private final String[] surnames={"Smith", "Kennedy", "Trump", "Obama", "Armstrong", "Strongarm", "Winchester", "Remington", "Colt"};
    private final String[] developerRoles={"Tester", "Contributor", "Team leader", "Developer"};
    private final String[] managerRoles={"CEO", "Development manager"};

    public Developer generateDeveloper(){
        Random r=new Random();
        int i=r.nextInt(names.length);
        int j=r.nextInt(surnames.length);
        int k=r.nextInt(developerRoles.length);
        Developer developer=new Developer(names[i], surnames[j], developerRoles[k]);
        return developer;
    }

    public TeamManager generateManager(){
        Random r=new Random();
        int i=r.nextInt(names.length);
        int j=r.nextInt(surnames.length);
        int k=r.nextInt(managerRoles.length);
        TeamManager manager=new TeamManager(names[i], surnames[j], managerRoles[k]);
        return manager;
    }
}