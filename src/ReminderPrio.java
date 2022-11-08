public class ReminderPrio {
    public static boolean reminderPriority = false;
    public static void setPriority(String prio){
        reminderPriority = prio.equals("yes");
    }
    public static boolean getPriority(){
        return reminderPriority;
    }
}
