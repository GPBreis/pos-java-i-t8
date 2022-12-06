import java.util.ArrayList;
import java.util.List;

public final class BDVeiculos {

    private Passeio passeio;

    private List<Passeio> listaPasseio = new ArrayList<>();
    private List<Carga> listaCarga = new ArrayList<>();

    private static BDVeiculos bdVeiculosUnico;

    BDVeiculos() {
        
    }

    public static BDVeiculos getBdVeiculos(){
        if(bdVeiculosUnico == null) {
            bdVeiculosUnico = new BDVeiculos();
        }
        return bdVeiculosUnico;
    }

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }
    
    public Passeio cadPasseio(Passeio passeio) {
        try{
            if(consPlacaPasseio(passeio) == null){
                listaPasseio.add(passeio);
                return passeio;
            } else {
                return null;
            }
        } catch (VeicExistException e){
            return null;
        }
    }

    public Passeio consPlacaPasseio(Passeio pass) throws VeicExistException{
        for(int i = 0; i < listaPasseio.size(); i++){
            if(pass.getPlaca().equals(listaPasseio.get(i).getPlaca())){
                return listaPasseio.get(i);
            }
        }
        return null;
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