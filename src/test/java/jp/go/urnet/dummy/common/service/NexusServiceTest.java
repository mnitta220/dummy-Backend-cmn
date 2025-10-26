package jp.go.urnet.dummy.common.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = NexusService.class)
public class NexusServiceTest {

    @Autowired
    private NexusService nexusService;

    @Test
    public void testGetNexusEnv() {
        String nexusEnv = nexusService.getNexusEnv();
        assertEquals("crm", nexusEnv);
    }

    @Test
    public void testIsCrm() {
        boolean isCrm = nexusService.isCrm();
        assertEquals(true, isCrm);
    }

    @Test
    public void testIsMyp() {
        boolean isMyp = nexusService.isMyp();
        assertEquals(false, isMyp);
    }
}
