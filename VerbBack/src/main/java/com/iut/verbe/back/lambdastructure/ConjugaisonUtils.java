package com.iut.verbe.back.lambdastructure;

import com.iut.verbe.back.verbe.utils.Pronoms;

import java.util.HashMap;

public class ConjugaisonUtils {
  public static HashMap<String, String> patern(String je, String tu, String il, String nous, String vous, String ils) {
    HashMap<String, String> res = new HashMap<String, String>();
    res.put(Pronoms.Personnelle.PREMIERE_PERSONNE_SINGULIRE_CONSONE, je);
    res.put(Pronoms.Personnelle.PREMIERE_PERSONNE_SINGULIRE_VOYELLE, je);
    res.put(Pronoms.Personnelle.DEUXIEME_PERSONNE_SINGULIRE, tu);
    res.put(Pronoms.Personnelle.TROISIEME_PERSONNE_SINGULIRE, il);
    res.put(Pronoms.Personnelle.PREMIERE_PERSONNE_PLURIELS, nous);
    res.put(Pronoms.Personnelle.DEUXIEME_PERSONNE_PLURIELS, vous);
    res.put(Pronoms.Personnelle.TROISIEME_PERSONNE_PLURIELS, ils);

    return res;
  }

  public static String terminaison(LambdaConjugue temps, String pronom) {
    return temps.returnStr(pronom);
  }

}
