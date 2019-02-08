package com.iut.verbe.back.COR.exper;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.typeVerbe.TroisiemeGroupeOudre;

public class ExpertCORoudre extends ExpertCOR {
  public ExpertCORoudre(ExpertCOR expertSuivant) {
    super(expertSuivant);
  }

  @Override
  public Verbe resoudre1(String verbe) {
    try {
      return new TroisiemeGroupeOudre(verbe);
    } catch (Exception e) {
      return null;
    }
  }
}
