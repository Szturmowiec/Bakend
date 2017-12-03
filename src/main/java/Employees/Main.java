package Employees;

import java.util.*;

public class Main{
    public static void main(String Args[]){
        ArrayList<Task> tasks=new ArrayList<>();
        IEmployee developer=new Developer("Jan", "Kowalski", "Managing");
        Task task=new Task("Shooting", 1);
        Task task2=new Task("Shooting v2", 2);
        Task task3=new Task("Shooting v3", 3);
        developer.assign(task);
        developer.assign(task2);
        developer.assign(task3);
        System.out.println(developer);
    }
}