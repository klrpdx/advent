import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayOne {

    final static String REGEX = "\\d";

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public List<Integer> decode(String code) {
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(code);
        List<Integer> nums = new ArrayList<>();
        while(matcher.find()) {
            nums.add(Integer.valueOf(matcher.group()));
        }
        if (nums.size() == 1) {
            String digit = String.valueOf(nums.get(0));
            nums.set(0, Integer.valueOf(digit + digit));
        }
        else {
            int combined = Integer.valueOf(smash(nums));
            nums.clear();
            nums.add(combined);
        }
        return nums;
    }

    private String smash(List nums) {
        return String.valueOf(nums.get(0)) + String.valueOf(nums.get(1));
    }
}