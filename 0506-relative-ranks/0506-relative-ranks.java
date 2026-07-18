class Solution {
    public String[] findRelativeRanks(int[] score) {

        String[] result = new String[score.length];

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = sorted.length - 1; i >= 0; i--) {
            map.put(sorted[i], rank++);
        }

        int i = 0;

        for (int x : score) {
            int y = map.get(x);
            
            if (y == 1) {
                result[i++] = "Gold Medal";
            } else if (y == 2) {
                result[i++] = "Silver Medal";
            } else if (y == 3) {
                result[i++] = "Bronze Medal";
            } else {
                result[i++] = Integer.toString(y);
            }
        }

        return result;

    }
}