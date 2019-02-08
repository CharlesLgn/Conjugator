package com.iut.verbe.back.lambdastructure.groupe.troisieme.auxiliaire;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class Etre extends Conjugaison {
  public Etre() {
  }


  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("suis", "es", "est",
            "sommes", "êtes", "sont");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("fus", "fus", "fut",
            "fûmes", "fûtes", "furent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("serais", "seras", "sera",
            "serons", "serez", "seront");
  }
}
