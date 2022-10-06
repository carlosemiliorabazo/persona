
public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;

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
    public bool checkNombre(String nombre) //Comprueba que el nombre no es nulo
    {
        bool name_is_ok=false;
            if(nombre!=null){
                name_is_ok=true;
            }
	return name_is_ok;
    }
    public void setNombre(String nom)
    {
	bool nomb = checkNombre(nom);
	if(nomb){
		this.nombre = nom;
	}
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public void setDniSinLetra(int dni){
        this.dniSinLetra = dni;
    }

    public void setComidaFavorita(String comida) { this.comidaFavorita = comida;}

    public String getComidaFavorita() { return comidaFavorita; }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }
}
