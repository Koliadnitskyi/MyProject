import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String f = address.replace(".", "[.]");
        System.out.println(f);
    }
} // Defanging an IP Address