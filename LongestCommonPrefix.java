/*****************************************************
* Simple solution to find the longest common prefix. *
* Runtime is O(n^2). The algorithm is:   	     *
* 1) Sort the given array of string, the longest pre-*
*    ix can be no longer than the shortest word.     *
* 2) for each letter in the shortest word see if the *
*    letter exists in all the other words.	     *
* 3) keep a count of the index where they match      *
*****************************************************/
public String longestCommonPrefix(String[] strs) {
	if(strs.length == 0) return "";
        
        boolean hasOneChild = true;
        int index = 0;
        Arrays.sort(strs, Comparator.comparing(String::length));
        char[] prefix = new char[strs[0].length()];
        String sPrefix = "";
        System.out.println(Arrays.toString(strs));
        
        
        OUTER_LOOP:
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    break OUTER_LOOP;
                }
            }
            index++;
        }
        
        for(int i = 0; i < index; i++) sPrefix = sPrefix + strs[0].charAt(i);
        return sPrefix;
}
