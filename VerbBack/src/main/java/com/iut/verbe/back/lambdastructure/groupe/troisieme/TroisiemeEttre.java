package com.iut.verbe.back.lambdastructure.groupe.troisieme;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class TroisiemeEttre extends Conjugaison {
  public TroisiemeEttre() {
  }

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("ets", "ets", "et",
            "ettons", "ettez", "ettent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("is", "is", "it",
            "îmes", "îtes", "irent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("ettrai", "ettras", "ettra",
            "ettrons", "ettrez", "ettront");
  }
}
