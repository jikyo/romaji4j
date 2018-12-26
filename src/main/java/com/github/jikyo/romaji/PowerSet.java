package com.github.jikyo.romaji;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A utility class that generates a power set (a set of all subsets) from an input set.
 */
class PowerSet {

    private PowerSet() {}

    /**
     * this method is recursive.
     * The base case is that the input set is an empty set and return a empty set without recurring.
     * With each recursive call, at first, the method generates a result set that contains only the input set.
     * Moreover, for each element of the input set, the method generates a new set which does not contains the element.
     * Finally, for each new sets, call the method itself with the set as input, and add all result to the result set.
     *
     * @param <T> the type of a element of the input set.
     * @param src the input set.
     * @return the set of all subsets of the input set.
     */
    static <T> Set<Set<T>> powerSet(final Set<T> src) {
        Set<Set<T>> power = Stream.of(src).collect(Collectors.toSet()); // add a input set to the result power set.
        src.forEach(exclusion ->
            power.addAll(
                    powerSet(src.stream()
                            .filter(element -> element != exclusion)
                            .collect(Collectors.toSet()))
            )
        );
        return power;
    }

}
