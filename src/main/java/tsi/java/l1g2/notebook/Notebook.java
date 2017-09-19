package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final List<Record> records = new ArrayList<>();

    @Command
    public void create(String firstName, String lastName, String phone, String email) {
        Record r = new Record();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setPhone(phone);
        r.setEmail(email);
        records.add(r);
    }

    @Command
    public List<Record> list() {
        return records;
    }
    @Command
    public void remove(int ID) {
       for (int i = 0; i < records.size(); i++) {
           Record r = records.get(i);
           if (r.getId() == ID) {
               records.remove(i);
               break;

           }
       }
    }
}
