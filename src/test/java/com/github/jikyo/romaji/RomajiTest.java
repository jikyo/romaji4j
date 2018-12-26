package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomajiTest extends TestCase {

    public void testRomaji() {
        Romaji romaji = Romaji.valueOf(new HashMap<System, String>() {{
            put(System.STANDARD,	"zya");
            put(System.SHORT,		"ja");
            put(System.LONG,		"jya");
        }});

        // test for get.
        assertEquals("zya", romaji.get(System.STANDARD));
        assertNull(romaji.get(System.L));

        // test for systems.
        Set<System> expect = Stream.of(System.STANDARD, System.SHORT, System.LONG).collect(Collectors.toSet());
        assertEquals(expect, romaji.systems());
    }

}
