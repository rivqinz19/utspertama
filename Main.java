import pengguna.*;
class Main {
    public static void main(String[] args) {
        Mhs mhs = new Mhs("ini_username", "ini_password");

        mhs.setNama("Muhammad Rifqi Nazarudin");
        mhs.setNim("G.111.19.0050");
        mhs.setSmt(6);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smst Mhs: "+ mhs.getSmt());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("Password: " + mhs.getPassword());



    }
}