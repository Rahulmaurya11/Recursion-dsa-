public class leetcode {
    //Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    //
    //Specifically, ans is the concatenation of two nums arrays.
    public static void main(String[] args) {
        int [] num = {1,2,1,5,6,7};
        //creating array variable of double size
        int [] result = new int[num.length*2];
        System.out.print("given number : ");
        for(int i = 0;i<num.length;i++)
        {
            result[i]=num[i];
            System.out.print(num[i]);
        }
        System.out.println();

        for( int j=num.length,i=0;j<result.length && i<num.length;j++,i++)
        {
            result[j]=num[i];}
        System.out.print("result: ");

        for (int i = 0 ;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}

