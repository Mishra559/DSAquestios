class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            String str = emails[i];
            StringBuilder sb = new StringBuilder();
            boolean ignore = false;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == '@') {
                    sb.append(str.substring(j));
                    break;
                }

                if (ignore) {
                    continue;
                }

                if (ch == '.') {
                    continue;
                }

                if (ch == '+') {
                    ignore = true;
                    continue;
                }

                sb.append(ch);
            }

            set.add(sb.toString());
        }

        return set.size();

    }
}