package Employees;

import java.util.*;
import java.io.*;

public class WorkerBuilder{
    private final ArrayList<String> names;
    private final ArrayList<String> surnames;
    private final ArrayList<String> universities;
    private final ArrayList<String> countries;
    private final ArrayList<String> domains;

    public WorkerBuilder(){
        this.surnames=new ArrayList<>();
        this.names=new ArrayList<>();
        this.universities=new ArrayList<>();
        this.countries=new ArrayList<>();
        this.domains=new ArrayList<>();
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
            BufferedReader a=new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/universities.txt")));
            while ((line=a.readLine())!=null){
                universities.add(line);
            }
            BufferedReader b=new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/countries.txt")));
            while ((line=b.readLine())!=null){
                countries.add(line);
            }
            BufferedReader c=new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/domains.txt")));
            while ((line=c.readLine())!=null){
                domains.add(line);
            }
            y.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Developer generateDeveloper(){
        Random r=new Random();
        String gender;
        int i=r.nextInt(names.size());
        int j=r.nextInt(surnames.size());
        int k=r.nextInt(DeveloperRoles.values().length);
        int x=r.nextInt(universities.size());
        int y=r.nextInt(countries.size());
        int z=r.nextInt(domains.size());
        int p=r.nextInt(1);
        if (p==0) gender="Man";
        else gender="Woman";
        Developer developer=new Developer(names.get(i),surnames.get(j),DeveloperRoles.values()[k].getDeveloperRole(),universities.get(x),gender,countries.get(y),names.get(i).toLowerCase()+"."+surnames.get(j).toLowerCase()+"@"+domains.get(z));
        return developer;
    }

    public IManager generateManager(){
        Random r=new Random();
        String gender;
        int i=r.nextInt(names.size());
        int j=r.nextInt(surnames.size());
        int k=r.nextInt(ManagerRoles.values().length);
        int q=r.nextInt(5)+1;
        int x=r.nextInt(universities.size());
        int y=r.nextInt(countries.size());
        int z=r.nextInt(domains.size());
        int p=r.nextInt(2);
        if (p==0) gender="Man";
        else gender="Woman";
        int n=r.nextInt(4);

        switch(n){
            case 0:
                return new AGHTeamManager(names.get(i),surnames.get(j),ManagerRoles.values()[k].getManagerRole(),q,universities.get(x),gender,countries.get(y),names.get(i).toLowerCase()+"."+surnames.get(j).toLowerCase()+"@"+domains.get(z));
            case 1:
                return new ManTeamManager(names.get(i),surnames.get(j),ManagerRoles.values()[k].getManagerRole(),q,universities.get(x),gender,countries.get(y),names.get(i).toLowerCase()+"."+surnames.get(j).toLowerCase()+"@"+domains.get(z));
            case 2:
                return new PolandTeamManager(names.get(i),surnames.get(j),ManagerRoles.values()[k].getManagerRole(),q,universities.get(x),gender,countries.get(y),names.get(i).toLowerCase()+"."+surnames.get(j).toLowerCase()+"@"+domains.get(z));
            default:
                return new GmailTeamManager(names.get(i),surnames.get(j),ManagerRoles.values()[k].getManagerRole(),q,universities.get(x),gender,countries.get(y),names.get(i).toLowerCase()+"."+surnames.get(j).toLowerCase()+"@"+domains.get(z));
        }
    }
}