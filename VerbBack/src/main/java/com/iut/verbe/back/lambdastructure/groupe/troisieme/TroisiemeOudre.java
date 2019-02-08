package com.iut.verbe.back.lambdastructure.groupe.troisieme;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class TroisiemeOudre extends Conjugaison {
  public TroisiemeOudre() {
  }

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("ouds", "ouds", "oud",
            "oulons", "oulez", "oulent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("oulus", "oulus", "oulut",
            "oulûmes", "oulûtes", "oulurent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("oudrai", "oudras", "oudra",
            "oudrons", "oudrez", "oudront");
  }
}
