package Employees;

import java.util.*;
import java.io.*;

public class WorkerBuilder{
    private final ArrayList<String> names;
    private final ArrayList<String> surnames;

    public WorkerBuilder(){
        this.surnames=new ArrayList<>();
        this.names=new ArrayList<>();
        String line;
        try{
            BufferedReader x=new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/names.txt")));
            while ((line=x.readLine())!=null){
                names.add(line);
            }
            x.close();
            BufferedReader y=new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/surnames.txt")));
            while ((line=y.readLine())!=null){
                surnames.add(line);
            }
            y.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Developer generateDeveloper(){
        Random r=new Random();
        int i=r.nextInt(names.size());
        int j=r.nextInt(surnames.size());
        int k=r.nextInt(DeveloperRoles.values().length);
        Developer developer=new Developer(names.get(i), surnames.get(j), DeveloperRoles.values()[k].getDeveloperRole());
        return developer;
    }

    public TeamManager generateManager(){
        Random r=new Random();
        int i=r.nextInt(names.size());
        int j=r.nextInt(surnames.size());
        int k=r.nextInt(ManagerRoles.values().length);
        TeamManager manager=new TeamManager(names.get(i), surnames.get(j), ManagerRoles.values()[k].getManagerRole());
        return manager;
    }
}