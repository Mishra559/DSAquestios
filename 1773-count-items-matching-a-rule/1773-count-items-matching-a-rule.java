class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            default -> 2;
        };

        return (int)items.stream()
                            .filter(item -> item.get(index).equals(ruleValue))
                            .count();

    }
}