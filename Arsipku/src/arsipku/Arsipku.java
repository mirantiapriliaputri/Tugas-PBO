
package arsipku;


public class Arsipku implements Biodata, Nilai {

    
    public static void main(String[] args) {
       Arsipku ps = new Arsipku();
       ps.nama();
       ps.tempatLahir();
       ps.hobi();
       ps.agama();
       ps.BahasaIndonesia();
       ps.matematika();
        
    }

   
    @Override
    public void nama() {
        System.out.println("Namaku Miranti Aprilia Putri");
    }

    @Override
    public void tempatLahir() {
        System.out.println("Tempat Lahirku Di Jember");
    }

    @Override
    public void hobi() {
        System.out.println("Hobiku Menyanyi Dan Memasak");
    }

    @Override
    public void agama() {
        System.out.println("Nilai Agamaku : 95");
    }

    @Override
    public void BahasaIndonesia() {
        System.out.println("Nilai Bahasa Indonesiaku : 100");
    }

    @Override
    public void matematika() {
        System.out.println("Nilai Matematikaku : 90");
    }
}
