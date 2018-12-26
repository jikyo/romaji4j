package com.github.jikyo.romaji;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The entry point to the romanization method.
 * <p>
 * This class provides a static method to transliterate hiragana/katakana string to romaji string.
 */
@SuppressWarnings("WeakerAccess")
public class Transliterator {

    /**
     * Transliterate hiragana/katakana string to romaji strings.
     * Note that if an input string contained kanji's or ths other characters
     * which do not have corresponding romajis,
     * the sub-sequence does not be transliterated
     * and is as same as the original sub-string.
     * For example, an input string "お茶の水" is transliterated to "o茶no水".
     *
     * Note for the lookahead.
     * "lookahead0" always reduces one character to transliterate to romaji.
     * For example, suppose that the input string is "とうきょう".
     * Then "lookahead0" always reads "と" at first, then reads "う".
     * On the other hand, "lookahead1" peeks on the next one character
     * at the current position without shift.
     * At first, "lookahead1" tries to transliterate "とう".
     * When it failed, then "lookahead1" reads "と".
     *
     * In Japanese, the longest length of hiragana/katakana strings
     * which correspond to one romaji is 2.
     * Therefore, we only need 0 and 1 lookahead's.
     *
     * @param src an input string.
     * @return a list of romaji strings.
     */
    @SuppressWarnings("WeakerAccess")
    public static List<String> transliterate(final String src) {
        if (Objects.isNull(src) || src.isEmpty()) {
            return Collections.emptyList();
        }

        Transliteration lookahead1 = Transliteration.valueOf();
        Transliteration lookahead0 = Transliteration.valueOf();

        IntStream.range(0, src.length())
                .forEachOrdered(index -> {
                    lookahead1.tryToAppend(Substring.lookahead(1, src, index));
                    Substring sub = Substring.valueOf(src, index);
                    lookahead1.tryToAppend(sub);
                    lookahead0.tryToAppend(sub);
                });

        return Stream.concat(lookahead1.romajis().stream(), lookahead0.romajis().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
