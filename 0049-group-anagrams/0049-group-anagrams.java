class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();

        boolean[] seen = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (!seen[i]) {

                List<String> list1 = new ArrayList<>();
                list1.add(strs[i]);

                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j]) && seen[j] == false) {

                        list1.add(strs[j]);
                        seen[j] = true;

                    }
                }

                 list.add(list1);

            }

           
        }

        return list;

    }

    private static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;

    }
}