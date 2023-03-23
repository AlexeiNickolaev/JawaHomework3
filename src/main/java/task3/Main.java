package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("строка 1");
        list.add("строка 2");
        list.add("строка 3");
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println("Исходный список: " + list);

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            }
            catch (NumberFormatException ignored) {
            }
        }

        System.out.println("Список после удаления целых чисел: " + list);
    }
}
