package com.github.jikyo.romaji;

import junit.framework.TestCase;

public class MappingTest extends TestCase {

    public void testHasSystemStandard() {
        Mapping.MAP.forEach((k, v) -> {
            String msg = "\"" + k + "\" does not have System.STANDARD.";
            assertNotNull(msg, v.get(System.STANDARD));
        });
    }

}
