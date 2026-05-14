import java.util.Scanner;

public class Regex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        while (in.hasNextLine()) {
            String IP = in.nextLine().trim();
            if (IP.isEmpty()) {
                continue;
            }
            System.out.println(IP.matches(myRegex.pattern));
        }
        in.close();
    }
}

class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "\\." + num + "\\." + num + "\\." + num;
}
