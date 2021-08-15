package ar.com.lili.ferreteria.models.response;

public class GenericResponse {
    public boolean isOk;  //si la operacion fue OK
    public Integer id; //id del objeto que estemos trabajando, si aplica.
    public String message; //mensaje que le queremos dar a front.
}
