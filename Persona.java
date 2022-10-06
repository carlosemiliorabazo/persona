public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private int hijos;

    private String comidaFavorita;

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getDniSinLetra(){
        return dniSinLetra;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public void setDniSinLetra(int dni){
        this.dniSinLetra = dni;
    }

    public void setComidaFavorita(String comida) { this.comidaFavorita = comida;}

    public String getComidaFavorita() { return comidaFavorita; }

    public void setTrabajo(String trabajo)
    {
        if (hijos < 3){
            System.out.println("No es familia numerosa");
        }
        if(hijos >= 3){
            System.out.println("Tienes familia numerosa");
        }
    }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }
}
