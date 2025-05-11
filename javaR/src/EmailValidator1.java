import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator1 {

    private static final Pattern VALID_EMAIL_CHECKER = Pattern.compile
//            "^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");
            ("^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");

    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("user1@example.com");
        emails.add("user2@example.com");
        emails.add("invalid.email");   // This will be marked as invalid

        for (String email : emails) {
            boolean isValid = isValidEmail(email);
            System.out.println(email + " - " + (isValid ? "Valid" : "Invalid"));
        }
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        Matcher matcher = VALID_EMAIL_CHECKER.matcher(email);
        return matcher.matches();
    }
}