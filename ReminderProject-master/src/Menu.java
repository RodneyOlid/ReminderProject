import java.util.Scanner;
import java.util.Arrays;
public class Menu{
    public static void menuPrompt() {
        ReminderObj[] reminderList = {};
        ReminderObj[] updateList = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Reminder App");
        System.out.println("What would you like to do?");
        System.out.println("0 to quit");
        System.out.println("1 to view Reminders");
        System.out.println("2 to add new Reminders");
        System.out.println("3 to delete a Reminder");
        System.out.println("4 to edit a Reminder");
        int choice = input.nextInt();
        while(choice != 0) {
            switch (choice) {
                case 1:
                    // view reminders
                    if(reminderList.length == 0){
                        System.out.println("You have no reminders set.");
                    }else{
                        for(int i = 0;i < reminderList.length;i++){
                            reminderList[i].display();
                        }
                    }
                    break;
                case 2:
                    // add reminders
                    updateList = Arrays.copyOf(reminderList, reminderList.length + 1);
                    updateList[reminderList.length] = CreateReminder.setReminder();
                    reminderList = Arrays.copyOf(updateList, updateList.length);

                    break;
                case 3:
                    // delete reminder
                    //System.out.println("Which reminder do you want to delete?");

                    updateList = DeleteReminder.DeleteReminder(updateList);

                    reminderList = Arrays.copyOf(updateList);
                    break;
                case 4:
                    // edit reminder


                    break;
            }
            System.out.println("0. Quit\n1. View reminders\n2. Add new reminder\n3. Delete reminder\n4. Edit reminder");
            choice = input.nextInt();
        }
    }
}