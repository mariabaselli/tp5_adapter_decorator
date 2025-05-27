package Ejercicio4;

public class Builder {
    private Combo combo;

    //Necesito si o si el concreto
    //Tiene que tener lo minimo que es la clase concreta
    public Builder(Basico comboBasico) {
        this.combo=comboBasico;
    }

    //tiene que retornarse a si mismo asi podemos encadenar
    // con las clases que van decorando
    public Builder conTomate(){
        this.combo = new ConTomate(combo);
        return this;
    }

    public Builder conQueso(){
        this.combo = new ConQueso(combo);
        return this;
    }

    public Builder conPapas(){
        this.combo = new ConPapas(combo);
        return this;
    }

    //Llamar al método build

    public Combo build() {
        return combo;
    }
}
