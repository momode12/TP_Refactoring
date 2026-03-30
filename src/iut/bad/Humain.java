package iut.bad;

public class Humain implements Consommation {

    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", " + age + " ans";
    }

    @Override
	public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    @Override
	public void boire() {
        System.out.println(nom + " est en train de boire.");
    }
}