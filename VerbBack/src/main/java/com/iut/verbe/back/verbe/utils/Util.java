package com.iut.verbe.back.verbe.utils;

import com.iut.verbe.back.verbe.Verbe;

public class Util {

  public static String justBase(Verbe verbe) {
    return verbe.getVerbe().substring(0, verbe.getVerbe().length() - verbe.getFin());
  }

  public static String needE(Verbe verbe, String pronom) {
    String base = justBase(verbe);
    char last = base.charAt(base.length() - 1);
    return (pronom.equals(Pronoms.Personnelle.PREMIERE_PERSONNE_PLURIELS) && (last == 'g' || last == 'c')) ? "e" : "";
  }

  public static String beginByAEIOUY(Verbe verbe) {
    return verbe.getVerbe().toLowerCase().matches("[aeiouy][a-z]+") ? Pronoms.Personnelle.PREMIERE_PERSONNE_SINGULIRE_VOYELLE
            : Pronoms.Personnelle.PREMIERE_PERSONNE_SINGULIRE_CONSONE;
  }
}