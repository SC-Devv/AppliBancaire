package com.company;

public class ComptePayant extends Compte{

    public ComptePayant(){
        super();
    }

    @Override
    public void retirer(float montant) {
        float coutOperation = 0.05F * montant;
        solde = solde - montant - coutOperation;
    }

    @Override
    public void verser(float montant) {
        float coutOperation = 0.05F * montant;
        solde = solde + montant - coutOperation;
    }

}
