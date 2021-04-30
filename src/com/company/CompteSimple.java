package com.company;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple(float decouvert){
        super();
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) {
        if (decouvert + solde >= montant){
            solde -= montant;
        }
        else {
            System.out.println("Retrait impossible" +
                    "Vous pouvez retirer jusqu'à : " +
                    (decouvert+solde));
        }
    }

    @Override
    public void verser(float montant) {
        solde += montant;
    }
}
