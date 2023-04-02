import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("привет","ok", "hello", "here","привет","привет", "hello", "Java"));
        System.out.println("Задание 1");
        getAllOddNumbers(nums);
        System.out.println("Задание 2");
        getEvenNumbers(nums);
        System.out.println("Задание 3");
        getUniqueWords(words);
        System.out.println("Задание 4");
        task4(words);
    }

    public static void getAllOddNumbers(List<Integer> nums) { // получить все нечетные числа
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void getEvenNumbers(List<Integer> nums) { //получить четные числа без повторений в порядке возрастания
        Collections.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !list.contains(num)) {
                list.add(num);
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void getUniqueWords(List<String> words) {
        Set<String> setOfWords = new HashSet<String>(words);
        System.out.println(setOfWords);
    }
    public static void task4 (List<String> words) {
        Set<String> setOfWords = new HashSet<String>(words);
        System.out.println(words.size() - setOfWords.size());
    }

}

