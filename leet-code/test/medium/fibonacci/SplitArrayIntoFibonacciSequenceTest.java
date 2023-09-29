package medium.fibonacci;

import medium.fibonacci.SplitArrayIntoFibonacciSequence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class SplitArrayIntoFibonacciSequenceTest {

    @Test
    void splitIntoFibonacci() {
        SplitArrayIntoFibonacciSequence solution = new SplitArrayIntoFibonacciSequence();
        List<Integer> actual = solution.splitIntoFibonacci("1101111");
        List<Integer> expected = Arrays.asList(11, 0, 11, 11);
        Assert.assertEquals(actual, expected);

        actual = solution.splitIntoFibonacci("112358130");
        expected = Arrays.asList();
        Assert.assertEquals(actual, expected);

        actual = solution.splitIntoFibonacci("0123");
        expected = Arrays.asList();
        Assert.assertEquals(actual, expected);

    }
}