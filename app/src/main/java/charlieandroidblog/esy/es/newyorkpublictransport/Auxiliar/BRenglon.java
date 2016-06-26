package charlieandroidblog.esy.es.newyorkpublictransport.Auxiliar;

/**
 * Created by charlito on 6/26/2016.
 */
public class BRenglon {
    private String nombre;
    private int refIcon;

    public BRenglon() {}

    public BRenglon(String nombre, int refIcon) {
        this.nombre = nombre;
        this.refIcon = refIcon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRefIcon() {
        return refIcon;
    }

    public void setRefIcon(int refIcon) {
        this.refIcon = refIcon;
    }
}
