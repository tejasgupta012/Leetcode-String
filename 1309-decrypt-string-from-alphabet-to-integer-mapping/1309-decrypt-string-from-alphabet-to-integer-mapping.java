class Solution {
    public String freqAlphabets(String s) {
        int c = 0, m = 0;
        char ch;
        String st = "", st1 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);

            if (ch == '#') {
                c = 1;
                m = 0;
                st1 = "";
                continue;
            }

            if (c == 1) {
                st1 = ch + st1;
                m++;

                if (m == 2) {
                    c = 0;
                    m = 0;
                    st = (char)(Integer.parseInt(st1) + 96) + st;
                    st1 = "";
                }
            } else {
                st = (char)(Character.getNumericValue(ch) + 96) + st;
            }
        }

        return st;
    }
}