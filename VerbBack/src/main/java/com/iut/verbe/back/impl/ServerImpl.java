package com.iut.verbe.back.impl;

import com.iut.verbe.back.COR.ExpertCOR;
import com.iut.verbe.back.COR.InjectionUtils;
import com.iut.verbe.back.constante.ListAInjecter;
import com.iut.verbe.back.main.VerbeUtil;
import com.iut.verbe.back.verbe.Verbe;
import com.iut.verbe.comon.link.ServerInterface;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

public class ServerImpl extends Observable implements ServerInterface {
  private HashMap<Integer, String> hashMap;
  private ExpertCOR experCOR;

  public ServerImpl() {
    new Thread(() -> {
      while (true) setChanged();
    }).start();

    hashMap = new HashMap<>();
    hashMap.put(0, "conjugueParticipePresent");
    hashMap.put(1, "conjugueParticipePasse");
    hashMap.put(2, "conjuguePresentSimple");
    hashMap.put(3, "conjuguePasseSimple");
    hashMap.put(4, "conjugueFuturSimple");

    experCOR = InjectionUtils.inject(ListAInjecter.LIST_COR);
  }

  @Override
  public List<String> conjugaison(String verbe, int temps) {
    Verbe vb = experCOR.resoudre(verbe);
    if (vb == null) {
      return null;
    }
    String str = hashMap.get(temps);
    return str.contains("Participe") ? VerbeUtil.conjuguerParticipe(vb, str) :
            VerbeUtil.conjugueInfinitif(vb, str);
  }

  @Override
  public HashMap<Integer, String> getListConj() {
    return ListAInjecter.LIST_TEMPS;
  }
}
