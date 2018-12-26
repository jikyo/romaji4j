package com.github.jikyo.romaji;

import java.util.Map;
import java.util.Set;

/**
 * Romaji is a value of a mapping from a hiragana/katakana string to romaji.
 * A value itself also has a mapping from <code>System</code> to romaji string.
 *
 * @see System
 */
class Romaji {

    private final Map<System, String> map;
    private final Set<System> systems;

    private Romaji(final Map<System, String> map) {
        this.map = map;
        this.systems = map.keySet();
    }

    static Romaji valueOf(final Map<System, String> map) {
        return new Romaji(map);
    }

    Set<System> systems() {
        return this.systems;
    }

    String get(final System system) {
        return this.map.get(system);
    }

}
