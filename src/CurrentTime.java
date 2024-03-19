import java.time.ZonedDateTime;
import java.util.TimeZone;

public class CurrentTime {
    public static void main(String[] args) {
        ZonedDateTime currentTimeGMT = ZonedDateTime.now(TimeZone.getTimeZone("GMT").toZoneId());
        System.out.println(currentTimeGMT);
    }
}
