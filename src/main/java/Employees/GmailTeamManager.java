package Employees;

public class GmailTeamManager extends AbstractTeamManager implements IManager{
    public GmailTeamManager(String name, String surname, String role, int subordinatesQuantity, String university, String gender, String country, String email) throws IllegalArgumentException{
        super(name, surname,role,subordinatesQuantity,university,gender,country,email);
        this.preferences="gmail.com";
        this.hirebehaviour=new HireGmail();
    }
}