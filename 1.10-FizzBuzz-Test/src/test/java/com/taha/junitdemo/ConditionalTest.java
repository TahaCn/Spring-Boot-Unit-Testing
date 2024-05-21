package com.taha.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run untill JIRA #123 is resolved")
    void basicTest(){

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){

    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void testForWindowsAndMacOnly(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void testForOnlyForJava19(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_21)
    void testOnlyForJavaRange(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void testOnlyForJavaRangeMin(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Taha",matches = "DEV")
    void testOnlyForDevEnvironment(){

    }

    @Test
    @EnabledIfSystemProperty(named = "TahaCode",matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){

    }


}
