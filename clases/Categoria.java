package pe.uni.fiis.catalogo.model.bean;

/**
 * Created by Esther on 16/05/2015.
 */
public class Categoria {
    private String nombreCategoria;
    private String idCategoria;
    private String idCategoriaSuperior;

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdCategoriaSuperior() {
        return idCategoriaSuperior;
    }

    public void setIdCategoriaSuperior(String idCategoriaSuperior) {
        this.idCategoriaSuperior = idCategoriaSuperior;
    }
}

