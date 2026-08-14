class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=0,c=0,sum=0;

        for(char i='a';i<='z';i++){
            for(int j=0;j<Math.min(s.length(),t.length());j++){
                char ch= s.charAt(j);
                char ch1= t.charAt(j);
                if(ch1==i){
                    s1++;
                }
                if(ch==i){
                    c++;
                }
            }
            if(s1==c){
                sum+=s1;
                s1=0;
                c=0;
            }
            else{
                s1=0;c=0;
            }
        }
        if(sum==Math.max(s.length(),t.length())){
            return true;
        }
        else{
            return false;
        }
    }
}