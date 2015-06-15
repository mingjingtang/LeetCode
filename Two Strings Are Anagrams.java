public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String b) {
        // write your code here
        // 2015-06-15 10:43:42 pause 2015-06-15 11:14:28 start 2015-06-15 12:01:23 end 2015-06-15 13:13:02  1.5h
        int count = 0;
        if( s.length() == 0 || b.length() == 0)
            return false;
    
        for(int i = 0; i <= s.length()-1; i++)
        {
            for(int j = 0; j <= b.length()-1; j++)
            {
                if(s.charAt(i) == b.charAt(j))
                {
                    count++;
                    break;
                    // return true;
                }
                else
                    continue;
            }
        }
        
        if(count == s.length())
                return true;
        else
                return false;
    }
};
