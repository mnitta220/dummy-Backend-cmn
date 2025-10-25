package jp.go.urnet.dummy.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日時ユーティリティクラス
 * システム日時の取得機能を提供する
 */
public class DateUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 現在の日時を文字列として取得する
     * 
     * @return 現在の日時（yyyy-MM-dd HH:mm:ss形式）
     */
    public static String getSystemDate() {
        return LocalDateTime.now().format(FORMATTER);
    }
}
