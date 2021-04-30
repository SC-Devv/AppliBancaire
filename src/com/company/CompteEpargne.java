package com.company;

public class CompteEpargne extends Compte{

    private float taux;

    public CompteEpargne(float taux){
        super();
        this.taux = taux;
    }

    @Override
    public void retirer(float montant) {
        solde -= montant;
    }

    @Override
    public void verser(float montant) {
        solde += montant;
    }

    public void calculInterets(){
        if (taux <= 1) solde += taux * solde;
        else solde += taux * solde / 100;


    }

}
