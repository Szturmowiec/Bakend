package Employees;

public interface IManager extends IEmployee{
    public void hire(IEmployee employee);
    public void fire(IEmployee employee);
    public boolean canHire();
}