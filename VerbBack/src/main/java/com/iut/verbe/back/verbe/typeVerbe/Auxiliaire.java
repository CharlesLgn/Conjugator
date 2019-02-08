package com.iut.verbe.back.verbe.typeVerbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.Conjugaison;

import java.lang.reflect.Constructor;

public class Auxiliaire {

  public Auxiliaire(String verbe) throws VerbeException {
  }

  private Conjugaison getConjug(String verbe) throws Exception {
    String className = ("" + verbe.charAt(0)).toUpperCase() + verbe.substring(1).toLowerCase();

    Class<?> clazz = Class.forName(className);
    Constructor<?> ctor = clazz.getConstructor(String.class);
    Object object = ctor.newInstance(new Object[]{ctor});
    return (Conjugaison) object;
  }
}
