/*
EditReminder Class with EditReminder method. The parameter is an object from an object array and asks the user the same
series of question to edit the reminder information. Returns an edited object.
 */
import java.util.Scanner;
public class EditReminder{

    public static ReminderObj[] EditReminder(ReminderObj updateList){
        String editName;
        String editInfo;
        String editPrio;
        int editMonth;
        int editDay;
        boolean priority;
        Scanner input = new Scanner(System.in);

        System.out.println("New Reminder Name: ");
        editName = input.nextLine();
        updateList.setName(editName);
        System.out.println("New Reminder Info: ");
        editInfo = input.nextLine();
        updateList.setInfo(editInfo);
        System.out.println("New Reminder Month(1-12): ");
        editMonth = input.nextInt();
        while(editMonth > 12 || editMonth < 0){
            System.out.println("Enter a month between 1-12: ");
            editMonth = input.nextInt();
        }
        System.out.println("New Reminder Day(1-31): ");
        editDay = input.nextInt();
        while(editDay > 31 || editDay < 0){
            System.out.println("Enter a day between 1-31: ");
            editDay = input.nextInt();
        }
        updateList.setDate(editMonth, editDay);
        System.out.println("New Priority(high or low): ");
        editPrio = input.next();
        priority = editPrio.equals("high");
        updateList.setPriority(priority);

        return new ReminderObj[]{updateList};
    }
}

