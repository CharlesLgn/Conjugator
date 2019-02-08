package com.iut.verbe.back.verbe;

import com.iut.verbe.back.exception.VerbeException;
import com.iut.verbe.back.lambdastructure.Conjugaison;
import com.iut.verbe.back.lambdastructure.ConjugaisonUtils;
import com.iut.verbe.back.lambdastructure.LambdaConjugue;
import com.iut.verbe.back.lambdastructure.LambdaString;
import com.iut.verbe.back.verbe.typeVerbe.PremierGroupe;
import com.iut.verbe.back.verbe.utils.Pronoms;
import com.iut.verbe.back.verbe.utils.Util;

public abstract class Verbe {

  private LambdaConjugue present;
  private LambdaConjugue passeSimple;
  private LambdaConjugue futur;

  private String participePassee;


  public LambdaString conjuguePresentSimple    = personne -> conjugue(present)[personne];
  public LambdaString conjuguePasseSimple      = personne -> conjugue(passeSimple)[personne];
  public LambdaString conjugueFuturSimple      = personne -> conjugue(futur)[personne];
  public LambdaString conjugueParticipePasse   = personne -> formeVerbe("", participePassee);
  public LambdaString conjugueParticipePresent = personne -> returnParticipePresent();

  private String verbe;

  private int fin;

  protected Verbe(String verbe, Conjugaison type, String fin, String participePassee) throws VerbeException {
    if (verbe == null || verbe.equals("") || verbe.equals(fin) || !verbe.matches("(?i)[A-zÀ-û]+"+fin)){
      throw new VerbeException("le verbe <b>"+verbe+"</b> doit au minimum finir par <b>"+fin+"</b> avec une lettre en plus");
    }
    this.verbe            = verbe.trim().toLowerCase();
    this.fin = fin.length();

    this.present          = type.conjugPresent;
    this.passeSimple      = type.conjugPasseSimple;
    this.futur            = type.conjugFutur;

    this.participePassee = participePassee;
  }

  private String formeVerbe(String pronoms, String finVerbe) {
    StringBuilder sb;
    sb = new StringBuilder();
    sb.append(pronoms)
            .append(Util.justBase(this))
            .append(this instanceof PremierGroupe ? Util.needE(this, pronoms) : "" )
            .append(finVerbe);
    return sb.toString();
  }

  private String[] conjugue(LambdaConjugue temps){
    String je = formeVerbe(Util.beginByAEIOUY(this),                   ConjugaisonUtils.terminaison(temps, Util.beginByAEIOUY(this))),
           tu = formeVerbe(Pronoms.Personnelle.DEUXIEME_PERSONNE_SINGULIRE,  ConjugaisonUtils.terminaison(temps, Pronoms.Personnelle.DEUXIEME_PERSONNE_SINGULIRE)),
           il = formeVerbe(Pronoms.Personnelle.TROISIEME_PERSONNE_SINGULIRE, ConjugaisonUtils.terminaison(temps, Pronoms.Personnelle.TROISIEME_PERSONNE_SINGULIRE)),
         nous = formeVerbe(Pronoms.Personnelle.PREMIERE_PERSONNE_PLURIELS,   ConjugaisonUtils.terminaison(temps, Pronoms.Personnelle.PREMIERE_PERSONNE_PLURIELS)),
         vous = formeVerbe(Pronoms.Personnelle.DEUXIEME_PERSONNE_PLURIELS,   ConjugaisonUtils.terminaison(temps, Pronoms.Personnelle.DEUXIEME_PERSONNE_PLURIELS)),
          ils = formeVerbe(Pronoms.Personnelle.TROISIEME_PERSONNE_PLURIELS,  ConjugaisonUtils.terminaison(temps, Pronoms.Personnelle.TROISIEME_PERSONNE_PLURIELS));

    return new String[]{je, tu, il , nous, vous, ils};
  }

  public String conjuguer(LambdaString temps, int pronom){
    return temps.returnStr(pronom);
  }

  private String returnParticipePresent() {
    String vb = conjugue(present)[Pronoms.NOUS].split(" ")[1];
    StringBuilder sb = new StringBuilder();
    sb.append("En ")
      .append(vb, 0, vb.length() - 3)
      .append("ant");
    return sb.toString();
  }

  public int getFin() {
    return fin;
  }

  public String getVerbe() {
    return verbe;
  }

}
