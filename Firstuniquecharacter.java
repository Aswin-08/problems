import java.util.*;
class Firstuniquecharacter{
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        String s="leetcode";
        int i=isunique(s);
        System.err.println(i);
        
    }
    public static int isunique(String s){
        int[] a = new int[26];
        Arrays.fill(a, 0);
        for(int i=0;i<s.length();i++){
            a[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i) - 'a'] == 1)
                return 1;
        }

        return -1;
    }
}
