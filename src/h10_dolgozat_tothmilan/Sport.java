package h10_dolgozat_tothmilan;

/**
 *
 * @author Tóth Milán
 */
public abstract class Sport {

    protected Integer resztvevokSzama;
    protected Boolean kulteri;
    protected Boolean veszelyes;
    protected String idoszak;
    protected Double felkeszulesiIdo;
    protected String vilagRekordok;
    protected Integer minimumKorhatar;

    public Sport(Boolean kulteri, String idoszak) {
        this.kulteri = kulteri;
        this.idoszak = idoszak;
    }

    public Sport(Boolean kulteri, Boolean veszelyes) {
        this.kulteri = kulteri;
        this.veszelyes = veszelyes;
    }

    public Sport(Integer resztvevokSzama, Boolean kulteri, Boolean veszelyes, String idoszak, Double felkeszulesiIdo, String vilagRekordok, Integer minimumKorhatar) {
        this.resztvevokSzama = resztvevokSzama;
        this.kulteri = kulteri;
        this.veszelyes = veszelyes;
        this.idoszak = idoszak;
        this.felkeszulesiIdo = felkeszulesiIdo;
        this.vilagRekordok = vilagRekordok;
        this.minimumKorhatar = minimumKorhatar;
    }

    public Integer getResztvevokSzama() {
        return resztvevokSzama;
    }

    public void setResztvevokSzama(int resztvevokSzama) throws ResztvevokSzamaException {
        if (resztvevokSzama >= 1) {
            this.resztvevokSzama = resztvevokSzama;
        } else {
            throw new ResztvevokSzamaException("Legalább 1 résztvevőnek kell lennie!");
        }
    }

    public Boolean getKulteri() {
        return kulteri;
    }

    public void setKulteri(Boolean kulteri) {
        this.kulteri = kulteri;
    }

    public Boolean getVeszelyes() {
        return veszelyes;
    }

    public void setVeszelyes(Boolean veszelyes) {
        this.veszelyes = veszelyes;
    }

    public String getIdoszak() {
        return idoszak;
    }

    public void setIdoszak(String idoszak) {
        this.idoszak = idoszak;
    }

    public Double getFelkeszulesiIdo() {
        return felkeszulesiIdo;
    }

    public void setFelkeszulesiIdo(Double felkeszulesiIdo) {
        this.felkeszulesiIdo = felkeszulesiIdo;
    }

    public String getVilagRekordok() {
        return vilagRekordok;
    }

    public void setVilagRekordok(String vilagRekordok) {
        this.vilagRekordok = vilagRekordok;
    }

    public Integer getMinimumKorhatar() {
        return minimumKorhatar;
    }

    public void setMinimumKorhatar(Integer minimumKorhatar) {
        this.minimumKorhatar = minimumKorhatar;
    }

}
