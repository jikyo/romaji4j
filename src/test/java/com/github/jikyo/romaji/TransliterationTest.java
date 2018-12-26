package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransliterationTest extends TestCase {

    public void testTryToAppendNull() {
        Transliteration transliteration = Transliteration.valueOf();
        transliteration.tryToAppend(null);
        assertEquals(Collections.EMPTY_LIST, transliteration.romajis());
    }

    public void testTryToAppendNotMatch() {
        Transliteration transliteration = Transliteration.valueOf();
        Substring sub = Substring.lookahead(2, "よじょうはん", 0);
        assertEquals(Collections.EMPTY_LIST, transliteration.romajis());
    }

    public void testFindSystem() {
        Set<System> systems;

        Substring sub = Substring.valueOf("っ", 0);
        systems = sub.systems();
        assertEquals(System.L, Transliteration.findSystem(sub, systems));

        systems = Stream.of(System.STANDARD, System.LONG).collect(Collectors.toSet());
        assertEquals(System.LONG, Transliteration.findSystem(sub, systems));
    }

    public void testSubstringToRomaji() {
        Set<System> systems;
        Substring sub = Substring.valueOf("っ", 0);

        systems = Stream.of(System.STANDARD, System.LONG).collect(Collectors.toSet());
        assertEquals("ltsu", Transliteration.substringToRomaji(sub, systems));

        systems = Stream.of(System.STANDARD, System.L).collect(Collectors.toSet());
        assertEquals("ltu", Transliteration.substringToRomaji(sub, systems));

        systems = Stream.of(System.STANDARD).collect(Collectors.toSet());
        assertEquals("xtu", Transliteration.substringToRomaji(sub, systems));

        systems = Stream.of(System.STANDARD, System.Y).collect(Collectors.toSet());
        assertEquals("xtu", Transliteration.substringToRomaji(sub, systems));
    }

    public void testRomaji() {
        String src = "あっち";

        Set<System> systems;
        List<Substring> subs = Arrays.asList(
                Substring.valueOf(src, 0),
                Substring.valueOf(src, 1),
                Substring.valueOf(src, 2));

        systems = Stream.of(System.STANDARD, System.LONG).collect(Collectors.toSet());
        assertEquals("altsuchi", Transliteration.romaji(subs, systems));

        systems = Stream.of(System.STANDARD, System.Y).collect(Collectors.toSet());
        assertEquals("axtuti", Transliteration.romaji(subs, systems));

        systems = Stream.of(System.STANDARD).collect(Collectors.toSet());
        assertEquals("axtuti", Transliteration.romaji(subs, systems));
    }

    public void testRomajis() {
        String src = "アッチ";

        Transliteration transliteration = Transliteration.valueOf();
        transliteration.tryToAppend(Substring.lookahead(0, src, 0));
        transliteration.tryToAppend(Substring.lookahead(0, src, 1));
        transliteration.tryToAppend(Substring.lookahead(0, src, 2));

        List<String> expected = Arrays.asList(
                "axtuti",
                "altuti",
                "altsuchi",
                "altuchi",
                "atti",
                "acchi"
        );
        List<String> actual = transliteration.romajis();
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    public void testRomajisEmpty() {
        Transliteration transliteration = Transliteration.valueOf();
        assertEquals(Collections.emptyList(), transliteration.romajis());
    }

}
