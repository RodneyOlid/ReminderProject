public class ReminderDate {
    public static int reminderMonth = 0;
    public static int reminderDay = 0;
    public static void setDate(int month, int day){
        reminderMonth = month;
        reminderDay = day;
    }
    protected static String getDate(){
        return(reminderMonth + "/" + reminderDay);
    }
}
