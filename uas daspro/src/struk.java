public class struk {
    private int idstruk;
    private String nama;
    private String email;
    private String tujuan;
    private String asal;
    private int harga;
    private int total;

    public struk setIdstruk(int idstruk) {
        this.idstruk = idstruk;
        return this;
    }

    public int getIdstruk() {
        return this.idstruk;
    }

    public struk setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getNama() {
        return this.nama;
    }

    public struk setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public struk setTujuan(String tujuan) {
        this.tujuan = tujuan;
        return this;
    }

    public String getTujuan() {
        return this.tujuan;
    }

    public struk setAsal(String asal) {
        this.asal = asal;
        return this;
    }

    public String getAsal() {
        return this.asal;
    }

    public struk setHarga(int harga) {
        this.harga = harga;
        return this;
    }

    public int getHarga() {
        return this.harga;
    }

    public struk setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getTotal() {
        return this.total;
    }
}
