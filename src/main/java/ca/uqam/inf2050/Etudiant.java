package ca.uqam.inf2050;

/**
 * Classe représentant un étudiant.
 */
public class Etudiant {

  // Code permanent de l'étudiant
  private String codePermanent;

  // Nom de l'étudiant
  private String nom;

  // Prénom de l'étudiant
  private String prenom;

  // Code du programme de l'étudiant
  private Number codeprogramme;

  /**
   * Constructeur de la classe Etudiant.
   *
   * @param codePermanent Le code permanent de l'étudiant.
   * @param nom Le nom de l'étudiant.
   * @param prenom Le prénom de l'étudiant.
   * @param codeprogramme Le code du programme de l'étudiant.
   */
  public Etudiant(String codePermanent, String nom, String prenom, Number codeprogramme) {
    this.codePermanent = codePermanent;
    this.nom = nom;
    this.prenom = prenom;
    this.codeprogramme = codeprogramme;
  }

  /**
   * Getter pour le code permanent de l'étudiant.
   *
   * @return Le code permanent de l'étudiant.
   */
  public String getCodePermanent() {
    return codePermanent;
  }

  /**
   * Setter pour le code permanent de l'étudiant.
   *
   * @param codePermanent Le code permanent de l'étudiant.
   */
  public void setCodepermanent(String codePermanent) {
    this.codePermanent = codePermanent;
  }

  /**
   * Getter pour le nom de l'étudiant.
   *
   * @return Le nom de l'étudiant.
   */
  public String getNom() {
    return nom;
  }

  /**
   * Setter pour le nom de l'étudiant.
   *
   * @param nom Le nom de l'étudiant.
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Getter pour le prénom de l'étudiant.
   *
   * @return Le prénom de l'étudiant.
   */
  public String getPrenom() {
    return prenom;
  }

  /**
   * Setter pour le prénom de l'étudiant.
   *
   * @param prenom Le prénom de l'étudiant.
   */
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  /**
   * Getter pour le code du programme de l'étudiant.
   *
   * @return Le code du programme de l'étudiant.
   */
  public Number getCodeprogramme() {
    return codeprogramme;
  }

  /**
   * Setter pour le code du programme de l'étudiant.
   *
   * @param codeprogramme Le code du programme de l'étudiant.
   */
  public void setCodeprogramme(Number codeprogramme) {
    this.codeprogramme = codeprogramme;
  }
}
