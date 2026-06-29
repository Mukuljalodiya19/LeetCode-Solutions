class Solution {
    public List<Integer> findDuplicates(int[] nums) {
   
ArrayList<Integer> myList=new ArrayList<>();
for(int i=0; i <nums.length;i++){
int x=Math.abs(nums[i])-1;


if(nums[x]>0){
nums[x]=-nums[x];
}else{
myList.add(x+1);
}
}
return myList;
}
    
}