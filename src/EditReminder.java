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
        System.out.println("New Reminder Day: ");
        editDay = input.nextInt();
        updateList.setDate(editMonth, editDay);
        System.out.println("New Priority(high or low): ");
        editPrio = input.next();
        priority = editPrio.equals("high");
        updateList.setPriority(priority);

        return new ReminderObj[]{updateList};
    }
}

