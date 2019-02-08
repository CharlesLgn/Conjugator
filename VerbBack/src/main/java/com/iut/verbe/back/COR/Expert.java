package com.iut.verbe.back.COR;

import com.iut.verbe.back.verbe.Verbe;

public interface Expert {

  /**
   * retourne l'instance de verbe, null en cas d'echec
   */
  Verbe resoudre(String verbe);
}
