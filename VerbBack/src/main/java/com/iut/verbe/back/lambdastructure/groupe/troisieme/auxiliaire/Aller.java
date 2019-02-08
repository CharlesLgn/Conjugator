package com.iut.verbe.back.lambdastructure.groupe.troisieme.auxiliaire;

import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;

import java.util.HashMap;

public class Aller extends Conjugaison {
  public Aller() {
  }


  @Override
  protected HashMap<String, String> getPresent() {
    return ConjugaisonUtils.patern("vais", "vas", "va",
            "allons", "allez", "vont");
  }

  @Override
  protected HashMap<String, String> getPasseSimple() {
    return ConjugaisonUtils.patern("allai", "allas", "alla",
            "allâmes", "allâtes", "allèrent");
  }

  @Override
  protected HashMap<String, String> getFutur() {
    return ConjugaisonUtils.patern("irai", "iras", "ira",
            "irons", "irez", "iront");
  }
}
