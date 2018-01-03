package Employees;

import java.util.*;

public interface IReport{
    public String toString();
    public ArrayList<Task> getTasks();
    public IEmployee getEmployee();
}