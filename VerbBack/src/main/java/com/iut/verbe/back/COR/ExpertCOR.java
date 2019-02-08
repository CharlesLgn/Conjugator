package com.iut.verbe.back.COR;

import com.iut.verbe.back.verbe.Verbe;

public abstract class ExpertCOR implements Expert {
  private ExpertCOR suivant;

  public ExpertCOR(ExpertCOR expertSuivant) {
    this.suivant = expertSuivant;
  }

  @Override
  public Verbe resoudre(String verbe) {
    Verbe res = this.resoudre1(verbe);
    if (res != null) {
      return res;
    } else if (this.suivant == null) {
      return null;
    } else return this.suivant.resoudre(verbe);
  }

  public abstract Verbe resoudre1(String verbe);
}
