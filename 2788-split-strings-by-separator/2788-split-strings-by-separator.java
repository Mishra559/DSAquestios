class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> list = new ArrayList<>();

        String regex = Character.toString(separator);

        if (separator == '.' || separator == '|' || separator == ',' || separator == '$' || separator == '#' || separator == '@') {
            regex = "\\" + separator;
        }

        for (String word : words) {

            String[] arr = word.split(regex);

            for (String str : arr) {
                if (!str.isEmpty()) {
                    list.add(str);
                }
            }

        }

        return list;

    }
}