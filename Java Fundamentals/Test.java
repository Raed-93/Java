public class Test{
    public static void main(String[] args){
		int j =1;
		for(int i=1; i < nums.length; i++ ){
			if(nums[i] != nums[i - 1]){
				 nums[j] = nums[i];
                j += 1;

			}
             
		}

	
     return j;

    }
}