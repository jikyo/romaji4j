package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilterTest extends TestCase {

    public void testReplaceXtu() {
        // test for replaced.
        assertEquals("acchi", Filter.replaceXtu("axtsuchi"));
        assertEquals("gattu", Filter.replaceXtu("galtutu"));
        assertEquals("gattu", Filter.replaceXtu("galtsutu"));
        assertEquals("axtsu", Filter.replaceXtu("axtsu"));
        // test for not replaced.
        assertEquals("axtsua", Filter.replaceXtu("axtsua"));
        assertEquals("axtui", Filter.replaceXtu("axtui"));
        assertEquals("altsuu", Filter.replaceXtu("altsuu"));
        assertEquals("altue", Filter.replaceXtu("altue"));
        assertEquals("axtsuo", Filter.replaceXtu("axtsuo"));

        assertEquals("xtsuxtsu", Filter.replaceXtu("xtsuxtsu"));
        assertEquals("altultua", Filter.replaceXtu("altultua"));
    }

    public void testReplaceOuToO() {
        assertEquals("o", Filter.replaceOuToO("ou"));
        assertEquals("ou", Filter.replaceOuToO("ouu"));
        assertEquals("ouu", Filter.replaceOuToO("ouuu"));
        assertEquals("ouuo", Filter.replaceOuToO("ouuuou"));
    }

    public void testExpandAndReduce() {
        String target = "axtsuchinohougaku";
        List<String> expected = Arrays.asList("acchinohogaku", target);
        List<String> actual = Filter.expandAndReduce(Arrays.asList(target));
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

}
