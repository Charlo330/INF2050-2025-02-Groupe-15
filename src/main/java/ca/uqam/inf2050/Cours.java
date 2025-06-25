package ca.uqam.inf2050;

/**
 * Classe représentant un cours.
 */
public class Cours {

  // Sigle du cours
  private String sigle;

  // Titre du cours
  private String titre;

  // Description du cours
  private String description;

  // Nombre de crédits du cours
  private Number nbCredits;

  /**
   * Constructeur de la classe Cours.
   *
   * @param sigle Le sigle du cours.
   * @param titre Le titre du cours.
   * @param description La description du cours.
   * @param nbCredits Le nombre de crédits du cours.
   */
  public Cours(String sigle, String titre, String description, Number nbCredits) {
    this.sigle = sigle;
    this.titre = titre;
    this.description = description;
    this.nbCredits = nbCredits;
  }

  /**
   * Getter pour le sigle du cours.
   *
   * @return Le sigle du cours.
   */
  public String getSigle() {
    return sigle;
  }

  /**
   * Setter pour le sigle du cours.
   *
   * @param sigle Le sigle du cours.
   */
  public void setSigle(String sigle) {
    this.sigle = sigle;
  }

  /**
   * Getter pour le titre du cours.
   *
   * @return Le titre du cours.
   */
  public String getTitre() {
    return titre;
  }

  /**
   * Setter pour le titre du cours.
   *
   * @param titre Le titre du cours.
   */
  public void setTitre(String titre) {
    this.titre = titre;
  }

  /**
   * Getter pour la description du cours.
   *
   * @return La description du cours.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Setter pour la description du cours.
   *
   * @param description La description du cours.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter pour le nombre de crédits du cours.
   *
   * @return Le nombre de crédits du cours.
   */
  public Number getNbCredits() {
    return nbCredits;
  }

  /**
   * Setter pour le nombre de crédits du cours.
   *
   * @param nbCredits Le nombre de crédits du cours.
   */
  public void setNbCredits(Number nbCredits) {
    this.nbCredits = nbCredits;
  }
}
