# Romaji

`Romaji` is a converter library to romanize Japanese hiragana/katakana string by standard and IME typing style.
Even though [icu::Transliterator](http://userguide.icu-project.org/transforms/general) already has provided the same functions, and returns only one romanized string.
However, there exists several different romanization systems, so one hiragana/katakana string has so many romanize string.
For example, `"ちゃ"` can be romanized as `"cha"`, `"tya"`, `"chixya"`, `"tixya"`, `"chilya"`, or `"tilya"`.
`Romaji` provides romanized strings as many as possible.

If an input string contained non hiragana/katakana characters (includes kanji), `Romaji` return the characters as same as the input.
For example, `Romaji` converts the input `"お茶の水"` to `"o茶no水"`.

The mapping from hiragana/katakana to romaji is based on common IME's system to input Japanese.
Therefor, `Romaji` does not directly implement the standard system like Hepburn, Nihon-shiki or Kunrei-shiki, but includes them.

[日本語](README.ja.md) (For Japanese Documentation)


# Requirement

* `Romaji` is pure Java code with no dependencies.
* Java 8+


# Installation

(in preparation)

```bash
$ git clone https://github.com/jikyo/romaji4j.git
$ cd romaji4j
$ mvn install
```


# Usage

```java
import com.github.jikyo.romaji.Transliterator;


public class Main {
    public static void main(String args[]) {
        String src = "僕ドラえもん";
        List<String> results = Transliterator.transliterate(src);
        System.out.println(results); // [僕doraemon, 僕doraemon', 僕doraemonn]
    }
}
```


# pom.xml

```xml
        <dependency>
            <groupId>com.github.jikyo.romaji</groupId>
            <artifactId>romaji</artifactId>
            <version>0.0.1</version>
        </dependency>
```