package com.github.jikyo.romaji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The transliteration class from the input string to the romaji representation.
 */
class Transliteration {

    private int index = 0;
    private final List<Substring> substrings = new ArrayList<>();
    private final Set<System> systems = new HashSet<>(); // All of systems which this transliteration has.

    private Transliteration() {}

    static Transliteration valueOf() {
        return new Transliteration();
    }

    /**
     * try to append the substring to this transliteration.
     * Especially note that if the index of the substring was different from this index,
     * <code>tryToAppend</code> does nothing.
     *
     * @param sub the substring to try to append.
     */
    void tryToAppend(final Substring sub) {
        if (Objects.isNull(sub)) {
            return;
        }
        if (sub.index() != this.index) {
            return;
        }
        this.substrings.add(sub);
        this.systems.addAll(sub.systems());
        this.index += sub.window();
    }

    /**
     * search the system which the input substring has.
     * Note that this method currently returns the first system
     * in the systems ordered by the <code>System</code> enum.
     * @see System
     *
     * If not to find the system which satisfies the input substring's condition,
     * return the the default system, <code>System.STANDARD)</code>.
     *
     * @param substring the substring which has the search key.
     * @param systems the systems to search.
     * @return the matching system.
     */
    static System findSystem(final Substring substring, final Set<System> systems) {
        return systems.stream()
                .sorted(Comparator.reverseOrder())
                .filter(system -> !Objects.isNull(substring.romaji(system)))
                .findFirst()
                .orElse(System.STANDARD);
    }

    static String substringToRomaji(final Substring substring, final Set<System> systems) {
        return substring.hasRomaji()
                ? substring.romaji(findSystem(substring, systems))
                : substring.src();
    }

    static String romaji(final List<Substring> substrings, final Set<System> systems) {
        return substrings.stream()
                .map(sub -> substringToRomaji(sub, systems))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    List<String> romajis() {
        if (this.substrings.isEmpty()) {
            return Collections.emptyList();
        }
        return Filter.expandAndReduce(
                PowerSet.powerSet(this.systems)
                        .stream()
                        .map(systems -> romaji(this.substrings, systems))
                        .distinct()
                        .collect(Collectors.toList())
        );
    }

}

