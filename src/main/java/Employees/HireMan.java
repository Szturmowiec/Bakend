package Employees;

public class HireMan implements IHireBehaviour{
    public boolean canHire(IEmployee employee, IManager manager){
        return (manager.getSubordinates().size()<=manager.getSubordinatesQuantity() && employee.getGender().equals("Man"));
    }
}