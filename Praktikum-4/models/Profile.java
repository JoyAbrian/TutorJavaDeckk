package login_app.models;

public class Profile {
    String namaLengkap;
    int umur;
    String hobby;
    String nickname;
    
    public Profile() {  }

    public Profile(String namaLengkap, int umur, String hobby, String nickname) {
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.hobby = hobby;
        this.nickname = nickname;
    }
    
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
