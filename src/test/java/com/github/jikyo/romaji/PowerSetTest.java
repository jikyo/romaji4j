package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PowerSetTest extends TestCase {

    public void testEmptySet() {
        Set<Set<Integer>> expected = new HashSet<>();
        expected.add(Collections.emptySet());
        assertEquals(expected, PowerSet.powerSet(Collections.emptySet()));
    }

    public void testPowerSet() {
        Set<Integer> set = Stream.of(0, 1, 2).collect(Collectors.toSet());
        Set<Set<Integer>> expected = Stream.of(
                Stream.of(0, 1, 2).collect(Collectors.toSet()),
                Stream.of(0, 1).collect(Collectors.toSet()),
                Stream.of(0, 2).collect(Collectors.toSet()),
                Stream.of(1, 2).collect(Collectors.toSet()),
                Stream.of(0).collect(Collectors.toSet()),
                Stream.of(1).collect(Collectors.toSet()),
                Stream.of(2).collect(Collectors.toSet())
        ).collect(Collectors.toSet());
        expected.add(Collections.emptySet());
        assertEquals(expected, PowerSet.powerSet(set));
    }

}
