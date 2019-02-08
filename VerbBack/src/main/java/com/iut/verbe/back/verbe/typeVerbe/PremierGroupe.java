package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.Premier;
import com.iut.verbe.back.verbe.Verbe;

public class PremierGroupe extends Verbe {

  public PremierGroupe(String verbe) throws VerbeException {
    super(verbe, new Premier(), "er", "é");
  }
}
