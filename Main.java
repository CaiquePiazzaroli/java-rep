import java.util.Arrays;
import java.util.List;

public class Main {

    // esc. global
    static int meuNumero = 40;


    public static void main(String[] args) {
        int[] nums = new int[] {2, 9, 4,10, 90};
        int target = 13;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
