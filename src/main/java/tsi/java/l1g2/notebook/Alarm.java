package tsi.java.l1g2.notebook;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm");

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    public void setTimeAsString(String str) {
        LocalTime t = LocalTime.parse(str, formatter);
        setTime(t);
    }

    public String getTimeAsString() {
        LocalTime t = getTime();
        return t.format(formatter);
    }
    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + getTimeAsString() + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
      //  if (super.contains(str)) {
      //      return true;
      //  } else if (time.contains(str)) {
      //      return true;
      //  }
      //  return false;
        String strLow = str.toLowerCase();
        return super.contains(strLow)
                || getTimeAsString().toLowerCase().contains(strLow);
    }

    @Override
    public boolean isExpired() {
        LocalTime now = LocalTime.now();
        return now.isAfter(time);
    }
}
