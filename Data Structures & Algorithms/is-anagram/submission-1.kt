class Solution {
     fun isAnagram(s: String, t: String): Boolean {
       val counts = IntArray(26)
       if(s.length != t.length) return false
       for (i in 0 until s.length){
        counts[s[i] - 'a']++
        counts[t[i] - 'a']--
       }
        return counts.all { it == 0 }
    }
}
