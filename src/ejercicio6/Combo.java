package ejercicio6;
import ejercicio6.filtros.Filtro;
import java.util.ArrayList;

public class Combo extends ElementoBazar {
    protected ArrayList<ElementoBazar> productos;
    private Filtro filtro;
    private double porcentaje;
    private int porcentajeMaximo;


    public Combo(String nombreCombo){  //constructor simple
        super(nombreCombo);
        productos = new ArrayList<>();

    }

    public Combo(String nombreCombo, Filtro filtro , double porcentaje, int porcentajeMaximo){  //constructor con filtro
        super(nombreCombo);
        productos = new ArrayList<>();
        this.porcentaje = porcentaje;
        this.porcentajeMaximo = porcentajeMaximo;
        this.filtro = filtro;
    }


    public void addProductoACombo(ElementoBazar producto){
        if (filtro == null || filtro.cumple(producto) && !productos.contains(producto)){ //si no lo tiene lo agrega
            productos.add(producto);
        }
    }

    public double getMenorPeso(){
        double menorPeso = 1000000000;
        for(ElementoBazar elem: productos){
            double pesoActual = elem.getPeso();
            if (pesoActual < menorPeso){
                menorPeso = pesoActual;
            }

        }
        return menorPeso;
    }

    @Override
    public int getPrecio() {
        int precioTotal = 0;

        if (porcentaje > porcentajeMaximo){
            porcentaje = porcentajeMaximo;
        }
        for (ElementoBazar elem : productos){
            precioTotal += elem.getPrecio() - (elem.getPrecio() * porcentaje / 100);
        }
        return precioTotal;
    }

    @Override
    public boolean contieneCategoria(String categoria) {
        for (ElementoBazar elem : productos){
            if (elem.contieneCategoria(categoria)){
                return true;
            }
        }
        return false;
    }

    @Override
    public double getPeso() {
        double pesoTotal = 0;
        for (ElementoBazar elem : productos){
            pesoTotal += elem.getPeso();
        }
        return pesoTotal;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categoriasDeCombo = new ArrayList<>();
        for(ElementoBazar elem : this.productos){
            categoriasDeCombo.addAll(elem.getCategorias());
        }
        return categoriasDeCombo;
    }

    @Override
    public int getCantidad() {
        int cantidadTotal = 0;
        for (ElementoBazar elem : productos){
            cantidadTotal += elem.getCantidad();
        }
        return cantidadTotal;
    }

    @Override
    public ArrayList<ElementoBazar> buscar(Filtro filtro) {
        ArrayList<ElementoBazar> retorno = new ArrayList<>();
        if (filtro.cumple(this)){
            retorno.add(this);
        }
        else {
            for (ElementoBazar elem: productos){
                retorno.addAll(elem.buscar(filtro));
            }
        }
        return retorno;
    }
}
