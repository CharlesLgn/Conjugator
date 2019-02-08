package com.iut.verbe.back.lambdastructure.groupe;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class Premier extends Conjugaison {
  public Premier() {}

  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("e", "es", "e",
                 "ons","ez", "ent");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("ai","as", "a",
                "âmes","âtes", "èrent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("erai","eras", "era",
            "erons","erez", "eront");
  }
}
