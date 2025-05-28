class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int comp;
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            comp=target-nums[i];
            if(map.containsKey(comp)){
                result[0]=i;
                result[1]=map.get(comp);
                return result;
            }
            else{
                map.put(nums[i],i);
            }
        }
    return result;    
    }
}
