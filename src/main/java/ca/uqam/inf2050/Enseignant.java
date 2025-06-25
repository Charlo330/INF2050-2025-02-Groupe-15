package ca.uqam.inf2050;

/**
 * Classe représentant un enseignant.
 */
public class Enseignant {

  // Code de l'enseignant
  private String codeEnseignant;

  // Nom de l'enseignant
  private String nom;

  // Prénom de l'enseignant
  private String prenom;

  /**
   * Constructeur de la classe Enseignant.
   *
   * @param codeEnseignant Le code de l'enseignant.
   * @param nom Le nom de l'enseignant.
   * @param prenom Le prénom de l'enseignant.
   */
  public Enseignant(String codeEnseignant, String nom, String prenom) {
    this.codeEnseignant = codeEnseignant;
    this.nom = nom;
    this.prenom = prenom;
  }

  /**
   * Getter pour le code de l'enseignant.
   *
   * @return Le code de l'enseignant.
   */
  public String getCodeEnseignant() {
    return codeEnseignant;
  }

  /**
   * Setter pour le code de l'enseignant.
   *
   * @param codeEnseignant Le code de l'enseignant.
   */
  public void setCodeenseignant(String codeEnseignant) {
    this.codeEnseignant = codeEnseignant;
  }

  /**
   * Getter pour le nom de l'enseignant.
   *
   * @return Le nom de l'enseignant.
   */
  public String getNom() {
    return nom;
  }

  /**
   * Setter pour le nom de l'enseignant.
   *
   * @param nom Le nom de l'enseignant.
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Getter pour le prénom de l'enseignant.
   *
   * @return Le prénom de l'enseignant.
   */
  public String getPrenom() {
    return prenom;
  }

  /**
   * Setter pour le prénom de l'enseignant.
   *
   * @param prenom Le prénom de l'enseignant.
   */
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
}
