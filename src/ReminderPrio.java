public class ReminderPrio {
    public static boolean reminderPriority = false;
    public static void setPriority(boolean prio){
        reminderPriority = prio;
    }
    protected static boolean getPriority(){
        return reminderPriority;
    }
}
