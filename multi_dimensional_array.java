import javax.sound.sampled.SourceDataLine;

class Array{
    public static void main(String[] args) {
        int nums[][]=new int [3][4];
        for (int i = 0;i<3;i++){
            for(int j = 0; j<4;j++){
                nums[i][j]= (int)(Math.random() *10);
                System.out.println(nums[i][j]);
            }
        }
            
        
        for (int i = 0;i<3;i++){
            for(int j = 0; j<4;j++){
            System.out.print(nums[i][j] + " ");
        }
        System.out.println( );
    }
    //we want to see first element from the array but since the 1st element is also an array so we get the same array as result
    for(int n[]:nums){
        for(int m :n ){
            System.out.print(m + " ");
        }
        System.out.println();
    }
        
    }
}