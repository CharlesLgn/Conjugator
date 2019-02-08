package com.iut.verbe.back.lambdastructure.groupe.troisieme;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class TroisiemeIndre extends Conjugaison {
  public TroisiemeIndre() {
  }

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("ins", "ins", "int",
            "ignons", "ignez", "ignent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("ignis", "ignis", "ignit",
            "ignîmes", "ignîtes", "ignirent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("indrai", "indras", "indra",
            "indrons", "indrez", "indront");
  }
}
