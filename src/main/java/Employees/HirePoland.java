package Employees;

public class HirePoland implements IHireBehaviour{
    public boolean canHire(IEmployee employee, IManager manager){
        return (manager.getSubordinates().size()<=manager.getSubordinatesQuantity() && employee.getCountry().equals("Poland"));
    }
}