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

import java.util.ArrayList;

/**
 *
 * @author mdger
 */
public abstract class Imbissbude {
    ArrayList<Bestellbar> bestellListe = new ArrayList<>();
    
    /**
     * 
     */
    public void bestellePommes() {
        bestellListe.add(erzeugePommes());
    }
    
    
    /**
     * 
     */
    public void bestelleHamburger() {
        bestellListe.add(erzeugeHamburger());
    }
    
    /**
     * 
     * @return 
     */
    protected abstract Pommes erzeugePommes();
    
    /**
     * 
     * @return 
     */
    protected abstract Hamburger erzeugeHamburger();
    
    /**
     * 
     */
    public void erstelleRechnung() {
        float preis = 0.0f;
        for (Bestellbar produkt : bestellListe) {
            preis += produkt.getPreis();
        }
        
        System.out.println("Der Gesamtpreis ihrer Bestellung ist" + preis);
    }
    
    
    protected void addProdukt(Bestellbar produkt) {
        bestellListe.add(produkt);
    }
}
