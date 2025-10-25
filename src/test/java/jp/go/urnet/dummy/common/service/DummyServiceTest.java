package jp.go.urnet.dummy.common.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DummyService.class)
public class DummyServiceTest {

    @Autowired
    private DummyService dummyService;

    
    @Test
    public void testGetTargetEnv() {
        String targetEnv = dummyService.getTargetEnv();
        assertEquals("testenv", targetEnv);
    }
}
