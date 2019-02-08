package com.iut.verbe.back.COR.exper;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.typeVerbe.TroisiemeGroupeIndre;

public class ExperCORoindre extends ExpertCOR {
  public ExperCORoindre(ExpertCOR expertSuivant) {
    super(expertSuivant);
  }

  @Override
  public Verbe resoudre1(String verbe) {
    try {
      return new TroisiemeGroupeIndre(verbe);
    } catch (Exception e) {
      return null;
    }
  }
}
