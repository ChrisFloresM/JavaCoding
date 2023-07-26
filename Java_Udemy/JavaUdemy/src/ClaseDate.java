import java.util.Date;
import java.text.SimpleDateFormat;

public class ClaseDate {

    public static void main(String[] args) {

        Date myDate = new Date();

        SimpleDateFormat myDateSimple = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println(myDateSimple.format(myDate));


        Date startingTimeDate = new Date();


        long startTime = startingTimeDate.getTime();

        long sum = 0;
        for(int i = 0; i < 100000000; i++){
            /*Do nothing*/
            sum += i;
        }

        Date finalTimeDate = new Date();
        long finalTime = finalTimeDate.getTime();
        long totalTime = finalTime - startTime;

        System.out.println(totalTime);



    }
}
