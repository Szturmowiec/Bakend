package Employees;

public class ElementNotInArrayException extends RuntimeException{
    public ElementNotInArrayException(){
        System.out.println("The ArrayList doesn't contain desired element.");
    }
}