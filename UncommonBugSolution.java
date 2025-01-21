import java.util.Arrays;
public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds!\n" + e.getMessage());
        }
        System.out.println(Arrays.toString(arr));
        //Proper way of handling
        int index = 5;
        if(index>=0 && index < arr.length){
            System.out.println(arr[index]);
        } else{
            System.out.println("Index out of bounds");
        }
    }
}
