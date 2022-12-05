import java.util.ArrayList;
import java.util.List;

public final class BDVeiculos {

    private List<Passeio> listaPasseio = new ArrayList<>();
    private List<Carga> listaCarga = new ArrayList<>();

    BDVeiculos() {
        listaPasseio = new ArrayList<>();
        listaCarga = new ArrayList<>();
    }

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }
    
    public boolean existePasseio(String placa) throws VeicExistException {
        for(int i = 0; i < getListaPasseio().size(); i++){
            if(getListaPasseio().get(i).getPlaca().equalsIgnoreCase(placa)){
                return true;
            }
        }
        return false;
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public boolean existeCarga(String placa) throws VeicExistException {
        for(int i = 0; i < getListaCarga().size(); i++){
            if(getListaCarga().get(i).getPlaca().equalsIgnoreCase(placa)){
                return true;
            }
        }
        return false;
    }
}