import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String origin = String.valueOf(x);

        List<String>list = new ArrayList<>(List.of(origin.split("")));

        Collections.reverse(list);

        String reverse = String.join("", list);

        return reverse.equals(origin);
    }
}
