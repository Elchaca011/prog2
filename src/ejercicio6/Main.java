package ejercicio6;

import ejercicio6.filtros.FiltroXCategoria;
import ejercicio6.filtros.FiltroXPrecio;

public class Main {
    public static void main(String[] args) {
        Bazar bazar = new Bazar("Bazar juancito");

        ProductoIndividual producto1 = new ProductoIndividual("taza1",5.2, 20 );
        ProductoIndividual producto2 = new ProductoIndividual("plato",2.2, 15);
        ProductoIndividual producto3 = new ProductoIndividual("cuadro",1.8, 70);
        ProductoIndividual producto4 = new ProductoIndividual("taza2",4.2, 40);

        producto1.addCategoria("cocina");
        producto1.addCategoria("utensillo");
        producto2.addCategoria("cocina");
        producto2.addCategoria("utensillo");
        producto3.addCategoria("decoracion");
        producto4.addCategoria("cocina");
        producto4.addCategoria("utensillo");

        Combo comboCocina = new Combo("combos de cocina", new FiltroXCategoria("cocina"),
                                            90, 50);

        Combo comboDecoracion = new Combo("Combo decoracion", new FiltroXCategoria("decoracion"),
                                                1.4, 50);

        Combo comboDeTodo = new Combo("Combo general");

        comboCocina.addProductoACombo(producto1);
        comboCocina.addProductoACombo(producto2);
        comboCocina.addProductoACombo(producto3);
        comboCocina.addProductoACombo(producto4);

        comboDecoracion.addProductoACombo(producto3);

        comboDeTodo.addProductoACombo(comboCocina);
        comboDeTodo.addProductoACombo(comboDecoracion);

        bazar.addStock(comboDeTodo);


        System.out.println("Cantidad de productos de un combo:");
        System.out.println(bazar.getCantidadProductosCombo(comboCocina));
        System.out.println(bazar.getCantidadProductosCombo(comboDecoracion));
        System.out.println(bazar.getCantidadProductosCombo(comboDeTodo));

        System.out.println("El menor producto de un combo:");
        System.out.println(bazar.getProductoMenorPesoCombo(comboDeTodo));

        System.out.println("precios");
        System.out.println(comboCocina.getPrecio());

        System.out.println("Filtros:");
        System.out.println(comboDeTodo.buscar(new FiltroXPrecio(80)));
        System.out.println(bazar.buscar(new FiltroXPrecio(80)));

        ComboPagoUno comboEspecial = new ComboPagoUno("combo paga uno");

        comboEspecial.addProductoACombo(producto1);
        comboEspecial.addProductoACombo(producto2);
        comboEspecial.addProductoACombo(producto3);

        System.out.println(comboEspecial.getPrecio());

    }
}
