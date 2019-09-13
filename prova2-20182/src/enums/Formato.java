package enums;

public enum  Formato {
    PENTAGONAL("Pentagonal"),
    RETANGULAR("Retangular"),
    CIRCULAR("Circular");

    public String tipo;
    Formato(String formato){
        this.tipo = formato;
    }

    public String getTipo(){
        return this.tipo;
    }

    public static Formato fromString(String tipo){
        if(tipo != null){
            for(Formato f : Formato.values()){
                if(tipo.equalsIgnoreCase(f.tipo))
                    return f;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
