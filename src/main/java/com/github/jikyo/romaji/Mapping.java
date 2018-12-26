package com.github.jikyo.romaji;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The mapping from hiragana/katakana to romaji.
 * Note that each of hiragana/katakana char must have the System.STANDARD as a default system.
 *
 * @see System
 * @see Romaji
 */
class Mapping {

    static final Map<String, Romaji> MAP = Collections.unmodifiableMap(new HashMap<String, Romaji>() {{

        // 全角ひらがな

        // あ行
        put("あ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"a");
        }})));
        put("い",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"i");
            //put(System.Y,			"yi");
        }})));
        put("う",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"u");
            //put(System.SHORT,		"wi");
            //put(System.LONG,		"whi");
        }})));
        put("え",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"e");
        }})));
        put("お",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"o");
        }})));

        put("うぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wha");
        }})));
        put("うぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"whi");
            put(System.SHORT,		"wi");
        }})));
        put("うぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"whe");
            put(System.SHORT,		"we");
        }})));
        put("うぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"who");
            put(System.SHORT,		"we");
        }})));

        put("ゐ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wi");
        }})));
        put("ゑ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"we");
        }})));

        put("ぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xa");
            put(System.L,			"la");
        }})));
        put("ぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xi");
            put(System.L,			"li");
            put(System.XY,			"xyi");
            put(System.LY,			"lyi");
        }})));
        put("ぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xu");
            put(System.L,			"lu");
        }})));
        put("ぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xe");
            put(System.L,			"le");
            put(System.XY,			"xye");
            put(System.LY,			"lye");
        }})));
        put("ぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xo");
            put(System.L,			"lo");
        }})));

        put("いぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ye");
        }})));

        // か行
        put("か",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ka");
            put(System.SHORT,		"ca");
        }})));
        put("き",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ki");
        }})));
        put("く",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ku");
            put(System.SHORT,		"cu");
            //put(System.SHORT,		"qu");
        }})));
        put("け",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ke");
        }})));
        put("こ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ko");
        }})));

        put("きゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kya");
        }})));
        put("きぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyi");
        }})));
        put("きゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyu");
        }})));
        put("きぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kye");
        }})));
        put("きょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyo");
        }})));

        put("くゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qya");
        }})));
        put("くゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qyu");
        }})));
        put("くょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"quo");
        }})));

        put("くぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwa");
            put(System.SHORT,		"qa");
            //put(System.LONG,		"kwa");
        }})));
        put("くぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwi");
            put(System.SHORT,		"qi");
            put(System.Y,			"qyi");
        }})));
        put("くぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwu");
        }})));
        put("くぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwe");
            put(System.SHORT,		"qe");
            put(System.Y,			"qye");
        }})));
        put("くぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwo");
            put(System.SHORT,		"qo");
        }})));

        put("が",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ga");
        }})));
        put("ぎ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gi");
        }})));
        put("ぐ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gu");
        }})));
        put("げ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ge");
        }})));
        put("ご",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"go");
        }})));

        put("ぎゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gya");
        }})));
        put("ぎぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyi");
        }})));
        put("ぎゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyu");
        }})));
        put("ぎぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gye");
        }})));
        put("ぎょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyo");
        }})));

        put("ぐぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwa");
        }})));
        put("ぐぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwi");
        }})));
        put("ぐぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwu");
        }})));
        put("ぐぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwe");
        }})));
        put("ぐぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwo");
        }})));

        // さ行
        put("さ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sa");
        }})));
        put("し",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"si");
            put(System.SHORT,		"ci");
            put(System.LONG,		"shi");
        }})));
        put("す",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"su");
        }})));
        put("せ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"se");
            put(System.SHORT,		"ce");
        }})));
        put("そ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"so");
        }})));

        put("しゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sya");
            put(System.LONG,		"sha");
        }})));
        put("しぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syi");
        }})));
        put("しゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syu");
            put(System.LONG,		"shu");
        }})));
        put("しぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sye");
            put(System.LONG,		"she");
        }})));
        put("しょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syo");
            put(System.LONG,		"sho");
        }})));

        put("すぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swa");
        }})));
        put("すぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swi");
        }})));
        put("すぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swu");
        }})));
        put("すぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swe");
        }})));
        put("すぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swo");
        }})));

        put("ざ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"za");
        }})));
        put("じ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zi");
            put(System.SHORT,		"ji");
        }})));
        put("ず",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zu");
        }})));
        put("ぜ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ze");
        }})));
        put("ぞ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zo");
        }})));

        put("じゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zya");
            put(System.SHORT,		"ja");
            put(System.LONG,		"jya");
        }})));
        put("じぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyi");
            put(System.LONG,		"jyi");
        }})));
        put("じゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyu");
            put(System.SHORT,		"ju");
            put(System.LONG,		"jyu");
        }})));
        put("じぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zye");
            put(System.SHORT,		"je");
            put(System.LONG,		"zye");
        }})));
        put("じょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyo");
            put(System.SHORT,		"jo");
            put(System.LONG,		"jyo");
        }})));

        // た行
        put("た",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ta");
        }})));
        put("ち",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ti");
            put(System.LONG,		"chi");
        }})));
        put("つ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tu");
            put(System.LONG,		"tsu");
        }})));
        put("て",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"te");
        }})));
        put("と",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"to");
        }})));

        put("ちゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tya");
            put(System.LONG,		"cha");
            put(System.Y,			"cya");
        }})));
        put("ちぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyi");
            put(System.Y,			"cyi");
        }})));
        put("ちゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyu");
            put(System.LONG,		"chu");
            put(System.Y,			"cyu");
        }})));
        put("ちぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tye");
            put(System.LONG,		"che");
            put(System.Y,			"cye");
        }})));
        put("ちょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyo");
            put(System.LONG,		"cho");
            put(System.Y,			"cyo");
        }})));

        put("つぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tsa");
        }})));
        put("つぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tsi");
        }})));
        put("つぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tse");
        }})));
        put("つぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tso");
        }})));

        put("てゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tha");
        }})));
        put("てぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"thi");
        }})));
        put("てゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"thu");
        }})));
        put("てぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"the");
        }})));
        put("てょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tho");
        }})));

        put("とぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twa");
        }})));
        put("とぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twi");
        }})));
        put("とぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twu");
        }})));
        put("とぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twe");
        }})));
        put("とぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"two");
        }})));

        put("だ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"da");
        }})));
        put("ぢ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"di");
        }})));
        put("づ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"du");
        }})));
        put("で",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"de");
        }})));
        put("ど",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"do");
        }})));

        put("ぢゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dya");
        }})));
        put("ぢぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyi");
        }})));
        put("ぢゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyu");
        }})));
        put("ぢぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dye");
        }})));
        put("ぢょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyo");
        }})));

        put("でゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dha");
        }})));
        put("でぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhi");
        }})));
        put("でゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhu");
        }})));
        put("でぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhe");
        }})));
        put("でょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dho");
        }})));

        put("どぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwa");
        }})));
        put("どぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwi");
        }})));
        put("どぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwu");
        }})));
        put("どぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwe");
        }})));
        put("どぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwo");
        }})));

        put("っ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xtu");
            put(System.L,			"ltu");
            put(System.LONG,		"ltsu");
        }})));

        // な行
        put("な",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"na");
        }})));
        put("に",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ni");
        }})));
        put("ぬ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nu");
        }})));
        put("ね",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ne");
        }})));
        put("の",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"no");
        }})));

        put("にゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nya");
        }})));
        put("にぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyi");
        }})));
        put("にゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyu");
        }})));
        put("にぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nye");
        }})));
        put("にょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyo");
        }})));

        // は行
        put("は",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ha");
        }})));
        put("ひ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hi");
        }})));
        put("ふ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hu");
            put(System.SHORT,		"fu");
        }})));
        put("へ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"he");
        }})));
        put("ほ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ho");
        }})));

        put("ひゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hya");
        }})));
        put("ひぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyi");
        }})));
        put("ひゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyu");
        }})));
        put("ひぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hye");
        }})));
        put("ひょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyo");
        }})));

        put("ふぁ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwa");
            put(System.SHORT,		"fa");
        }})));
        put("ふぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwi");
            put(System.SHORT,		"fi");
            put(System.Y,			"fyi");
        }})));
        put("ふぅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwu");
        }})));
        put("ふぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwe");
            put(System.SHORT,		"fe");
            put(System.Y,			"fye");
        }})));
        put("ふぉ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwo");
            put(System.SHORT,		"fo");
        }})));

        put("ふゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fya");
        }})));
        put("ふゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fyu");
        }})));
        put("ふょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fyo");
        }})));

        put("ば",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ba");
        }})));
        put("び",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bi");
        }})));
        put("ぶ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bu");
        }})));
        put("べ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"be");
        }})));
        put("ぼ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bo");
        }})));

        put("びゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bya");
        }})));
        put("びぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byi");
        }})));
        put("びゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byu");
        }})));
        put("びぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bye");
        }})));
        put("びょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byo");
        }})));

        put("ぱ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pa");
        }})));
        put("ぴ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pi");
        }})));
        put("ぷ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pu");
        }})));
        put("ぺ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pe");
        }})));
        put("ぽ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"po");
        }})));

        put("ぴゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pya");
        }})));
        put("ぴぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyi");
        }})));
        put("ぴゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyu");
        }})));
        put("ぴぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pye");
        }})));
        put("ぴょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyo");
        }})));

        // ま行
        put("ま",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ma");
        }})));
        put("み",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mi");
        }})));
        put("む",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mu");
        }})));
        put("め",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"me");
        }})));
        put("も",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mo");
        }})));

        put("みゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mya");
        }})));
        put("みぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myi");
        }})));
        put("みゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myu");
        }})));
        put("みぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mye");
        }})));
        put("みょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myo");
        }})));

        // や行
        put("や",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ya");
        }})));
        put("ゆ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"yu");
        }})));
        put("よ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"yo");
        }})));

        put("ゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xya");
            put(System.L,			"lya");
        }})));
        put("ゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xyu");
            put(System.L,			"lyu");
        }})));
        put("ょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xyo");
            put(System.L,			"lyo");
        }})));

        // ら行
        put("ら",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ra");
        }})));
        put("り",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ri");
        }})));
        put("る",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ru");
        }})));
        put("れ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"re");
        }})));
        put("ろ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ro");
        }})));

        put("りゃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"rya");
        }})));
        put("りぃ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryi");
        }})));
        put("りゅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryu");
        }})));
        put("りぇ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"rye");
        }})));
        put("りょ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryo");
        }})));

        // わ行
        put("わ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wa");
        }})));
        put("を",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wo");
        }})));
        put("ん",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"n");
            put(System.LONG,		"nn");
            put(System.SHORT,		"n'");
            //put(System.X,			"xn");
        }})));

        put("ゎ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xwa");
            put(System.L,			"lwa");
        }})));

        // 全角カタカナ

        // ア行
        put("ア",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"a");
        }})));
        put("イ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"i");
            //put(System.Y,			"yi");
        }})));
        put("ウ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"u");
            //put(System.SHORT,		"wi");
            //put(System.LONG,		"whi");
        }})));
        put("エ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"e");
        }})));
        put("オ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"o");
        }})));

        put("ウァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wha");
        }})));
        put("ウィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"whi");
            put(System.SHORT,		"wi");
        }})));
        put("ウェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"whe");
            put(System.SHORT,		"we");
        }})));
        put("ウォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"who");
            put(System.SHORT,		"we");
        }})));

        put("ヰ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wi");
        }})));
        put("ヱ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"we");
        }})));

        put("ァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xa");
            put(System.L,			"la");
        }})));
        put("ィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xi");
            put(System.L,			"li");
            put(System.XY,			"xyi");
            put(System.LY,			"lyi");
        }})));
        put("ゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xu");
            put(System.L,			"lu");
        }})));
        put("ェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xe");
            put(System.L,			"le");
            put(System.XY,			"xye");
            put(System.LY,			"lye");
        }})));
        put("ォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xo");
            put(System.L,			"lo");
        }})));

        put("イェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ye");
        }})));

        // カ行
        put("カ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ka");
            put(System.SHORT,		"ca");
        }})));
        put("キ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ki");
        }})));
        put("ク",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ku");
            put(System.SHORT,		"cu");
            //put(System.SHORT,		"qu");
        }})));
        put("ケ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ke");
        }})));
        put("コ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ko");
        }})));

        put("キャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kya");
        }})));
        put("キィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyi");
        }})));
        put("キュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyu");
        }})));
        put("キェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kye");
        }})));
        put("キョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"kyo");
        }})));

        put("クャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qya");
        }})));
        put("クュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qyu");
        }})));
        put("クョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"quo");
        }})));

        put("クァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwa");
            put(System.SHORT,		"qa");
            //put(System.LONG,		"kwa");
        }})));
        put("クィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwi");
            put(System.SHORT,		"qi");
            put(System.Y,			"qyi");
        }})));
        put("クゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwu");
        }})));
        put("クェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwe");
            put(System.SHORT,		"qe");
            put(System.Y,			"qye");
        }})));
        put("クォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"qwo");
            put(System.SHORT,		"qo");
        }})));

        put("ガ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ga");
        }})));
        put("ギ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gi");
        }})));
        put("グ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gu");
        }})));
        put("ゲ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ge");
        }})));
        put("ゴ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"go");
        }})));

        put("ギャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gya");
        }})));
        put("ギィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyi");
        }})));
        put("ギュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyu");
        }})));
        put("ギェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gye");
        }})));
        put("ギョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gyo");
        }})));

        put("グァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwa");
        }})));
        put("グィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwi");
        }})));
        put("グゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwu");
        }})));
        put("グェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwe");
        }})));
        put("グォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"gwo");
        }})));

        put("ヵ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xka");
            put(System.L,			"lka");
        }})));
        put("ヶ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xke");
            put(System.L,			"lke");
        }})));

        // サ行
        put("サ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sa");
        }})));
        put("シ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"si");
            put(System.SHORT,		"ci");
            put(System.LONG,		"shi");
        }})));
        put("ス",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"su");
        }})));
        put("セ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"se");
            put(System.SHORT,		"ce");
        }})));
        put("ソ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"so");
        }})));

        put("シャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sya");
            put(System.LONG,		"sha");
        }})));
        put("シィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syi");
        }})));
        put("シュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syu");
            put(System.LONG,		"shu");
        }})));
        put("シェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"sye");
            put(System.LONG,		"she");
        }})));
        put("ショ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"syo");
            put(System.LONG,		"sho");
        }})));

        put("スァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swa");
        }})));
        put("スィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swi");
        }})));
        put("スゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swu");
        }})));
        put("スェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swe");
        }})));
        put("スォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"swo");
        }})));

        put("ザ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"za");
        }})));
        put("ジ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zi");
            put(System.SHORT,		"ji");
        }})));
        put("ズ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zu");
        }})));
        put("ゼ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ze");
        }})));
        put("ゾ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zo");
        }})));

        put("ジャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zya");
            put(System.SHORT,		"ja");
            put(System.LONG,		"jya");
        }})));
        put("ジィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyi");
            put(System.LONG,		"jyi");
        }})));
        put("ジュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyu");
            put(System.SHORT,		"ju");
            put(System.LONG,		"jyu");
        }})));
        put("ジェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zye");
            put(System.SHORT,		"je");
            put(System.LONG,		"zye");
        }})));
        put("ジョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"zyo");
            put(System.SHORT,		"jo");
            put(System.LONG,		"jyo");
        }})));

        // タ行
        put("タ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ta");
        }})));
        put("チ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ti");
            put(System.LONG,		"chi");
        }})));
        put("ツ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tu");
            put(System.LONG,		"tsu");
        }})));
        put("テ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"te");
        }})));
        put("ト",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"to");
        }})));

        put("チャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tya");
            put(System.LONG,		"cha");
            put(System.Y,			"cya");
        }})));
        put("チィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyi");
            put(System.Y,			"cyi");
        }})));
        put("チュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyu");
            put(System.LONG,		"chu");
            put(System.Y,			"cyu");
        }})));
        put("チェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tye");
            put(System.LONG,		"che");
            put(System.Y,			"cye");
        }})));
        put("チョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tyo");
            put(System.LONG,		"cho");
            put(System.Y,			"cyo");
        }})));

        put("ツァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tsa");
        }})));
        put("ツィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tsi");
        }})));
        put("ツェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tse");
        }})));
        put("ツォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tso");
        }})));

        put("テャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tha");
        }})));
        put("ティ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"thi");
        }})));
        put("テュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"thu");
        }})));
        put("テェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"the");
        }})));
        put("テョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"tho");
        }})));

        put("トァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twa");
        }})));
        put("トィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twi");
        }})));
        put("トゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twu");
        }})));
        put("トェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"twe");
        }})));
        put("トォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"two");
        }})));

        put("ダ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"da");
        }})));
        put("ヂ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"di");
        }})));
        put("ヅ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"du");
        }})));
        put("デ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"de");
        }})));
        put("ド",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"do");
        }})));

        put("ヂャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dya");
        }})));
        put("ヂィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyi");
        }})));
        put("ヂュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyu");
        }})));
        put("ヂェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dye");
        }})));
        put("ヂョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dyo");
        }})));

        put("デャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dha");
        }})));
        put("ディ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhi");
        }})));
        put("デュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhu");
        }})));
        put("デェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dhe");
        }})));
        put("デョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dho");
        }})));

        put("ドァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwa");
        }})));
        put("ドィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwi");
        }})));
        put("ドゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwu");
        }})));
        put("ドェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwe");
        }})));
        put("ドォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"dwo");
        }})));

        put("ッ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xtu");
            put(System.L,			"ltu");
            put(System.LONG,		"ltsu");
        }})));

        // ナ行
        put("ナ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"na");
        }})));
        put("ニ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ni");
        }})));
        put("ヌ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nu");
        }})));
        put("ネ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ne");
        }})));
        put("ノ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"no");
        }})));

        put("ニャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nya");
        }})));
        put("ニィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyi");
        }})));
        put("ニュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyu");
        }})));
        put("ニェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nye");
        }})));
        put("ニョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"nyo");
        }})));

        // ハ行
        put("ハ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ha");
        }})));
        put("ヒ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hi");
        }})));
        put("フ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hu");
            put(System.SHORT,		"fu");
        }})));
        put("ヘ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"he");
        }})));
        put("ホ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ho");
        }})));

        put("ヒャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hya");
        }})));
        put("ヒィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyi");
        }})));
        put("ヒュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyu");
        }})));
        put("ヒェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hye");
        }})));
        put("ヒョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"hyo");
        }})));

        put("ファ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwa");
            put(System.SHORT,		"fa");
        }})));
        put("フィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwi");
            put(System.SHORT,		"fi");
            put(System.Y,			"fyi");
        }})));
        put("フゥ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwu");
        }})));
        put("フェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwe");
            put(System.SHORT,		"fe");
            put(System.Y,			"fye");
        }})));
        put("フォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fwo");
            put(System.SHORT,		"fo");
        }})));

        put("フャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fya");
        }})));
        put("フュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fyu");
        }})));
        put("フョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"fyo");
        }})));

        put("バ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ba");
        }})));
        put("ビ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bi");
        }})));
        put("ブ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bu");
        }})));
        put("ベ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"be");
        }})));
        put("ボ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bo");
        }})));

        put("ビャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bya");
        }})));
        put("ビィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byi");
        }})));
        put("ビュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byu");
        }})));
        put("ビェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"bye");
        }})));
        put("ビョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"byo");
        }})));

        put("パ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pa");
        }})));
        put("ピ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pi");
        }})));
        put("プ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pu");
        }})));
        put("ペ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pe");
        }})));
        put("ポ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"po");
        }})));

        put("ピャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pya");
        }})));
        put("ピィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyi");
        }})));
        put("ピュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyu");
        }})));
        put("ピェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pye");
        }})));
        put("ピョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"pyo");
        }})));

        put("ヴァ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"va");
        }})));
        put("ヴィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vi");
            put(System.LONG,		"vyi");
        }})));
        put("ヴ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vu");
        }})));
        put("ヴェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ve");
            put(System.LONG,		"vye");
        }})));
        put("ヴォ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vo");
        }})));

        put("ヴャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vya");
        }})));
        put("ヴュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vyu");
        }})));
        put("ヴョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"vyo");
        }})));

        // マ行
        put("マ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ma");
        }})));
        put("ミ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mi");
        }})));
        put("ム",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mu");
        }})));
        put("メ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"me");
        }})));
        put("モ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mo");
        }})));

        put("ミャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mya");
        }})));
        put("ミィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myi");
        }})));
        put("ミュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myu");
        }})));
        put("ミェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"mye");
        }})));
        put("ミョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"myo");
        }})));

        // ヤ行
        put("ヤ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ya");
        }})));
        put("ユ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"yu");
        }})));
        put("ヨ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"yo");
        }})));

        put("ャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xya");
            put(System.L,			"lya");
        }})));
        put("ュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xyu");
            put(System.L,			"lyu");
        }})));
        put("ョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xyo");
            put(System.L,			"lyo");
        }})));

        // ラ行
        put("ラ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ra");
        }})));
        put("リ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ri");
        }})));
        put("ル",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ru");
        }})));
        put("レ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"re");
        }})));
        put("ロ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ro");
        }})));

        put("リャ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"rya");
        }})));
        put("リィ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryi");
        }})));
        put("リュ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryu");
        }})));
        put("リェ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"rye");
        }})));
        put("リョ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"ryo");
        }})));

        // ワ行
        put("ワ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wa");
        }})));
        put("ヲ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"wo");
        }})));
        put("ン",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"n");
            put(System.LONG,		"nn");
            put(System.SHORT,		"n'");
            //put(System.X,			"xn");
        }})));

        put("ヮ",	Romaji.valueOf(Collections.unmodifiableMap(new HashMap<System, String>() {{
            put(System.STANDARD,	"xwa");
            put(System.L,			"lwa");
        }})));

    }});

    static Romaji get(final String key) {
        return MAP.get(key);
    }

}
