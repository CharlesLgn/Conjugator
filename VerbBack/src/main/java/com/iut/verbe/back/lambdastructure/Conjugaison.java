package com.iut.verbe.back.lambdastructure;

import java.util.HashMap;

public abstract class Conjugaison {
  protected abstract HashMap<String,String> getPresent();
  protected abstract HashMap<String,String> getPasseSimple();
  protected abstract HashMap<String,String> getFutur();

  public LambdaConjugue conjugPresent     = personne -> getPresent().get(personne);
  public LambdaConjugue conjugPasseSimple = personne -> getPasseSimple().get(personne);
  public LambdaConjugue conjugFutur       = personne -> getFutur().get(personne);
}
