package com.spring.henallux.JavaWebLaboSpring.model;

import java.util.Objects;

public class testClassGit {
    private String texte;
    private int numberPair;
    private String pass;
    private int somme;


    public testClassGit(String texte, int numberPair, String pass, int somme) {
        texte = texte;
        numberPair = numberPair;
        pass = pass;
        somme = somme;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getNumberPair() {
        return numberPair;
    }

    public void setNumberPair(int numberPair) {
        this.numberPair = numberPair;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }

    @Override
    public String toString() {
        return "testClassGit{" +
                "texte='" + texte + '\'' +
                ", numberPair=" + numberPair +
                ", pass='" + pass + '\'' +
                ", somme=" + somme +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof testClassGit)) return false;
        testClassGit that = (testClassGit) o;
        return getNumberPair() == that.getNumberPair() &&
                getSomme() == that.getSomme() &&
                Objects.equals(getTexte(), that.getTexte()) &&
                Objects.equals(getPass(), that.getPass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTexte(), getNumberPair(), getPass(), getSomme());
    }
}
