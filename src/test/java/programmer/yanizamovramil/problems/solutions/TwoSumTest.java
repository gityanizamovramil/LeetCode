package programmer.yanizamovramil.problems.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    //case 1
    //nums = [2,7,11,15];
    //target = 9;
    @Test
    void twoSum_Case_1() {
        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);

        Assertions.assertNotNull(bruteForceSum);
        System.out.println(Arrays.toString(bruteForceSum));

        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        Assertions.assertNotNull(optimizedByHashTableSum);
        System.out.println(Arrays.toString(optimizedByHashTableSum));
    }

    //case 2
    //nums = [3,2,4]
    //target = 6;
    @Test
    void twoSum_Case_2() {
        int[] nums = {3,2,4};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);

        Assertions.assertNotNull(bruteForceSum);
        System.out.println(Arrays.toString(bruteForceSum));

        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        Assertions.assertNotNull(optimizedByHashTableSum);
        System.out.println(Arrays.toString(optimizedByHashTableSum));
    }

    //case 3
    //nums = [3,3];
    //target = 6;
    @Test
    void twoSum_Case_3() {
        int[] nums = {3,3};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);

        Assertions.assertNotNull(bruteForceSum);
        System.out.println(Arrays.toString(bruteForceSum));

        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        Assertions.assertNotNull(optimizedByHashTableSum);
        System.out.println(Arrays.toString(optimizedByHashTableSum));
    }

    //case 4
    //nums = [-3,4,3,90]
    //target = 0;
    @Test
    void twoSum_Case_4() {
        int[] nums = {-3,4,3,90};
        int target = 0;

        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);

        Assertions.assertNotNull(bruteForceSum);
        System.out.println(Arrays.toString(bruteForceSum));

        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        Assertions.assertNotNull(optimizedByHashTableSum);
        System.out.println(Arrays.toString(optimizedByHashTableSum));
    }


}