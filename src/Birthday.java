import java.util.*;

public class Birthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birthdayString = sc.next();

        Calendar thisYear = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        thisYear.setTime(new Date());
        int year = thisYear.get(java.util.Calendar.YEAR);


        try {
            Calendar birthday = new GregorianCalendar();
            birthday.set(year, Integer.parseInt(birthdayString.substring(3, 5)) - 1, Integer.parseInt(birthdayString.substring(0, 2)));


            long diff = 0;
            if(thisYear.before(birthday)) {
                diff = (birthday.getTime().getTime() - thisYear.getTime().getTime()) / (1000 * 60 * 60 * 24);
            } else {
                birthday.set(Calendar.YEAR, year + 1);
                diff = (birthday.getTime().getTime() - thisYear.getTime().getTime()) / (1000 * 60 * 60 * 24);
            }

            System.out.println(diff);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

