package com.iut.verbe.back.lambdastructure.groupe.troisieme;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class TroisiemeAitre extends Conjugaison {
  public TroisiemeAitre() {
  }

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("ais", "ais", "aît",
            "aissons", "aissez", "aissent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("aquis", "aquis", "aquit",
            "aquîmes", "aquîtes", "aquirent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("aîtrai", "aîtras", "aîtra",
            "aîtrons", "aîtrez", "aîtront");
  }
}
