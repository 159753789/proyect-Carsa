package pe.uni.fiis.catalogo.model.bean;

/**
 * Created by Esther on 16/05/2015.
 */
public class DetalleProducto {
    private String idDetalle;
    private Integer idProducto;
    private String idCategoriaTipo;
    private String valorCategoria;

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdCategoriaTipo() {
        return idCategoriaTipo;
    }

    public void setIdCategoriaTipo(String idCategoriaTipo) {
        this.idCategoriaTipo = idCategoriaTipo;
    }

    public String getValorCategoria() {
        return valorCategoria;
    }

    public void setValorCategoria(String valorCategoria) {
        this.valorCategoria = valorCategoria;
    }
}
