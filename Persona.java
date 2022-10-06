public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private String nacionalidad;
    private String Calle;
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

    public String getCalle(){
        return Calle;
    }
    public String getNacionalidad(){
        return nacionalidad;
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

    public void setNacionalidad(){
        this.nacionalidad = nacionalidad;
    }
    public void setCalle(){
        this.Calle=Calle;
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
