public class Equipo {
    
    private String nombreEquipo;
    private int numeroPersonas;
    private boolean juegan;
    
    public Equipo(String nombreDelEquipo, int numeroDePersonas) {
        nombreEquipo = nombreDelEquipo;
        numeroPersonas = numeroDePersonas;
        juegan = true;
    }
    public int getNumeroPersonas() {
        return numeroPersonas;
    }
    public String getNombreDeEquipo() {
        return nombreEquipo;
    }
    public boolean getjuego() {
        return juegan;
    }
    public void setAnadirJugador(int añadirJugadores) {
        numeroPersonas += añadirJugadores;
    }
    public void setJueganoNO(boolean jueg) {
        juegan = jueg;
    }
    public void setNombredelEquipo(String nombreDeMiEquipo){
        nombreEquipo = nombreDeMiEquipo;
    }
    public void setsiJuegan(){
        if(juegan == true){
         juegan = false;
        }
        else{
        juegan = true;
        }
    }
    public String getstats (){
        String SiNo = null;
        if(juegan == true){
            SiNo = "Si";
        }
        else{
            SiNo = "No";
        }
        String estado = "El nombre del equipo es " + nombreEquipo + " El equipo está formado por " + numeroPersonas + " jugadores" + " ¿Juegan siempre los mismos jugadores? " + SiNo;
        return estado;
    }
    public void imprimirstats(){
        String SiNo = null;
        if(juegan == true){
        SiNo = "Si";
        }
        else{
        SiNo = "No";
        }
        String estado = "El nombre del equipo es " + nombreEquipo + " El equipo está formado por " + numeroPersonas + " jugadores" + " ¿Juegan siempre los mismos jugadores? " + SiNo;
        System.out.println(estado);
    }    
    
        
        
        
   
}