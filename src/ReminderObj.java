public class ReminderObj {
    public static String name = "";
    public static String date = "";
    public static boolean priority = false;
    public static String info = "";

    ReminderObj(String setName, String setDate, boolean setPrio, String setInfo){
        name = setName;
        date = setDate;
        priority = setPrio;
        info = setInfo;
    }
    public void display(){
        System.out.println("Reminder Name: " + name);
        System.out.println("Reminder Info: " + info);
        System.out.println("Due Date: " + date);
        System.out.println();
    }
}
