package com.company;

public abstract class Compte {

    private int code;
    protected  float solde;
    static int nbComptes;

    public Compte(){
        nbComptes++;
        code = nbComptes;
    }

    public abstract void retirer(float montant);
    public abstract void verser(float montant);

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
