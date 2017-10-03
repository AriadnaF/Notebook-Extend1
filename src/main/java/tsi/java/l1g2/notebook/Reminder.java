package tsi.java.l1g2.notebook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Note implements Expirable {
    private LocalDateTime time;
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setTimeAsString(String str) {
        LocalDateTime dt = LocalDateTime.parse(str, formatter);
        setTime(dt);
    }

    public String getTimeAsString() {
        LocalDateTime dt = getTime();
        return dt.format(formatter);
    }
    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + getTimeAsString() + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {

      //  if (super.contains(str)) {
      //      return true;
      //  } else if (time.toLowerCase().contains(str.toLowerCase())) {
      //      return true;
      //  }
      //  return false;
        String strLow = str.toLowerCase();
        return super.contains(strLow)
                || getTimeAsString().toLowerCase().contains(strLow);
    }

    @Override
    public boolean isExpired() {

        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(time);
    }

}
