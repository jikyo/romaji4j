package com.github.jikyo.romaji;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransliteratorTest extends TestCase {

    private static final Map<String, List<String>> TRANSLITERATE_CASE = Collections.unmodifiableMap(new HashMap<String, List<String>>() {{
        put("きょうと", Arrays.asList(
                "kilyoto",
                "kilyouto",
                "kixyoto",
                "kixyouto",
                "kyoto",
                "kyouto"));
        put("トッキョ", Arrays.asList(
                "tokkilyo",
                "tokkixyo",
                "tokkyo",
                "toltsukixyo",
                "toltsukyo",
                "toltukilyo",
                "toltukyo",
                "toxtukixyo",
                "toxtukyo"));
        put("ドラえもん", Arrays.asList(
                "doraemon",
                "doraemon'",
                "doraemonn"));
        put("っっっっっ", Arrays.asList(
                "ltsultsultsultsultsu",
                "ltultultultultu",
                "xtuxtuxtuxtuxtu"));
        put("僕ドラえもん", Arrays.asList(
                "僕doraemon",
                "僕doraemon'",
                "僕doraemonn"));
        put("東京都", Arrays.asList("東京都"));
        put("お茶の水", Arrays.asList("o茶no水"));
    }});

    public void testTransliterate() {
        TRANSLITERATE_CASE.forEach((k, v) -> {
            String msg = String.valueOf("test for \"" + k + "\"");
            assertEquals(msg, v, Transliterator.transliterate(k));
        });
    }

    public void testTransliterateEmpty() {
        assertEquals(Collections.emptyList(), Transliterator.transliterate(""));
    }

    public void testTransliterateNull() {
        assertEquals(Collections.emptyList(), Transliterator.transliterate(null));
    }

}
