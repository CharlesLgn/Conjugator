package com.iut.verbe.back.COR.exper;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.typeVerbe.TroisiemeGroupeAitre;

public class ExperCORaitre extends ExpertCOR {
  public ExperCORaitre(ExpertCOR expertSuivant) {
    super(expertSuivant);
  }

  @Override
  public Verbe resoudre1(String verbe) {
    try {
      return new TroisiemeGroupeAitre(verbe);
    } catch (Exception e) {
      return null;
    }
  }
}
