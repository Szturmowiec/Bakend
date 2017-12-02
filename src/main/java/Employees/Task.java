package Employees;

public class Task{
    private String type;
    private int time;

    public Task(String type, int time){
        this.type=type;
        this.time=time;
    }

    public String getType(){
        return this.type;
    }

    public int getTime(){
        return this.time;
    }
}
