package com.algomind.hackerrank.algo.circularrotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CircularRotationTest {
    private CircularRotation circularRotation = new CircularRotation();

    @ParameterizedTest
    @MethodSource("provideData")
    public void test(int[] results, int[] a, int k, int[] queries) {
        Assertions.assertArrayEquals(results, circularRotation.circularArrayRotation(a, k, queries));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{2,3,1}, new int[]{1,2,3}, 2, new int[]{0, 1, 2})
        );
    }
}