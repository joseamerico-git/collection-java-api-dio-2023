package Set;
import java.util.Objects;


public class Convidado {
    private String nome;
    
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    


    public String getNome() {
        return this.nome;
    }

    

    public int getCodigoConvite() {
        return this.codigoConvite;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" +
            "}";
    }
   
//criar os método equals and hashcode.

@Override()
public boolean equals(Object c){
    if(this==c) return true;
    if(!(c instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
    
}
@Override
public int hashCode(){
    return Objects.hash(getCodigoConvite());
}


}
