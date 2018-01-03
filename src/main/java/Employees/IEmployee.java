package Employees;

public interface IEmployee extends Comparable<IEmployee>{
    public String getName();
    public String getSurname();
    public String getOccupation();
    public String getRole();
    public String getUniversity();
    public String getGender();
    public String getCountry();
    public String getEmail();
    public String assign(Task task);
    public void giveTask(Task task);
    public IReport reportWork();
    public int compareTo(IEmployee p);
    public int getTotalUnits();
}