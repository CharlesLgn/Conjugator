package com.iut.verbe.back.COR.exper;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.typeVerbe.PremierGroupe;

public class ExperCOR1 extends ExpertCOR {
  public ExperCOR1(ExpertCOR expertSuivant) {
    super(expertSuivant);
  }

  @Override
  public Verbe resoudre1(String verbe) {
    try {
      return new PremierGroupe(verbe);
    } catch (Exception e) {
      return null;
    }
  }
}
