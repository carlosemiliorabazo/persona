public class Persona {
    private String nombre;
    private String apellidos;
    private String estudios;
    private int dniSinLetra;
    private int edad;
    private String nacionalidad;
    private String hobbie;
    private String LoL;

    private String universidad;

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

    public String getLoL(){
        return LoL;
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

    public void setEstudios(String estudios){
        this.estudios = estudios;
    }
    public String getEstudios() {
        return estudios;
    }
    public void setLoL(String LoL){
        this.LoL = LoL;
    }

    public void setNacionalidad(){
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int ed){
        if (ed <= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
