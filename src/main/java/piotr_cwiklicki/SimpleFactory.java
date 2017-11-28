package piotr_cwiklicki;

import java.util.*;

public class SimpleFactory{
    private final String[] names={"Stormtrooper", "John", "Alice", "Anderson", "Jeremy", "Kathie", "Rachel", "Roger", "Ryan", "Tony", "Tom", "Truman", "Michael", "Elisabeth", "Donald", "Barrack"};
    private final String[] surnames={"Ackley","Alders","Beed","Powers","Armstrong","Strongarm","Smith","Chancey","Check","Comber", "Obama", "Trump", "Clinton"};
    private final String[] domain={"rifle","tank","exterminate","gunthemdown","suppress"};
    private final String[] xxx={"com","abc","xyz","ghi","opr"};

    private ArrayList<Person> people=new ArrayList<>();

    private String chooseRandomString(String[] t){
        Random r=new Random();
        int i=r.nextInt(t.length);
        return t[i];
    }

    public String createEmail(String name, String surname){
        name=name.toLowerCase();
        surname=surname.toLowerCase();
        return name+surname+"@"+chooseRandomString(domain)+"."+chooseRandomString(xxx);
    }

    public String toString(){
        Collections.sort(people);
        String output="";
        for(Person p : people){
            output=output+p+"\n";
        }
        return output;
    }

    public Person createPerson(){
        String name=chooseRandomString(names);
        String surname=chooseRandomString(surnames);
        String email=createEmail(name,surname);
        Person p=new Person(name,surname,email);
        people.add(p);
        return p;
    }
}