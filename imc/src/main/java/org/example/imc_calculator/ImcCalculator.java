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

    public String definition(Double imc) {
        if (imc < 16) {
            return "Delgadez extrema";
        }
        if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        }
        if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        }
        if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        }
        if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        }
        if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        }
        if (imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        }
        return "Obesidad morbida";
    }

}
