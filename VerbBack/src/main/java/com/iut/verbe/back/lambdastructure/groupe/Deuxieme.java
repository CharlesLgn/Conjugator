package com.iut.verbe.back.lambdastructure.groupe;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class Deuxieme extends Conjugaison {
  public Deuxieme() {}

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("is", "is", "it",
            "issons","issez", "issent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("is","is", "it",
            "îmes","îtes", "irent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("irai","iras", "ira",
            "irons","irez", "iront");
  }
}
