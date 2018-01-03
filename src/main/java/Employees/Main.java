package Employees;

import java.util.*;

public class Main{
    public static void main(String Args[]){
        CompanyStructure x=new CompanyStructure(Integer.valueOf(Args[0]));
        x.generateCompany();
        x.generateTasks(30);

        System.out.println(x.getBoss()+"\n\n\n\n\n\n");
        System.out.println(x.getBoss().generateReport());
    }
}