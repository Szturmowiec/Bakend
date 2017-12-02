package Employees;

public interface Employee{
    public String getName();
    public String getSurname();
    public String getOccupation();
    public String getRole();
    public void assign(Task task);
    public Report reportWork();
}