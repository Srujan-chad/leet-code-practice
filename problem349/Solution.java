package problem349;
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }
        int[] res = new int[intersect.size()];
        int idx = 0;
        for (int i:intersect){
            res[idx++] = i;
        }
        return res;
    }
}
