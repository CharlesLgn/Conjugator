package com.iut.verbe.back.COR;

import java.lang.reflect.Constructor;

public class InjectionUtils {

  /**
   * inject les différent type en paramêtre. n'inject pas le mal écrit
   */
  public static ExpertCOR inject(String[] args){
    ExpertCOR experCOR = null;
    for (String arg : args){
      try {
        Class<?> clazz = Class.forName("com.iut.verbe.back.COR.exper.ExperCOR"+arg);
        Constructor<?> ctor = clazz.getConstructor(ExpertCOR.class);
        Object object = ctor.newInstance(experCOR);
        experCOR= (ExpertCOR)object;
      } catch (Exception e){
        e.printStackTrace();
      }
    }
    return experCOR;
  }
}
