# Romaji

`Romaji` は、日本語のひらがな/カタカナ表記を、標準的なローマ字とIMEでのローマ字タイピングに準ずるローマ字へ変換するライブラリです。
[icu::Transliterator](http://userguide.icu-project.org/transforms/general) は既に同じ機能を提供しており、一つのローマ字表記を返却します。
しかし、ローマ字への変換方法は幾つか存在する為、ひらがな/カタカナ表記の文字列は多くのローマ字表記をもつことになります。
例として、 `"ちゃ"` はローマ字表記 `"cha"`、`"tya"`、`"chixya"`、`"tixya"`、`"chilya"`、`"tilya"` をもつことができます。
`Romaji` は可能な限り多くのローマ字表記を返却します。

入力文字列にひらがな/カタカナ以外の文字 (特に漢字など)が含まれている場合、 `Romaji` はそれらの文字列をそのまま返却します。
例えば、 `Romaji` は入力 `"お茶の水""` を `"o茶no水"` に変換します。

ひらがな/カタカナからローマ字へのマッピングは一般的な IME の入力方式に基づいています。
その為、 `Romaji` は、ヘボン式、日本式、訓令式等の標準的な変換方式を直接実装はしていませんが、それらを含む変換を行います。

[英語](README.md) (For English Documentation)


# Requirement

* `Romaji` は依存関係のない Java ネイティブなライブラリです。
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