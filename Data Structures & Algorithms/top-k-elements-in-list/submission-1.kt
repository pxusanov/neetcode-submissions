class Solution {
          fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            var frequency = 0
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j]) {
                    frequency++
                }
            }
            map.putIfAbsent(nums[i], frequency + 1)
        }
        val res = map.keys.sortedBy { map[it] }
        return res.takeLast(k).toIntArray()
    }
}
