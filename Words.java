import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        String[] words = {
                "январь", "февраль", "март", "январь", "апрель", "январь",
                "октябрь", "сентябрь", "ноябрь", "октябрь", "сентябрь", "декабрь"
        };
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());
        System.out.println("Уникальные слова: " + uniqueWords);

        System.out.println("Количество повторяющихся слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}