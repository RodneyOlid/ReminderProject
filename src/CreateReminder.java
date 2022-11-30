import java.util.Scanner;
public class CreateReminder {
    public static ReminderObj setReminder(){
        String name, info, prio;
        int month, day;
        boolean priority;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of your reminder: ");
        name = input.nextLine();
        System.out.println("Description of your reminder: ");
        info = input.nextLine();
        System.out.println("When is it due? Enter month:  ");
        month = input.nextInt();
        System.out.println("Enter Day: ");
        day = input.nextInt();
        System.out.println("Is this reminder high or low priority(Enter high or low): ");
        prio = input.next();
        priority = prio.equals("high");
        ReminderObj reminder = new ReminderObj(name, month, day, priority, info);
        reminder.display();
        return reminder;
    }
}
