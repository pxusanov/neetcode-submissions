class Solution {

       private fun isAnagram(s1: String, s2: String): Boolean {
        val count = IntArray(26)
        if (s1.length != s2.length) return false
        for (i in s1.indices) {
            count[s1[i] - 'a']++
            count[s2[i] - 'a']--
        }
        return count.all { it == 0 }
    }
    
     fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = hashMapOf<String, List<String>>()

        strs.forEach { item ->
            var foundGroup = false
            for (entry in map) {
                if (isAnagram(item, entry.key)) {
                    map[entry.key] = entry.value + item
                    foundGroup = true
                    break
                }
            }
            if (!foundGroup) map[item] = listOf(item)
        }

        return map.values.toList()

    }

}
