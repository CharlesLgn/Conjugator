package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.troisieme.TroisiemeOudre;
import com.iut.verbe.back.verbe.Verbe;

public class TroisiemeGroupeOudre extends Verbe {

  public TroisiemeGroupeOudre(String verbe) throws VerbeException {
    super(verbe, new TroisiemeOudre(), "oudre", "out");
  }
}
