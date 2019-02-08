package com.iut.verbe.back.lambdastructure.groupe.troisieme.auxiliaire;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class Avoir extends Conjugaison {
  public Avoir() {
  }


  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("ai", "as", "a",
            "avons", "avez", "ont");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("eus", "eus", "eut",
            "eûmes", "eûtes", "eurent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("aurai", "auras", "aura",
            "aurons", "aurez", "auront");
  }
}
