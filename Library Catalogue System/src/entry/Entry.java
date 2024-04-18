package entry;

import java.util.List;

public class Entry {
    private String title;
    private String author;
    private int year;
    private String keywords;
    private String url;
    private boolean available;

    public Entry(String title, String author, int year, String keywords, String url) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.keywords = keywords;
        this.url = url;
        this.available = true;
    }

    public static void addEntry(List<Entry> entries, Entry entry) {
        // Please enter definition here.
    }

    public static void removeEntry(List<Entry> entries, Entry entry) {
        // Please enter definition here.
    }

    public static Entry searchByName(List<Entry> entries, String name) {
        return null;
        // Please enter definition here. (change the return!)
    }

    public static Entry searchAvailableByName(List<Entry> entries, String name) {
        return null;
        // Please enter definition here. (change the return!)
    }
}