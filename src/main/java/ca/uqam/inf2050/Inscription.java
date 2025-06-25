package ca.uqam.inf2050;

import java.time.LocalDate;

/**
 * Classe représentant une inscription d'un étudiant dans un groupe de cours.
 */
public class Inscription {

  // Étudiant inscrit dans le groupe de cours
  private Etudiant etudiant;

  // Groupe de cours auquel l'étudiant est inscrit
  private GroupeCours groupeCours;

  // Date d'inscription de l'étudiant dans le groupe de cours
  private LocalDate dateinscription;

  // Date d'abandon de l'étudiant du groupe de cours
  private LocalDate dateabandon;

  // Note obtenue par l'étudiant dans le groupe de cours
  private Number note;

  /**
   * Constructeur de la classe Inscription.
   *
   * @param etudiant L'étudiant inscrit dans le groupe de cours.
   * @param groupeCours Le groupe de cours auquel l'étudiant est inscrit.
   * @param dateinscription La date d'inscription de l'étudiant dans le groupe de cours.
   * @param dateabandon La date d'abandon de l'étudiant du groupe de cours.
   * @param note La note obtenue par l'étudiant dans le groupe de cours.
   */
  public Inscription(Etudiant etudiant, GroupeCours groupeCours, LocalDate dateinscription,
                     LocalDate dateabandon, Number note) {
    this.etudiant = etudiant;
    this.groupeCours = groupeCours;
    this.dateinscription = dateinscription;
    this.dateabandon = dateabandon;
    this.note = note;
  }

  /**
   * Getter pour l'étudiant inscrit dans le groupe de cours.
   *
   * @return L'étudiant inscrit dans le groupe de cours.
   */
  public Etudiant getEtudiant() {
    return etudiant;
  }

  /**
   * Setter pour l'étudiant inscrit dans le groupe de cours.
   *
   * @param etudiant L'étudiant à inscrire dans le groupe de cours.
   */
  public void setEtudiant(Etudiant etudiant) {
    this.etudiant = etudiant;
  }

  /**
   * Getter pour le groupe de cours auquel l'étudiant est inscrit.
   *
   * @return Le groupe de cours auquel l'étudiant est inscrit.
   */
  public GroupeCours getGroupecours() {
    return groupeCours;
  }

  /**
   * Setter pour le groupe de cours auquel l'étudiant est inscrit.
   *
   * @param groupeCours Le groupe de cours à associer à l'étudiant.
   */
  public void setGroupecours(GroupeCours groupeCours) {
    this.groupeCours = groupeCours;
  }

  /**
   * Getter pour la date d'inscription de l'étudiant dans le groupe de cours.
   *
   * @return La date d'inscription de l'étudiant dans le groupe de cours.
   */
  public LocalDate getDateinscription() {
    return dateinscription;
  }

  /**
   * Setter pour la date d'inscription de l'étudiant dans le groupe de cours.
   *
   * @param dateinscription La date d'inscription de l'étudiant dans le groupe de cours.
   */
  public void setDateinscription(LocalDate dateinscription) {
    this.dateinscription = dateinscription;
  }

  /**
   * Getter pour la date d'abandon de l'étudiant du groupe de cours.
   *
   * @return La date d'abandon de l'étudiant du groupe de cours.
   */
  public LocalDate getDateabandon() {
    return dateabandon;
  }

  /**
   * Setter pour la date d'abandon de l'étudiant du groupe de cours.
   *
   * @param dateabandon La date d'abandon de l'étudiant du groupe de cours.
   */
  public void setDateabandon(LocalDate dateabandon) {
    this.dateabandon = dateabandon;
  }

  /**
   * Getter pour la note obtenue par l'étudiant dans le groupe de cours.
   *
   * @return La note obtenue par l'étudiant dans le groupe de cours.
   */
  public Number getNote() {
    return note;
  }

  /**
   * Setter pour la note obtenue par l'étudiant dans le groupe de cours.
   *
   * @param note La note obtenue par l'étudiant dans le groupe de cours.
   */
  public void setNote(Number note) {
    this.note = note;
  }
}
