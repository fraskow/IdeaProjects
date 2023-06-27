package org.example.imc_calculator;

public class ImcCalculator {

    private Double peso;
    private Double altura;

    public ImcCalculator(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double imc(Double peso,Double altura){
        return peso/(Math.pow(altura,2));
    }

    public String definition(Double imc){
        if(imc(peso,altura)<16){
            return "Delgadez extrema";
        }
        if(imc(peso,altura)>=16 && imc(peso,altura)<17){
            return "Delgadez moderada";
        }
        if(imc(peso,altura)>=17 && imc(peso,altura)<18.5){
            return "Delgadez leve";
        }
        if(imc(peso,altura)>=18.5 && imc(peso,altura)<25){
            return "Peso normal";
        }
        if(imc(peso,altura)>=25 && imc(peso,altura)<30){
            return "Sobrepeso";
        }
        if(imc(peso,altura)>=30 && imc(peso,altura)<35){
           return "Obesidad leve";
        }
        if(imc(peso,altura)>=35 && imc(peso,altura)<40){
            return "Obesidad moderada";
        }
            return "Obesidad morbida";
    }

}
