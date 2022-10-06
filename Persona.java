package Persona3;

public class Persona {
    // Attributes

    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;
    private String comidaFavorita;
    private String nacionalidad;
    private String coche;
    private String LoL;
    private int numHijos;
    private int numTel;
    private String universidad;
    private int altura;
    private String signozodiaco;
    private int peso;
    private int numeroSeguridadSocial;
    private string estado_civil;



    // Get Methods
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getDnisinletra(){
        return dnisinletra;
    }
    public int getNumeroSeguridadSocial(){
        return numeroSeguridadSocial;
    }
    public string getEstado_civil(){
        return estado_civil;
    }
    public string getcomidaFavorita(){
        return dniSinLetra;
    }

    public int getEdad(){
        return edad;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }

    public int getNumTel(){
        return numTel;
    }

    public String getLoL(){
        return LoL;
    }

    public String getSignozodiaco(){
        return signozodiaco;
    }

    public int getPeso(){
        return peso;
    }

    public String getCodPostal(){
        return cp;
    }

    public String getCoche(){
        return coche;
    }

    public int getNumHijos(){
        return numHijos;
    }
    
    public int getAltura() {
        return altura;
    }


    // Set Methods
    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setcomidaFavorita(String CF){
        this.comidaFavorita= CF;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public void setApellidos(String apel){
        this.apellidos= apel;
    }

    public void setDnisinletra(int dni){
        this.dnisinletra = dni;
    }
    public void setNumeroSeguridadSocial(int SgiS){
        this.numeroSeguridadSocial = SS;
    }
    public void setNumeroSeguridadSocial(String EstadoCivil){
        this.estado_civil = Estado_civil;
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

    public void setnumTel(int numTel){
        this.numTel = numTel;
    }

    public void setNacionalidad(){
        this.nacionalidad = nacionalidad;
    }

    public void setCoche(){
        this.coche = coche;
    }

    public void setEdad(int ed){
        if (ed >= 21){
            System.out.println("Ya puedes beber y votar en los EEUU \n");
        } 
		else {
            System.out.println("El cola cao no esta tan mal \n");
        }
        this.edad = ed;
	  }
	
    public void setNacionalidad(String nac){
        this.nacionalidad = nac;
    }

    public void setSignozodiaco(String signozodiaco){
        this.signozodiaco = signozodiaco;
    }

    public int setNumHijos(){
        this.getNumHijos = numHijos;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
