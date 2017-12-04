package Employees;

public class Task{
    private String type;
    private int time;

    public Task(String type, int time) throws IllegalArgumentException{
        if (!type.matches("[ a-zA-Z]+")) throw new IllegalArgumentException("Wrong task type!");
        if (time<=0) throw new IllegalArgumentException("Time must be a positive number!");
        this.type=type;
        this.time=time;
    }

    public String getType(){
        return this.type;
    }

    public int getTime(){
        return this.time;
    }

    public String toString(){
        return this.type+": "+this.time+" hours";
    }
}
