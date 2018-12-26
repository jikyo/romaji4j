package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubstringTest extends TestCase {

    public void testLookahead() {
        String src = "ヨジョウはん";
        Substring sub;

        sub = Substring.lookahead(2, src, 0);
        assertNull(sub);

        sub = Substring.lookahead(0, src, 2);
        assertNotNull(sub);
        assertEquals(2, sub.index());
        assertEquals(1, sub.window());
        assertEquals("ョ", sub.src());
        assertTrue(sub.hasRomaji());
        assertEquals(Stream.of(System.STANDARD, System.L).collect(Collectors.toSet()), sub.systems());

        sub = Substring.lookahead(1, src, 1);
        assertNotNull(sub);
        assertEquals(1, sub.index());
        assertEquals(2, sub.window());
        assertEquals("ジョ", sub.src());
        assertTrue(sub.hasRomaji());
        assertEquals(Stream.of(System.STANDARD, System.SHORT, System.LONG).collect(Collectors.toSet()), sub.systems());

        sub = Substring.lookahead(1, src, 5);
        assertNull(sub);

        sub = Substring.lookahead(0, src, 6);
        assertNull(sub);
    }

}
