package com.github.jikyo.romaji;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A filter class to expand and reduce romaji strings.
 */
class Filter {

    // the pattern for non-vowel following the small "っ",
    // or also "っ" is not continuous.
    private static final Pattern PATTERN_XTU = Pattern.compile("(xtsu|ltsu|ltu)(?!xtsu|ltsu|ltu)([bcdfghjklmnpqrstvwxyz])",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    static String replaceXtu(final String src) {
        return PATTERN_XTU.matcher(src).replaceAll("$2$2");
    }

    static String replaceOuToO(final String src) {
        return src.replace("ou", "o");
    }

    /**
     * expand and reduce the input romajis as follows:
     *
     * * reduce "ou" to "o".
     * * duplicated the char following "っ (xtls, xtu, ...)" and delete the "っ"
     *   if the following char is not vowel or "っ" is not continuous.
     *
     * @param src the input list of the strings which to try to expand and reduce.
     * @return the expanded input list.
     */
    static List<String> expandAndReduce(final List<String> src) {
        return Stream.concat(
                src.stream(), // append the original list.
                src.stream()
                        .map(s -> {
                            s = replaceOuToO(s);
                            s = replaceXtu(s);
                            return s;
                        }))
                .distinct()
                .collect(Collectors.toList());
    }}
