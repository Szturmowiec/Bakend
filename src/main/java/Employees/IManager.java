package Employees;

import java.util.ArrayList;

public interface IManager extends IEmployee{
    public void hire(IEmployee employee);
    public void fire(IEmployee employee);
    public ArrayList<IEmployee> getSubordinates();
    public int getSubordinatesQuantity();
    public String getPreferences();
    public Task getCurrenttask();
    public String ownReport();
    public IHireBehaviour getHirebehaviour();
    public ArrayList<IEmployee> generateWorkerList(IManager manager,ArrayList<IEmployee> workers);
    public String generateReport();
}