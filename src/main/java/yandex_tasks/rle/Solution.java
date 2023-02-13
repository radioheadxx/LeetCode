package yandex_tasks.rle;

public class Solution {

    public String rle (String str) {
        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException();
        }
        StringBuilder res = new StringBuilder();
        int counter = 0;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == prev) {
                counter++;
            } else {
                res.append(str.charAt(i - 1));
                if (counter != 0) {
                    res.append(counter + 1);
                }
                counter = 0;
                prev = c;
            }
        }
        res.append(str.charAt(str.length() - 1));
        if (counter != 0) {
            res.append(counter + 1);
        }
        return res.toString();
    }
}

