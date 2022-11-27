import java.util.Scanner;
public class CreateReminder {
    public static void setReminder(){
        String name, info, prio;
        int month, day;
        boolean priority;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of your reminder: ");
        name = input.nextLine();
        ReminderName.setName(name);
        System.out.println("Description of your reminder: ");
        info = input.nextLine();
        ReminderInfo.setInfo(info);
        System.out.println("When is it due? Enter month:  ");
        month = input.nextInt();
        System.out.println("Enter Day: ");
        day = input.nextInt();
        ReminderDate.setDate(month, day);
        System.out.println("Is this reminder high or low priority(Enter high or low): ");
        prio = input.next();
        priority = prio.equals("high");
        ReminderPrio.setPriority(priority);

    }
}
