class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){

            //full till i subarray check the target sum
            sum=sum+nums[i]; 
            if(sum==k){
                count++;
            }
            
            //previous subarray i-1 check the target sum
            int temp=sum-k;
            if(map.containsKey(temp)){
                count=count+map.get(temp);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
