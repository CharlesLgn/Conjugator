package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.troisieme.TroisiemeAitre;
import com.iut.verbe.back.verbe.Verbe;

public class TroisiemeGroupeAitre extends Verbe {

  public TroisiemeGroupeAitre(String verbe) throws VerbeException {
    super(verbe, new TroisiemeAitre(), "aitre", "u");
  }
}
