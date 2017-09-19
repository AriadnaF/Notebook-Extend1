package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(String firstName, String lastName, String email, String... phones) {
        Person r = new Person();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.addPhones(phones);
        r.setEmail(email);
        records.add(r);
    }
    @Command
    public void createNote(String text) {
        Note rec = new Note();
        rec.setText(text);
        records.add(rec);
    }
    @Command
    public void createReminder(String text, String time) {
        Reminder rec = new Reminder();
        rec.setText(text);
        rec.setTime(time);
        records.add(rec);
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
