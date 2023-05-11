package dolgozat_tothmilan;

/**
 *
 * @author Tóth Milán
 */
public class Gyorsasag {

    private int versenyTav;
    private double korIdo;
    private int atlagSebesseg;
    private String jarmu;

    public Gyorsasag(int atlagSebesseg, String jarmu) {
        this.atlagSebesseg = atlagSebesseg;
        this.jarmu = jarmu;
    }

    public Gyorsasag(int versenyTav, double korIdo, int atlagSebesseg, String jarmu) {
        this.versenyTav = versenyTav;
        this.korIdo = korIdo;
        this.atlagSebesseg = atlagSebesseg;
        this.jarmu = jarmu;
    }

    public int getVersenyTav() {
        return versenyTav;
    }

    public void setVersenyTav(int versenyTav) {
        this.versenyTav = versenyTav;
    }

    public double getKorIdo() {
        return korIdo;
    }

    public void setKorIdo(double korIdo) {
        this.korIdo = korIdo;
    }

    public int getAtlagSebesseg() {
        return atlagSebesseg;
    }

    public void setAtlagSebesseg(int atlagSebesseg) {
        this.atlagSebesseg = atlagSebesseg;
    }

    public String getJarmu() {
        return jarmu;
    }

    public void setJarmu(String jarmu) {
        this.jarmu = jarmu;
    }

}
