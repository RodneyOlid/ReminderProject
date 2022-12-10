
public class DeleteReminder {

    public static ReminderObj[] DeleteReminder(ReminderObj[] updateList, int delete) {

        //deleting the position in the array
        ReminderObj[] reminderList = new ReminderObj[updateList.length - 1];


        for (int i = 0, k = 0; i < updateList.length; i++) {

            if (i == delete-1) {
                continue;
            }

            reminderList[k++] = updateList[i];
        }
        return reminderList;
    }
}