import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("L", 50);
        map.put("C", 100);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("CD", 400);
        map.put("CM", 900);

        Queue<String> queue = new LinkedList<>();

        Collections.addAll(queue, s.split(""));

        int sum = 0;

        while (queue.size()>1) {
            String word = queue.poll();
            if (word.equals("I") && (queue.peek().equals("V")|| queue.peek().equals("X"))) {
                word += queue.poll();
            }
            if (word.equals("X") && (queue.peek().equals("L")|| queue.peek().equals("C"))) {
                word += queue.poll();
            }
            if (word.equals("C") && (queue.peek().equals("D")|| queue.peek().equals("M"))) {
                word += queue.poll();
            }
            sum += map.get(word);
        }

        if(!queue.isEmpty()){
            sum+=map.get(queue.poll());
        }
        return sum;
    }
}
