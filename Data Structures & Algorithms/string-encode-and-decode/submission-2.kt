class Solution {

    
    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (s in strs) sb.append(s.length).append('#').append(s)
        return sb.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while (str[j] != '#') j++               // the length number ends at '#'
            val len = str.substring(i, j).toInt()
            val start = j + 1
            result.add(str.substring(start, start + len))
            i = start + len                         // skip the content, never scan it
        }
        return result
    }
}
