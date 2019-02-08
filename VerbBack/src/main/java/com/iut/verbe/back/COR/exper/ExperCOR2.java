package com.iut.verbe.back.COR.exper;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.typeVerbe.DeuxiemeGroupe;

public class ExperCOR2 extends ExpertCOR {
  public ExperCOR2(ExpertCOR expertSuivant) {
    super(expertSuivant);
  }

  @Override
  public Verbe resoudre1(String verbe) {
    try {
      return new DeuxiemeGroupe(verbe);
    } catch (Exception e) {
      return null;
    }
  }
}
