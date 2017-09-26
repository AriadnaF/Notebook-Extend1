package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Notebook {
    private final List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(@Param(name = "First name") String firstName,
                             @Param(name = "Last name") String lastName,
                             @Param(name = "e-mail") String email,
                             @Param(name = "note") String text,
                             @Param (name = "phones") String... phones) {
        Person r = new Person();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setEmail(email);
        r.setText(text);
        r.addPhones(phones);
        records.add(r);
    }
    @Command
    public void createNote(@Param(name = "text") String text) {
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
    public void createAlarm(@Param(name = "Note") String text,
                            @Param(name = "time") String time) {
        Alarm rec = new Alarm();
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
    @Command
    public List<Record> find(String str) {
        List<Record> result = new ArrayList<>();
        for (Record r: records) {
            if (r.contains(str)) {
                result.add(r);
            }
        }
        return result;
        /*
        return records.stream()
                .filter(r -> r.contains(str))
                .collect(Collectors.toList());
       */
    }
}
