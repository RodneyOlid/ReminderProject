import java.util.*;
import java.util.Arrays;
public class DeleteReminder {

    public static int[] DeleteReminder(int[] updateList) {

    //deleting the position in the array
        int[] reminderList = new int[updateList.length - 1];

        Scanner input = new Scanner(System.in);
        int j = input.nextInt();

        for (int i = 0, k = 0; i < updateList.length; i++) {

            if (updateList[i] != j) {
                reminderList[k] = updateList[i];
                k++;
            }
        }
        return reminderList;
    }
}