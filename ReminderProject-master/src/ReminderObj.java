import java.util.Arrays;
public class ReminderObj {
    public String name = "";
    public String date = "";
    public boolean priority = false;
    public String info = "";
    // Getters
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public boolean getPriority(){
        return priority;
    }
    public String getInfo(){
        return info;
    }
    // Setters
    public void setPriority(boolean prio) {
        priority = prio;
    }
    public void setName(String rName){
        name = rName;
    }
    public void setDate(int month, int day){
        date = month + "/" + day;
    }
    public void setInfo(String rInfo){
        info = rInfo;
    }
    public ReminderObj(){
        //Default Constructor
    }
    public ReminderObj(String rName, int month, int day, boolean rPrio, String rInfo){
        name = rName;
        date = month + "/" + day;
        priority = rPrio;
        info = rInfo;
    }

    public void display(){
        System.out.println("Reminder Name: " + name);
        System.out.println("Reminder Info: " + info);
        System.out.println("Due Date: " + date);
        System.out.println();
    }
}
