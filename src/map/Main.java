package map;

import javafx.scene.chart.PieChart;

import java.util.*;

class Entry{
    Date date = new Date();
    String key = new String();
    long value = 0;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            List<Entry> list = new ArrayList<>();
            for (;n>0;n--){
                String s = sc.nextLine();
                String[] sts = s.split(" ");
                Entry entry = new Entry();
                entry.setDate(new Date());
                entry.setKey(sts[0]);
                entry.setValue(Long.parseLong(sts[1]));
                list.add(entry);
            }
            while (sc.hasNext()){
                String s = sc.nextLine();
                String[] sts = s.split(" ");
                Entry entry = new Entry();
                entry.setDate(new Date());
                entry.setKey(sts[0]);
                entry.setValue(Long.parseLong(sts[1]));
                list.add(entry);
            }
            System.out.println(list);
        }
    }

}
