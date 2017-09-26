package tsi.java.l1g2.notebook;

public class Alarm extends Note implements Expirable {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        } else if (time.contains(str)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
