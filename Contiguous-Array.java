class Solution {
    public int findMaxLength(int[] nums) {
        int len=nums.length;
        int curr=0;
        HashMap<Integer,Integer> map=new HashMap<>(); 
        int maxlen=0;
        for(int i=0;i<len;i++){
            curr=curr+(nums[i]==1?1:-1);
            if(curr==0){
                maxlen=Math.max(maxlen,i+1);
            }
            if(map.containsKey(curr)){
                int temp=i-map.get(curr);
                maxlen=Math.max(maxlen,temp);
            }
            else map.put(curr,i);
        }
        return maxlen;
    }
}