public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;

    private double alt;

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

    public Double getAltura(){
        return alt;
    }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }

    public void setAltura(double alt){
        if (alt >= 1.75){
            System.out.println("Que haces que no juegas en la nba?");
        } else {
            System.out.println("Come mas petisuis hermano");
        }
        this.alt = alt;
    }
}
