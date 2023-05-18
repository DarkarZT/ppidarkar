package Modelado;


import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Producto {
    private int idProd;
    private String tienda;
    private String nombreProducto;
    private String marca;
    private String timeDeUso;
    private double precio;
    private Date registerDatePro;



    public Producto() {
        
    }

    public Producto(int idProd, String nombreProducto, String marca, String timeDeUso, double precio, Date registerDatePro) {
        this.idProd = idProd;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.timeDeUso = timeDeUso;
        this.precio = precio;
        this.registerDatePro = registerDatePro;
    }

    public Date getRegisterDatePro() {
        return registerDatePro;
    }

    public void setRegisterDatePro(Date registerDatePro) {
        this.registerDatePro = registerDatePro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTimeDeUso() {
        return timeDeUso;
    }

    public void setTimeDeUso(String timeDeUso) {
        this.timeDeUso = timeDeUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProducto: " + nombreProducto + '\n' +
                "Id del producto: " + idProd + '\n' +
                "-Marca: " + marca + '\n' +
                "-Tiempo de uso: " + timeDeUso + '\n' +
                "-Precio: $" + precio + '\n' +
                "-Fecha de registro: " + registerDatePro ;
    }
    public Producto crearPrducto(){
        Random id = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        this.nombreProducto = entrada.nextLine();
        System.out.println("Marca del producto: ");
        this.marca = entrada.nextLine();
        System.out.println("Tiempo de uso del producto aproximado: ");
        this.timeDeUso = entrada.nextLine();
        System.out.println("Ingrese precio de venta: ");
        this.precio = entrada.nextDouble();
        Date fecha = Date.from(Instant.now());
        this.registerDatePro = fecha;
        System.out.println("Fecha de registro del producto: " + fecha);
        return this;
    }
}
