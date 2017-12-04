package Employees;

public enum DeveloperRoles{
    Tester("Tester"),
    Contributor("Contributor"),
    Team_leader("Team leader"),
    Developer("Developer");

    private final String name;

    private DeveloperRoles(String name){
        this.name=name;
    }

    public String getDeveloperRole(){
        return this.name;
    }
}