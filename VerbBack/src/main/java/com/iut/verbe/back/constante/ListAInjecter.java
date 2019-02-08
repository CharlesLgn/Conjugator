package com.iut.verbe.back.constante;

import java.util.HashMap;

public class ListAInjecter {
  public static String[] LIST_COR;
  public static HashMap<Integer, String> LIST_TEMPS;


  static {
    LIST_COR = new String[]{"1",
                            "2",
                            "aitre",
                            "oindre",
                            "oudre"};

    LIST_TEMPS = new HashMap<>();
    LIST_TEMPS.put(0, "Participe Present");
    LIST_TEMPS.put(1, "Participe Passe");
    LIST_TEMPS.put(2, "Present Simple");
    LIST_TEMPS.put(3, "Passé Simple");
    LIST_TEMPS.put(4, "Futur Simple");
  }
}
