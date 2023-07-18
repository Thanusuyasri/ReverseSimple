import java.util.Scanner;

public class ReverseSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        String str = scanner.next();
        int size = str.length();
        String result = "";
        for(int i= size-1;i>= 0;i--)
        {
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
