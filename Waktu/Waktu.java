
/**
 * Write a description of class Waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waktu
{   
    public static final int MAX_JAM=23;
    public static final int MAX_MENIT_DETIK=59;
    private int jam;
    private int menit;
    private int detik;

    /**
     * Constructor for objects of class Waktu
     */
    public Waktu()
    {
       jam=0;
       menit=0;
       detik=0;
    }
    public Waktu(int jam, int menit, int detik)
    {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }
    public void setJam(int jam)
    {
        if((jam < 0 )||(jam > MAX_JAM))
        {
        System.err.println("Jam tidak boleh kurang dari 0 dan lebih dari 23");
        this.jam=0;
        }
        else{
        this.jam=jam;
        }
    }
    public void setMenit(int menit)
    {
        if((menit < 0 )||(menit > MAX_MENIT_DETIK))
        {
        System.err.println("Menit tidak boleh kurang dari 0 dan lebih dari 59");
        this.menit=0;
        }
        else{
        this.menit=menit;
        }
    }
    public void setDetik(int detik)
    {
        if((detik < 0 )||(detik > MAX_MENIT_DETIK))
        {
        System.err.println("Detik tidak boleh kurang dari 0 dan lebih dari 59");
        this.detik=0;
        }
        else{
        this.detik=detik;
        }
    }
    
    public void JamUp()
    {
           
        if( jam > MAX_JAM){
            jam=0;
        }
        else{
            jam++;
            if( jam > MAX_JAM){
            jam=0;
        }
        }
        
    }
    
    
    public void MenitUp()
    {
           
        if( menit > MAX_MENIT_DETIK){
            menit = 0;
            JamUp();
        }else{
            menit++;
            if( menit > MAX_MENIT_DETIK){
            menit = 0;
            JamUp();
        }
        }
        
    }
    
    public void DetikUp()
    {
        if(detik > MAX_MENIT_DETIK){
            detik = 0;
            MenitUp();
        }
        else{
            detik++;
            if(detik > MAX_MENIT_DETIK){
            detik = 0;
            MenitUp();
        }
        }
        
    }
    //tambahkan setter dan getter method
    public String toString()
    {
        return jam+":"+menit+":"+detik;
    }
}
