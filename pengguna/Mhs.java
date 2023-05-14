package pengguna;

public class Mhs extends User{
    private String nama;
    private String nim;
    private int smt;

public Mhs (String username, String password){
    super("username", "password");
}
public void setNama(String nama){
    this.nama = nama ;
}

public String getNama(){
    return this.nama ;
}

public void setNim(String nim) {
    this.nim = nim ;
}
public String getNim(){
    return this.nim ;
}

public void setSmt(int smt) {
    this.username = username ;
}

public int getSmt(){
    return this.smt ;
}

}