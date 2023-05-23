package p28_index_of_first_occurrence;

public class IndexFinder {

    public static int findFirstOccurrence(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int threshold = haystack.length() - needle.length();
        for (int i = 0; i <= threshold; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
