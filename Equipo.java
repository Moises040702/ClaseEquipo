public class Equipo {
    
    private String nombreEquipo;
    private int numeroPersonas;
    private boolean juegan;
    
    public Equipo(String nombreDelEquipo, int numeroDePersonas, boolean jugar) {
        nombreEquipo = nombreDelEquipo;
        numeroPersonas = numeroDePersonas;
        juegan = jugar;
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
    public void setAñadirJugador(int añadirJugadores) {
        numeroPersonas += añadirJugadores;
    }
    public void setJueganoNO(boolean jueg) {
        juegan = jueg;
    }
    public String getstats (){
        String estado = "El nombre del equipo es " + nombreEquipo + " El equipo está formado por " + numeroPersonas + " jugadores" + " ¿Juegan siempre los mismos jugadores " + juegan;
        return estado;
    }
    public void imprimirstats(){
        String estado = "El nombre del equipo es " + nombreEquipo + " El equipo está formado por " + numeroPersonas + " jugadores" + " ¿Juegan siempre los mismos jugadores? " + juegan;
        System.out.println(estado);
    }    
        
        
        
   
}