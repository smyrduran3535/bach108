package anaDers.day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    LinkedHashSet leer elemanları ekleme sırasına(insertion order) gore yerlestiriler
     LinkedHashSet elemanları sıralamada zaman harcadıgı icin HashSetlere gore yavas calısır.
     */
    public static void main(String[] args) {
      LinkedHashSet<String> emails = new LinkedHashSet<>();
      emails.add("abc@gmail.com");
      emails.add("bca@gmail.com");
      emails.add("asc@gmail.com");
      emails.add("bde@gmail.com");
      emails.add("axy@gmail.com");
        System.out.println(emails);//[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]









    }
}
