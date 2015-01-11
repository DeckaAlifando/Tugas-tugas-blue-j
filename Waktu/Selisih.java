
/**
 * Write a description of class Selisih here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selisih
{
   public static final int MAX_JAM=23;
   public static final int MAX_MENIT_DETIK=59;
   private int jam1;
   private int menit1;
   private int detik1;
   private int jam2;
   private int menit2;
   private int detik2;
    private int sjam=0;
   private int smenit=0;
   private int sdetik=0;
   Waktu wkt = new Waktu();
    public Selisih()
    {
       jam1=0;
       menit1=0;
       detik1=0;
       jam2=0;
       menit2=0;
       detik2=0;
    }
    
    public Selisih(int jam1, int menit1, int detik1, int jam2, int menit2, int detik2)
    {
       wkt.setJam(jam1);
       wkt.setJam(jam2);
       wkt.setMenit(menit1);
       wkt.setMenit(menit2);
       wkt.setDetik(detik1);
       wkt.setDetik(detik2);
       this.jam1=jam1;
       this.jam2=jam2;
       this.menit1=menit1;
       this.menit2=menit2;
       this.detik1=detik1;
       this.detik2=detik2;
    }
    public void setJam(int jam)
    {
        wkt.setJam(jam);
    }
    public void setMenit(int menit){
        wkt.setMenit(menit);
    }
    public void setDetik(int detik){
        wkt.setDetik(detik);
    }
    
    public void hitungSelisih(){
        if(detik2-detik1 < 0){
            while(detik2-detik1 < 0){
                menit2=-1;
                detik2=+60;
            }
            sdetik=detik2-detik1;
        }else{
            sdetik = detik2-detik1;
        }
        if(menit2-menit1< 0){
            while(menit2-menit1 < 0){
                jam2=-1;
                menit2=+60;
            }
             smenit = menit2-menit1;
        }else{
            smenit = menit2-menit1;
        }   
        if(jam2-jam1< 0){
           System.out.println("Maaf, Anda salah memasukkan jam 1");
        }else{
            sjam = jam2-jam1;
        }   
    }
    public void cetak(){
        System.out.println("Selisih waktu adalah /n" + sjam + " jam " + smenit + " menit " + sdetik + " detik");
    }

    
    
}
