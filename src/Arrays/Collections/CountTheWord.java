package Arrays.Collections;

import java.util.*;

public class CountTheWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ban muon kiem tra: ");
        String word = scanner.nextLine();
        String[] strings = word.split("\\s");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            hashMap.put(strings[i], count);
        }
            Set<String> key = hashMap.keySet();
            for (String keys : key) {
                System.out.println(keys+"    "+hashMap.get(keys));
            }

    }
}

