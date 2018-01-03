package Employees;

public class HireGmail implements IHireBehaviour{
    public boolean canHire(IEmployee employee, IManager manager){
        return (manager.getSubordinates().size()<=manager.getSubordinatesQuantity() && employee.getEmail().matches(".*gmail[.]com"));
    }
}