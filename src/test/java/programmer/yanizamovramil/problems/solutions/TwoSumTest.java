package programmer.yanizamovramil.problems.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    //case 1
    //nums = [2,7,11,15];
    //target = 9;
    @Test
    void twoSum_Case_1() {
        //Given
        int[] nums = {2,7,11,15};
        int target = 9;
        //When
        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);
        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        //Then
        Assertions.assertNotNull(bruteForceSum);
        Assertions.assertNotNull(optimizedByHashTableSum);
    }

    //case 2
    //nums = [3,2,4]
    //target = 6;
    @Test
    void twoSum_Case_2() {
        //Given
        int[] nums = {3,2,4};
        int target = 6;
        //When
        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);
        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        //Then
        Assertions.assertNotNull(bruteForceSum);
        Assertions.assertNotNull(optimizedByHashTableSum);
    }

    //case 3
    //nums = [3,3];
    //target = 6;
    @Test
    void twoSum_Case_3() {
        //Given
        int[] nums = {3,3};
        int target = 6;
        //When
        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);
        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        //Then
        Assertions.assertNotNull(bruteForceSum);
        Assertions.assertNotNull(optimizedByHashTableSum);
    }

    //case 4
    //nums = [-3,4,3,90]
    //target = 0;
    @Test
    void twoSum_Case_4() {
        //Given
        int[] nums = {-3,4,3,90};
        int target = 0;
        //When
        TwoSum twoSum = new TwoSum();
        int[] bruteForceSum = twoSum.bruteForce(nums, target);
        int[] optimizedByHashTableSum = twoSum.optimizedByHashTable(nums, target);
        //Then
        Assertions.assertNotNull(bruteForceSum);
        Assertions.assertNotNull(optimizedByHashTableSum);
    }

}