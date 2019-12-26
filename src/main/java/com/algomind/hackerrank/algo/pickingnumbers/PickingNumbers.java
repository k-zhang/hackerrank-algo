package com.algomind.hackerrank.algo.pickingnumbers;

import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class PickingNumbers {
    public int pickingNumbers(List<Integer> input) {
        Map<Integer, Long> frequencyMap = input.stream().collect(groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> numbers = frequencyMap.keySet().stream().sorted().collect(Collectors.toList());

        if(numbers.size() == 1) {
            return frequencyMap.get(numbers.get(0)).intValue();
        }

        List<int[]> pairs = IntStream.range(0, numbers.size() - 1).boxed().map(i -> new int[] {numbers.get(i), numbers.get(i + 1)}).filter(pair -> Math.abs(pair[1] - pair[0]) == 1).collect(Collectors.toList());

        OptionalLong result = pairs.stream().mapToLong(pair -> frequencyMap.get(pair[0]) + frequencyMap.get(pair[1])).max();

        return result.isPresent() ? (int)result.getAsLong() : 0;
    }
}
