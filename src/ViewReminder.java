/*
ViewReminder class contains the displayReminders method. Checks if you have any reminders and if you have any then it
prints them out.
 */
public class ViewReminder {
    public static void displayReminders(ReminderObj[] myList){
        if(myList.length == 0){
            System.out.println("You have no reminders set.");
        }else{
            for(int i = 0;i < myList.length;i++){
                myList[i].display();
            }
        }
    }
}
