class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        String[] ans = new String[n];
        int idx=0;

        for(int i=0;i<n;i++){
            String ch = arr[i];

            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j].equals(ch)){
                    count++;
                }
            }
            if(count==1){
                ans[idx++]=arr[i];
            }
        }
        if(k>idx){
            return "";
        };
        return ans[k-1];


        
    }
}