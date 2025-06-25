package ca.uqam.inf2050;

import java.time.LocalDate;

/**
 * Classe représentant une session scolaire.
 */
public class Session {
  // Code de la session.
  private Number codesession;

  // Date de début de la session.
  private LocalDate dateDebut;

  // Date de fin de la session.
  private LocalDate dateFin;

  /**
   * Constructeur de la classe Session.
   *
   * @param codesession le code de la session
   * @param dateDebut   la date de début de la session
   * @param dateFin     la date de fin de la session
   */
  public Session(Number codesession, LocalDate dateDebut, LocalDate dateFin) {
    this.codesession = codesession;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
  }

  /**
   * Getter pour le code de la session.
   *
   * @return le code de la session
   */
  public Number getCodesession() {
    return codesession;
  }

  /**
   * Setter pour le code de la session.
   *
   * @param codesession le code de la session
   */
  public void setCodesession(Number codesession) {
    this.codesession = codesession;
  }

  /**
   * Getter pour la date de début de la session.
   *
   * @return la date de début de la session
   */
  public LocalDate getDateDebut() {
    return dateDebut;
  }

  /**
   * Setter pour la date de début de la session.
   *
   * @param dateDebut la date de début de la session
   */
  public void setDateDebut(LocalDate dateDebut) {
    this.dateDebut = dateDebut;
  }

  /**
   * Getter pour la date de fin de la session.
   *
   * @return la date de fin de la session
   */
  public LocalDate getDateFin() {
    return dateFin;
  }

  /**
   * Setter pour la date de fin de la session.
   *
   * @param dateFin la date de fin de la session
   */
  public void setDateFin(LocalDate dateFin) {
    this.dateFin = dateFin;
  }
}
