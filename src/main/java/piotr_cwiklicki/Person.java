package piotr_cwiklicki;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private String email;

    public Person(String name, String surname, String email) throws IllegalArgumentException{
        for (char c : name.toCharArray()){
            if (Character.isDigit(c)) throw new IllegalArgumentException("Wrong name!");
        }
        this.name=name;
        for (char c : surname.toCharArray()){
            if (Character.isDigit(c)) throw new IllegalArgumentException("Wrong surname!");
        }
        this.surname=surname;
        boolean dot=false;
        boolean monkey=false;
        boolean correctorder=true;
        boolean xxx=false;
        for (int i=0; i<email.toCharArray().length; i++){
            if (Character.isDigit(email.toCharArray()[i])) throw new IllegalArgumentException("Wrong email!");
            if (email.toCharArray()[i]=='.') dot=true;
            if (email.toCharArray()[i]=='.' && !monkey) correctorder=false;
            if (email.toCharArray()[i]=='@') monkey=true;
            if (email.toCharArray()[i]=='.' && i+4==email.toCharArray().length) xxx=true;
        }
        if (dot && monkey && correctorder && xxx) this.email=email;
        else throw new IllegalArgumentException("Wrong email!");
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        String padname=String.format("%-12s", name);
        String padsurname=String.format("%-12s", surname);
        return "Name: "+padname+" Surname: "+padsurname+" email: "+email;
    }

    public int compareTo(Person p){
        int compname=this.name.compareTo(p.name);
        if (compname==0){
            int compsurname=this.surname.compareTo(p.surname);
            if (compsurname==0){
                return this.email.compareTo(p.email);
            }
            else return compsurname;
        }
        else return compname;
    }
}