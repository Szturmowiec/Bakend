package Employees;

public enum ManagerRoles{
    CEO("CEO"),
    Development_manager("Development manager");

    private final String name;

    private ManagerRoles(String name){
        this.name=name;
    }

    public String getManagerRole(){
        return this.name;
    }
}