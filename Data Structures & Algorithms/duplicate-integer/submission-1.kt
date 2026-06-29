class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
          val set = nums.toSet()
        return set.size != nums.size
    }
}
