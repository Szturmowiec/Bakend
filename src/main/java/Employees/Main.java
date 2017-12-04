package Employees;

public class Main{
    public static void main(String Args[]){
        CompanyStructure x=new CompanyStructure(Integer.valueOf(Args[0]));
        x.generateCompany();

        /*if (x.getBoss().getSubordinates().get(0) instanceof TeamManager){
            TeamManager c=(TeamManager) x.getBoss().getSubordinates().get(0);
            System.out.println(c.getSubordinates().get(0).getSurname());
        }*/

        /*TeamManager c=(TeamManager)x.getBoss().getSubordinates().get(0);
        c.fire(c.getSubordinates().get(0));*/

        //x.getBoss().fire(x.getBoss().getSubordinates().get(0));

        x.generateTasks(30);
        System.out.println(x.getBoss());
    }
}