package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.groupe.Deuxieme;
import com.iut.verbe.back.verbe.Verbe;

public class DeuxiemeGroupe extends Verbe {

  public DeuxiemeGroupe(String verbe) throws VerbeException {
    super(verbe, new Deuxieme(), "ir", "i");
  }
}
