public class FirstInstance {
    public static void main(String[] args){
        int[] ints = {1,1,2,2,3,4,5,5};
        for(int i = 0; i < ints.length; i++){
            if(isFirstInstance(ints)[i]){
                System.out.println(ints[i] + " first instance");
            }
            else{
                System.out.println(ints[i] + " NOT first instance");
            }
        }
    }

    public static boolean[] isFirstInstance(int[] nums){
        boolean[] firstInstanceArray = new boolean[nums.length];
        firstInstanceArray[0] = true;
        for(int i = 1; i < nums.length; i++){
            firstInstanceArray[i] = true;
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    firstInstanceArray[i] = false;
                    break;
                }
            }
        }
        return firstInstanceArray;
    }
}
