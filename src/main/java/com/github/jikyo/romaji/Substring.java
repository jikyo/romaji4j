package com.github.jikyo.romaji;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/**
 * A substring of the input string with attributes including the corresponding romaji.
 */
class Substring {

    private final int index;
    private final int window;
    private final String src;
    private final Romaji romaji;
    private final boolean hasRomaji;

    private Substring(final String src, final int index) {
        this.index = index;
        this.window = src.length();
        this.src = src;
        this.romaji = Mapping.get(src);
        this.hasRomaji = !Objects.isNull(this.romaji);
    }

    static Substring valueOf(final String str, final int begin) {
        return new Substring(str.substring(begin, begin + 1), begin);
    }

    int index() {
        return this.index;
    }

    int window() {
        return this.window;
    }

    String src() {
        return this.src;
    }

    boolean hasRomaji() {
        return this.hasRomaji;
    }

    Set<System> systems() {
        return this.hasRomaji ? this.romaji.systems() : Collections.emptySet();
    }

    String romaji(final System system) {
        return this.hasRomaji ? this.romaji.get(system) : this.src;
    }

    /**
     * search for the romaji to lookahead with the length n.
     * If the search failed, return <code>null</code>.
     *
     * @param lookahead the length to lookahead.
     * @param str the source string to search.
     * @param begin the index to search at.
     * @return the found Substring.
     */
    static Substring lookahead(final int lookahead, final String str, final int begin) {
        int end = begin + lookahead + 1;
        if (str.length() < end) {
            return null;
        }
        Substring sub = new Substring(str.substring(begin, end), begin);
        if (!sub.hasRomaji()) {
            return null;
        }
        return sub;
    }

}
