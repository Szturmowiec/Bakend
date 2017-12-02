package Employees;

public interface Manager extends Employee{
    public void hire(String employee);
    public void fire(String employee);
    public boolean canHire();
}
