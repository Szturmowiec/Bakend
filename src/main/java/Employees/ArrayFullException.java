package Employees;

public class ArrayFullException extends RuntimeException{
    public ArrayFullException(){
        System.out.println("Can't add to ArrayList - it's already full.");
    }
}