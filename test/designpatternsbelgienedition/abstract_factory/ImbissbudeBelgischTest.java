/*
 * Copyright 2019 mdger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package designpatternsbelgienedition.abstract_factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mdger
 */
public class ImbissbudeBelgischTest {
    
    public ImbissbudeBelgischTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of erzeugePommes method, of class ImbissbudeBelgisch.
     */
    @Test
    public void testErzeugePommes() {
        System.out.println("erzeugePommes");
        ImbissbudeBelgisch instance = new ImbissbudeBelgisch();
        Pommes result = instance.erzeugePommes();
        assertEquals(new BelgischePommes(), result);
    }

    /**
     * Test of erzeugeHamburger method, of class ImbissbudeBelgisch.
     */
    @Test
    public void testErzeugeHamburger() {
        System.out.println("erzeugeHamburger");
        ImbissbudeBelgisch instance = new ImbissbudeBelgisch();
        Hamburger expResult = null;
        Hamburger result = instance.erzeugeHamburger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
