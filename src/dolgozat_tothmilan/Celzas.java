package dolgozat_tothmilan;

/**
 *
 * @author Tóth Milán
 */
public class Celzas {

    private Integer celokSzama;
    private Integer lotav;
    private String eszkoz;

    public Celzas(Integer celokSzama, Integer lotav) {
        this.celokSzama = celokSzama;
        this.lotav = lotav;
    }

    public Celzas(Integer celokSzama, Integer lotav, String eszkoz) {
        this.celokSzama = celokSzama;
        this.lotav = lotav;
        this.eszkoz = eszkoz;
    }

    public Integer getCelokSzama() {
        return celokSzama;
    }

    public void setCelokSzama(Integer celokSzama) throws CelokSzamaException {
        if (celokSzama >= 1) {
            this.celokSzama = celokSzama;
        } else {
            throw new CelokSzamaException("Minimum 1 célnak kell lennie!");
        }
    }

    public Integer getLotav() {
        return lotav;
    }

    public void setLotav(Integer lotav) {
        this.lotav = lotav;
    }

    public String getEszkoz() {
        return eszkoz;
    }

    public void setEszkoz(String eszkoz) {
        this.eszkoz = eszkoz;
    }

}
