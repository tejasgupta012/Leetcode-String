class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String st="",st1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st=st+ch;
            }
        }
        for(int j=st.length()-1;j>=0;j--){
            char ch1=st.charAt(j);
            st1=st1+ch1;
        }
        return (st1.equals(st)?true:false);
    }
}