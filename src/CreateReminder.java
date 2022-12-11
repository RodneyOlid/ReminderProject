/*
CreateReminder Class that has a setReminder method. Ask the user a series of question in order to create a new reminder.
Returns a new reminder object.
 */
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
        System.out.println("When is it due? Enter month(1-12):  ");
        month = input.nextInt();
        while(month > 12 || month < 0){
            System.out.println("Enter a month between 1-12: ");
            month = input.nextInt();
        }
        System.out.println("Enter Day(1-31): ");
        day = input.nextInt();
        while(day > 31 || day < 0){
            System.out.println("Enter a day between 1-31: ");
            day = input.nextInt();
        }
        System.out.println("Is this reminder high or low priority(Enter high or low): ");
        prio = input.next();
        priority = prio.equals("high");

        return new ReminderObj(name, month, day, priority, info);
    }
}
