package id.sch.smktelkom_mlg.project2.xirpl608202231.project_02;

import java.util.Date;

/**
 * Created by Dafa Zakhulhaq on 12/03/2017.
 */

public class ChatMessage {
    private String pesanTeks;
    private String pesanPengguna;
    private long pesanWaktu;

    public ChatMessage(String pesanTeks, String pesanPengguna) {

        this.pesanPengguna = pesanPengguna;
        this.pesanTeks = pesanTeks;

        pesanWaktu = new Date().getTime();

    }

    public ChatMessage() {
    }

    public String getPesanTeks() {
        return pesanTeks;
    }

    public void setPesanTeks(String pesanTeks) {
        this.pesanTeks = pesanTeks;
    }

    public String getPesanPengguna() {
        return pesanPengguna;
    }

    public void setPesanPengguna(String pesanPengguna) {
        this.pesanPengguna = pesanPengguna;
    }

    public long getPesanWaktu() {
        return pesanWaktu;
    }

    public void setPesanWaktu(long pesanWaktu) {
        this.pesanWaktu = pesanWaktu;
    }
}
