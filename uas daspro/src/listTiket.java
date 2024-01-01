public class listTiket {
    private int primarykey;
    private String asal;
    private String tujuan;
    private int harga;
    private String jenis;

    public listTiket setKey(int primarykey) {
        this.primarykey = primarykey;
        return this;
    }

    public int getKey() {
        return this.primarykey;
    }

    public listTiket SetAsal(String asal) {
        this.asal = asal;
        return this;
    }

    public String GetAsal() {
        return this.asal;
    }

    public listTiket SetTujuan(String tujuan) {
        this.tujuan = tujuan;
        return this;
    }

    public String GetTujuan() {
        return this.tujuan;
    }

    public listTiket SetHarga(int harga) {
        this.harga = harga;
        return this;
    }

    public int GetHarga() {
        return this.harga;
    }

    public listTiket SetJenis(String jenis) {
        this.jenis = jenis;
        return this;
    }

    public String GetJenis(String jenis) {
        return this.jenis;
    }

}
