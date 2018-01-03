package Employees;

public class ManTeamManager extends AbstractTeamManager implements IManager{
    public ManTeamManager(String name, String surname, String role, int subordinatesQuantity, String university, String gender, String country, String email) throws IllegalArgumentException{
        super(name, surname,role,subordinatesQuantity,university,gender,country,email);
        this.preferences="Man";
        this.hirebehaviour=new HireMan();
    }
}