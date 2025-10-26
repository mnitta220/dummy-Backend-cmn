package jp.go.urnet.dummy.common.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ダミーサービスクラス
 * application.propertiesの設定値を提供する
 */
@Component
public class NexusService {
    public static final String NEXUS_ENV_CRM = "crm";
    public static final String NEXUS_ENV_MYP = "myp";

    @Value("${nexus.env}")
    private String nexusEnv;

    /**
     * application.nexus.envの値を取得する
     * 
     * @return application.nexus.envの値
     */
    public String getNexusEnv() {
        return nexusEnv;
    }

    /**
     * CRM環境かどうか
     * 
     * @return CRM環境かどうか
     */
    public boolean isCrm() {
        return NEXUS_ENV_CRM.equals(nexusEnv);
    }

    /**
     * MYP環境かどうか
     * 
     * @return MYP環境かどうか
     */
    public boolean isMyp() {
        return NEXUS_ENV_MYP.equals(nexusEnv);
    }
}
