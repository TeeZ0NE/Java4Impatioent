package issues.anagram;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "hello";

        System.out.println(isAnagram(word1, word2));
    }

    private static java.util.Map<String, Integer> stringIntegerMap(String word) {
        java.util.Map<String, Integer> word1Map = new java.util.HashMap<>();
        int curr;
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1).toLowerCase();
            if (word1Map.containsKey(letter)) {
                curr = word1Map.get(letter);
                word1Map.replace(letter, curr + 1);
            } else {
                word1Map.put(letter, 1);
            }
        }
        return word1Map;
    }

    private static boolean isAnagram(String a, String b) {
        boolean isAnagra = false;
        java.util.Map<String, Integer> word1Map = stringIntegerMap(a);
        java.util.Map<String, Integer> word2Map = stringIntegerMap(b);
        System.out.println(word1Map.toString() + " " + word2Map.toString());
        if (word1Map.size() != word2Map.size()) return false;
        for (java.util.Map.Entry<String, Integer> wordMap : word2Map.entrySet()) {
            if (!word1Map.containsKey(wordMap.getKey()))
                return Boolean.FALSE;
        }
        for (java.util.Map.Entry<String, Integer> wordMap : word1Map.entrySet()) {
            if (!word2Map.containsKey(wordMap.getKey())
                    || !wordMap.getValue().equals(word2Map.get(wordMap.getKey())))
                return Boolean.FALSE;
            else isAnagra = Boolean.TRUE;
        }
        return isAnagra;
    }
}
