package com.birdapp.bp.repository_app.domain.constant;

/**
 * JAPANESE PREFECTURES LIST.
 *
 * Copyright (c) 2016 javasampleokiba
 *
 * This source code is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
public enum JapanesePrefecture {

	/** HOKKAIDO. */
	HOKKAIDO    ("01", "北海道"),

	/** AOMORI. */
	AOMORI      ("02", "青森"),

	/** IWATE. */
	IWATE       ("03", "岩手"),

	/** MIYAGI. */
	MIYAGI      ("04", "宮城"),

	/** AKITA. */
	AKITA       ("05", "秋田"),

	/** YAMAGATA. */
	YAMAGATA    ("06", "山形"),

	/** FUKUSHIMA. */
	FUKUSHIMA   ("07", "福島"),

	/** IBARAKI. */
	IBARAKI     ("08", "茨城"),

	/** TOCHIGI. */
	TOCHIGI     ("09", "栃木"),

	/** GUNMA. */
	GUNMA       ("10", "群馬"),

	/** SAITAMA. */
	SAITAMA     ("11", "埼玉"),

	/** CHIBA. */
	CHIBA       ("12", "千葉"),

	/** TOKYO. */
	TOKYO       ("13", "東京"),

	/** KANAGAWA. */
	KANAGAWA    ("14", "神奈川"),

	/** NIIGATA. */
	NIIGATA     ("15", "新潟"),

	/** TOYAMA. */
	TOYAMA      ("16", "富山"),

	/** ISHIKAWA. */
	ISHIKAWA    ("17", "石川"),

	/** FUKUI. */
	FUKUI       ("18", "福井"),

	/** YAMANASHI. */
	YAMANASHI   ("19", "山梨"),

	/** NAGANO. */
	NAGANO      ("20", "長野"),

	/** GIFU. */
	GIFU        ("21", "岐阜"),

	/** SHIZUOKA. */
	SHIZUOKA    ("22", "静岡"),

	/** AICHI. */
	AICHI       ("23", "愛知"),

	/** MIE. */
	MIE         ("24", "三重"),

	/** SHIGA. */
	SHIGA       ("25", "滋賀"),

	/** KYOTO. */
	KYOTO       ("26", "京都"),

	/** OSAKA. */
	OSAKA       ("27", "大阪"),

	/** HYOGO. */
	HYOGO       ("28", "兵庫"),

	/** NARA. */
	NARA        ("29", "奈良"),

	/** WAKAYAMA. */
	WAKAYAMA    ("30", "和歌山"),

	/** TOTTORI. */
	TOTTORI     ("31", "鳥取"),

	/** SHIMANE. */
	SHIMANE     ("32", "島根"),

	/** OKAYAMA. */
	OKAYAMA     ("33", "岡山"),

	/** HIROSHIMA. */
	HIROSHIMA   ("34", "広島"),

	/** YAMAGUCHI. */
	YAMAGUCHI   ("35", "山口"),

	/** TOKUSHIMA. */
	TOKUSHIMA   ("36", "徳島"),

	/** KAGAWA. */
	KAGAWA      ("37", "香川"),

	/** EHIME. */
	EHIME       ("38", "愛媛"),

	/** KOCHI. */
	KOCHI       ("39", "高知"),

	/** FUKUOKA. */
	FUKUOKA     ("40", "福岡"),

	/** SAGA. */
	SAGA        ("41", "佐賀"),

	/** NAGASAKI. */
	NAGASAKI    ("42", "長崎"),

	/** KUMAMOTO. */
	KUMAMOTO    ("43", "熊本"),

	/** OITA. */
	OITA        ("44", "大分"),

	/** MIYAZAKI. */
	MIYAZAKI    ("45", "宮崎"),

	/** KAGOSHIMA. */
	KAGOSHIMA   ("46", "鹿児島"),

	/** OKINAWA. */
	OKINAWA     ("47", "沖縄");

	private final String code;
	private final String name;

	private JapanesePrefecture(String prefectureCode, String prefectureName) {
		code = prefectureCode;
		name = prefectureName;
	}

	/**
	 * GET JAPANESE PREFECTURE CODE.
	 *
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * GET JAPANESE PREFECTURE NAME.
	 * excluding "都","府","県"
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * GET JAPANESE PREFECTURE NAME.
	 * including "都","府","県"
	 *
	 * @return name
	 */
	public String getFullName() {
		switch (this) {
			case HOKKAIDO:
				return getName();
			case TOKYO:
				return getName() + "都";
			case KYOTO:
			case OSAKA:
				return getName() + "府";
			default:
				return getName() + "県";
		}
	}

	/**
	 * GET JAPANESE PREFECTURE OBJECT.
	 *
	 * @param code
	 * @return JapanesePrefecture
	 */
	public static JapanesePrefecture getByCode(String code) {
		for (JapanesePrefecture p : JapanesePrefecture.values()) {
			if (p.getCode().equals(code)) return p;
		}
		return null;
	}

	/**
	 * GET JAPANESE PREFECTURE OBJECT.
	 * excluding "都","府","県"
	 *
	 * @param name
	 * @return JapanesePrefecture
	 */
	public static JapanesePrefecture getByName(String name) {
		for (JapanesePrefecture p : JapanesePrefecture.values()) {
			if (p.getName().equals(name)) return p;
		}
		return null;
	}

	/**
	 * GET JAPANESE PREFECTURE OBJECT.
	 * including "都","府","県"
	 *
	 * @param fullName
	 * @return JapanesePrefecture
	 */
	public static JapanesePrefecture getByFullName(String fullName) {
		for (JapanesePrefecture p : JapanesePrefecture.values()) {
			if (p.getFullName().equals(fullName)) return p;
		}
		return null;
	}
}