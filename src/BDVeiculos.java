import java.util.ArrayList;
import java.util.List;

public final class BDVeiculos {

    private Passeio passeio;
    private Carga carga;

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

    public Passeio excPasseio(Passeio passeio) {
        try {
            Passeio pass1 = consPlacaPasseio(passeio);
            if(pass1 != null){
                listaPasseio.remove(pass1);
                return null;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return passeio;
    }


    public Carga consPlacaCarga(Carga carga) throws VeicExistException{
        for(int i = 0; i < listaCarga.size(); i++){
            if(carga.getPlaca().equals(listaCarga.get(i).getPlaca())){
                return listaCarga.get(i);
            }
        }
        return null;
    }

    public Carga cadCarga(Carga carga) {
        try{
            if(consPlacaCarga(carga) == null){
                listaCarga.add(carga);
                return carga;
            } else {
                return null;
            }
        } catch (VeicExistException e){
            return null;
        }
    }

    public Carga excCarga(Carga carga) {
        try {
            Carga carg1 = consPlacaCarga(carga);
            if(carg1 != null){
                listaCarga.remove(carg1);
                return null;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return carga;
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