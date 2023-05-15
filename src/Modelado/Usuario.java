package Modelado;

public class Usuario  {

    private int id_user;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String passsword;
    //@OneToAll
    //private Producto unProducto;
  

    public Usuario(int id_user, String cedula, String nombre, String apellido, String correo, String passsword, Producto unProducto) {
        this.id_user = id_user;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.passsword = passsword;
        //this.unProducto = unProducto;
    }

    public Usuario(){
        
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

   /* public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }
*/

    @Override
    public String toString() {
        return "Usuario{" + "id_user=" + id_user + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", passsword=" + passsword + '}';
    }
  
   
    
    
}
   