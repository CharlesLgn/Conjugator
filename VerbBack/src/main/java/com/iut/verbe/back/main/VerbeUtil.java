package com.iut.verbe.back.main;

import com.iut.verbe.back.lambdastructure.LambdaString;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.back.verbe.utils.Pronoms;

import java.util.ArrayList;
import java.util.List;

public class VerbeUtil {

  private static String conjuguerPronom(Verbe verbe, String temps, int pronom) {
    StringBuilder sb = new StringBuilder();
    try {
      sb.append(verbe.conjuguer((LambdaString) verbe.getClass().getField(temps).get(verbe), pronom));
    } catch (NoSuchFieldException | IllegalAccessException ignore) {
    }
    return sb.toString();
  }

  public static List<String> conjugueInfinitif(Verbe verbe, String temps) {
    List<String> list = new ArrayList<>();
    for (int i = Pronoms.JE; i <= Pronoms.ILS; i++) {
      list.add(conjuguerPronom(verbe, temps, i));
    }
    return list;
  }

  public static List<String> conjuguerParticipe(Verbe verbe, String temps) {
    List<String> list = new ArrayList<>();
    list.add(conjuguerPronom(verbe, temps, 0));
    return list;
  }

}
