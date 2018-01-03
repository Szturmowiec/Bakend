package Employees;

public class PolandTeamManager extends AbstractTeamManager implements IManager{
    public PolandTeamManager(String name, String surname, String role, int subordinatesQuantity, String university, String gender, String country, String email) throws IllegalArgumentException{
        super(name, surname,role,subordinatesQuantity,university,gender,country,email);
        this.preferences="Poland";
        this.hirebehaviour=new HirePoland();
    }
}