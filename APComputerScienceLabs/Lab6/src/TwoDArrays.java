import java.util.Arrays;

public class TwoDArrays {
    private int[][] nums;

    public TwoDArrays(int[][] nums){
        this.nums = nums;
    }

    public int sum(){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++)
                sum += nums[i][j];
        }
        return sum;
    }

    public boolean isSquare(){
        if(nums.length == nums[0].length)
            return true;
        return false;
    }

    public boolean inSequence(){
        int dummy = 1;
        if(isSquare()){
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if(nums[i][j] != dummy)
                        return false;
                    dummy++;
                }
            }
        }
        else
            return false;
        return true;
    }

    public int[] closestToZero(){
        int len = nums.length, index = -1, closest = Integer.MAX_VALUE;
        int[] close = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(Math.abs(nums[i][j] - 0) < closest) {
                    index = j;
                    closest = Math.abs(nums[i][j] - 0);
                }
            }
            close[i] = nums[i][index];
        }
        return close;
    }

    public void addMatrix(int[][] other){
        int[][] newNums = Arrays.copyOf(nums, other.length);
        for(int i = nums.length; i < newNums.length; i++)
            newNums[i] = other[i - 3];
        print(newNums);
    }

    private void print(int[][] newNums){
        for (int[] nums : newNums)
            System.out.println(Arrays.toString(nums));
    }

    public int columnSum(int col){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i].length > col)
                sum += nums[i][col];
        }
        return sum;
    }

    public boolean isColumnMagic(){
        int sum = 0;
        int[] columnSums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

        }
        return true;
    }
}
