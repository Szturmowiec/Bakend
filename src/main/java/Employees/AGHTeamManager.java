package Employees;

public class AGHTeamManager extends AbstractTeamManager implements IManager{
    public AGHTeamManager(String name, String surname, String role, int subordinatesQuantity, String university, String gender, String country, String email) throws IllegalArgumentException{
        super(name, surname,role,subordinatesQuantity,university,gender,country,email);
        this.preferences="AGH";
        this.hirebehaviour=new HireAGH();
    }
}