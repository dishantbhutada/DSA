class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int low = 0;
        int res = -1;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {

            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            while (freq.size() > 2) {

                int leftFruit = fruits[low];

                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                low++;
            }

            res = Math.max(res, right - low + 1);
        }

        return res;
    }
}