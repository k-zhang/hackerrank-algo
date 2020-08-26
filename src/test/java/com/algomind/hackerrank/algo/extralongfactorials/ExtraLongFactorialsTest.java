package com.algomind.hackerrank.algo.extralongfactorials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

class ExtraLongFactorialsTest {
    private ExtraLongFactorials extraLongFactorials = new ExtraLongFactorials();

    @ParameterizedTest
    @MethodSource("provideData")
    public void test(BigInteger result, int number) {
        Assertions.assertEquals(result, extraLongFactorials.extraLongFactorials(number));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(Arguments.of(new BigInteger("15511210043330985984000000"), 25));
    }
}