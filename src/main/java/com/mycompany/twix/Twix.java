/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dasha-RV515
 */
public abstract class Twix {//является супер классом для конкретных видов Twix

    protected String name;//каждый обьект содержит имя ,вид шоколада,карамели , печенья
    protected String chocol;
    protected String caramel;
    protected String cake;
    protected int time;
    protected List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public String getCaramel() {
        return caramel;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Bake cookies...");
        System.out.println("Caramel poured on biscuits ..." + caramel);
        System.out.println("Cover chocolate ...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));//выполняем приготовления в определенном порядке
        }
    }

    public void bake() {
        System.out.println("Bake  cookies for 30  minutes at 300");
    }

    public void poured() {
        System.out.println("Pour on cookie caramel ");
    }

    public void cover() {
        System.out.println("Cover   on cookie chocolate");
    }

    public void box() {
        System.out.println("Place twix in official TwixStore box");
    }

    @Override
    public String toString() {
        String str = new String();
        str = "Product: " + name + "\n"+"Chocolate: "+chocol+"\n"+"Caramel: "+caramel+"\n"+"Cake: "+cake+"\n";
        return str;
    }
  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.chocol != null ? this.chocol.hashCode() : 0);
        hash = 37 * hash + (this.caramel != null ? this.caramel.hashCode() : 0);
        hash = 37 * hash + (this.cake != null ? this.cake.hashCode() : 0);
        hash = 37 * hash + this.time;
        hash = 37 * hash + (this.toppings != null ? this.toppings.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Twix other = (Twix) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.chocol == null) ? (other.chocol != null) : !this.chocol.equals(other.chocol)) {
            return false;
        }
        if ((this.caramel == null) ? (other.caramel != null) : !this.caramel.equals(other.caramel)) {
            return false;
        }
        if ((this.cake == null) ? (other.cake != null) : !this.cake.equals(other.cake)) {
            return false;
        }
        if (this.time != other.time) {
            return false;
        }
        if (this.toppings != other.toppings && (this.toppings == null || !this.toppings.equals(other.toppings))) {
            return false;
        }
        return true;
    }
}
