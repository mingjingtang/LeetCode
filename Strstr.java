public class Solution {
    public int strStr(String haystack, String needle) {
        // 2015-06-03 22:46:58  pause 2015-06-03 23:47:32  start 2015-06-14 15:08:23 finished 2015-06-14 17:41:28
        // if(haystack.length() == 0 && needle.length() == 0)
        //     return 0;
        
        // if(haystack == null || needle == null || haystack.length() == 0 || needle.length() == 0)
        //     return -1;
        if(haystack == null || needle == null)
            return -1;
        //0 0 -> 0
        //0 X -> -1
        //X 0 -> 0
        //X X -> code
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
            
            
        // if(haystack.isEmpty()){
            for(int i = 0; i <= haystack.length() - 1 - (needle.length() - 1); i++){
                // char start = haystack.charAt(i);
                // char end = haystack.charAt(i);
   //             for(int j = 0; j < needle.length();j++){
                    // if(haystack.charAt(j)==needle.charAt(j))
                    //     return i;
                    // else return 0;
  //                  end = haystack.charAt(j);
                    for(int k = 0; k < needle.length(); k++){
                        
                        //idential - continue
                        if(haystack.charAt(i + k) == needle.charAt(k) ){
                            if(k == needle.length() - 1)
                                return i;
                            continue;
                        }
                        
                            
                        //not idential - break
                        if(haystack.charAt(i + k) != needle.charAt(k) )
                            break;
                            
                        
                        
                        // if(end == needle.charAt(k)){
                        //     end = haystack.charAt(i+k+1);
                        //     if(end == (needle.charAt(needle.length()-1)))
                        //         return i;
                        //     // else
                        //     //     return -1;
                        // }//if
                        // else
                        // 	break;
                    }//for
   //             }//for
            }
            // return -1;
        // }
        // else 
        // 	return -1;
//		return 0;
        return -1;
    }
}