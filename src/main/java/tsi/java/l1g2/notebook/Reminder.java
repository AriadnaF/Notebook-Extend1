package tsi.java.l1g2.notebook;

public class Reminder extends Note implements Expirable {
    private String time;


    public String getTime() {
        return time;
    }



    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        } else if (time.toLowerCase().contains(str.toLowerCase())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
