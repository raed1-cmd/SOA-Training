package entities;

import java.util.Objects;

public class UniteEnseignement {
    private int code;
    private String domaine;
    private String responsable;
    private int credits;
    private int semestre;

    public UniteEnseignement() {
    }

    public UniteEnseignement(int code, String domaine, String responsable, int credits, int semestre) {
        this.code = code;
        this.domaine = domaine;
        this.responsable = responsable;
        this.credits = credits;
        this.semestre = semestre;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // AJOUT : equals() doit toujours accompagner hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniteEnseignement)) return false;
        UniteEnseignement that = (UniteEnseignement) o;
        return code == that.code
                && credits == that.credits
                && semestre == that.semestre
                && Objects.equals(domaine, that.domaine)
                && Objects.equals(responsable, that.responsable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getDomaine(), getResponsable(), getCredits(), getSemestre());
    }

    // AJOUT : affichage lisible (utile pour les tests et les logs)
    @Override
    public String toString() {
        return "UniteEnseignement{" +
                "code=" + code +
                ", domaine='" + domaine + '\'' +
                ", responsable='" + responsable + '\'' +
                ", credits=" + credits +
                ", semestre=" + semestre +
                '}';
    }
}