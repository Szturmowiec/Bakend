package Employees;

public enum Tasks{
    Implement_bug("Implement bug", 3),
    Dig_a_trench("Dig a trench", 5),
    Make_a_coffee("Make a coffee", 1),
    Open_fire("Open fire", 4),
    Cease_fire("Cease fire", 1),
    Reload("Reload", 2),
    Commit_a_suicide("Commit a suicide", 2);

    private final String type;
    private final int time;

    private Tasks(String type, int time){
        this.type=type;
        this.time=time;
    }

    public String getTaskName(){
        return this.type;
    }

    public int getTaskTime(){
        return this.time;
    }
}