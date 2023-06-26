package imc_calculator;

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

    public void definition(Double imc){
        if(imc(peso,altura)<16){
            System.out.println("Delgadez extrema");
        }
        if(imc(peso,altura)>=16 && imc(peso,altura)<17){
            System.out.println("Delgadez moderada");
        }
        if(imc(peso,altura)>=17 && imc(peso,altura)<18.5){
            System.out.println("Delgadez leve");
        }
        if(imc(peso,altura)>=18.5 && imc(peso,altura)<25){
            System.out.println("Peso normal");
        }
        if(imc(peso,altura)>=25 && imc(peso,altura)<30){
            System.out.println("Sobrepeso");
        }
        if(imc(peso,altura)>=30 && imc(peso,altura)<35){
            System.out.println("Obesidad leve");
        }
        if(imc(peso,altura)>=35 && imc(peso,altura)<40){
            System.out.println("Obesidad moderada");
        }
        if(imc(peso,altura)>=40){
            System.out.println("Obesidad morbida");
        }
    }

}
