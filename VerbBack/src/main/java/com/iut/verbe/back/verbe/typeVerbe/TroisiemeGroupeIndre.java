package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.troisieme.TroisiemeIndre;
import com.iut.verbe.back.verbe.Verbe;

public class TroisiemeGroupeIndre extends Verbe {

  public TroisiemeGroupeIndre(String verbe) throws VerbeException {
    super(verbe, new TroisiemeIndre(), "indre", "int");
  }
}
