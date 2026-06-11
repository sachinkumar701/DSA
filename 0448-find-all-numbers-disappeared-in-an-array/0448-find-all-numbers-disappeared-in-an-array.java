class Solution {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[]frq=new int[nums.length+1];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int t=nums[i];
            frq[t]++;
        }
        for(int i=1; i<=nums.length; i++){
            if(frq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}