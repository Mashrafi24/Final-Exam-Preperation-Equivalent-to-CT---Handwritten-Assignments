import java.time.*;
import java.time.format.*;

class DateTimePrint {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(now.format(f));
    }
}
