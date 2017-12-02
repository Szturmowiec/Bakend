package piotr_cwiklicki;

public class Main{
    public static void main(String Args[]){
        SimpleFactory factory=new SimpleFactory();
        for (int i=0; i<50; i++){
            factory.createPerson();
        }
        System.out.print(factory);
        //reload
    }
}