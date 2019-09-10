package niuKe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String sr = sc.next();
            String s = "";
            if (sr.length() == 0) {
                System.out.println(-1);
                continue;
            } else {
                String data = "";
                char[] chars = sr.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if ((48 <= chars[i]) && (chars[i] <= 57)) {
                        data = data + chars[i];
                    }
                }
                if (data.length() == 0) {
                    System.out.println(-1);
                } else {
                    int[] arr = new int[data.length()];
                    for (int i = 0; i < data.length(); i++) {
                        arr[i] = data.charAt(i) - 48;
                    }
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < arr.length; i++) {
                        s = s + arr[i];
                    }
                    System.out.println(s);
                }
            }
        }
    }
}