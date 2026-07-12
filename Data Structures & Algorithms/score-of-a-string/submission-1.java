class Solution {
    public int scoreOfString(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int sum =0;
        for(int i=0;i<n-1;i++){
            int f = (int) ch[i];
            int l = (int) ch[i+1];

            int diff = Math.abs(f-l);
            sum = sum+diff;
        }
        return sum;
    }
}