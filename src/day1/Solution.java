package day1;

public class Solution {

    public static int removeDuplicates(int[] n) {

        if (n.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < n.length; j++) {
            if (n[j] != n[i]) {
                i++;
                n[i] = n[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] bb=new int[]{1,6,2,2,3};
        
        System.out.println( removeDuplicates(bb));
    }

}
