package com.iut.verbe.back.exception;

public class VerbeException extends RuntimeException {

  private static final long serialVersionUID = 7718828512143293558L;

  public VerbeException(){
    super();
  }

  /**
   * @param message le message qui doit apparaitre dans le cas d'un null ou d'une règle non respecté
   */
  public VerbeException(String message){
    super(message);
  }

  public VerbeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public VerbeException(String message, Throwable cause) {
    super(message, cause);
  }


  public VerbeException(Throwable cause) {
    super(cause);
  }
}
