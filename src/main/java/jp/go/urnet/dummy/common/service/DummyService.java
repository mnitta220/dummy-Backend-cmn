package jp.go.urnet.dummy.common.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ダミーサービスクラス
 * application.propertiesの設定値を提供する
 */
@Component
public class DummyService {

    @Value("${target.env}")
    private String targetEnv;

    /**
     * application.propertiesのtarget.envの値を取得する
     * 
     * @return application.propertiesのtarget.envの値
     */
    public String getTargetEnv() {
        return targetEnv;
    }
}
