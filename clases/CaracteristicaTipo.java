package pe.uni.fiis.catalogo.model.bean;

/**
 * Created by Esther on 16/05/2015.
 */
public class CaracteristicaTipo {
    private Integer idCaracteristicaTipo;
    private Integer caracteristica;
    private Integer idTipoProducto;

    public Integer getIdCaracteristicaTipo() {
        return idCaracteristicaTipo;
    }

    public void setIdCaracteristicaTipo(Integer idCaracteristicaTipo) {
        this.idCaracteristicaTipo = idCaracteristicaTipo;
    }

    public Integer getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Integer caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }
}
