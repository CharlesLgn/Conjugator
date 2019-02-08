package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.troisieme.TroisiemeEttre;
import com.iut.verbe.back.verbe.Verbe;

public class TroisiemeGroupeEttre extends Verbe {

  public TroisiemeGroupeEttre(String verbe) throws VerbeException {
    super(verbe, new TroisiemeEttre(), "ettre", "is");
  }
}
