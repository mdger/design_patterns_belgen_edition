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
package designpatternsbelgienedition.adapter;

/**
 *
 * @author mdger
 */
public class HaartrocknerAdapter implements IFrittierGeraet {
    private Haartrockner haartrockner;
    
    /**
     * 
     * Im Konstruktor ein Haartrockner-Objekt übergeben
     * @param haartrockner 
     */
    public HaartrocknerAdapter(Haartrockner haartrockner) {
        this.haartrockner = haartrockner;
    }
    
    /**
     * 
     * Mit einem Haartrockner kann man nichts frittieren, das würde zu lange dauern.
     * Aber wenn man lange genug föhnt, klappt es doch.
     * 
     */
    @Override
    public void ausbacken() {
        haartrockner.foehnen();
        haartrockner.foehnen();
        haartrockner.foehnen();
        haartrockner.foehnen();
        haartrockner.foehnen();
        System.out.println("Pommes sind fertig ausgebacken");
    }
}
