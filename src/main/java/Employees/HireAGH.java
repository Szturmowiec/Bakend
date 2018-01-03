package Employees;

public class HireAGH implements IHireBehaviour{
    public boolean canHire(IEmployee employee, IManager manager){
        return (manager.getSubordinates().size()<=manager.getSubordinatesQuantity() && employee.getUniversity().equals("AGH"));
    }
}