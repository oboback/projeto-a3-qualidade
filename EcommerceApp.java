public class EcommerceApp {
    public double calcularFrete(double distanciaKm, double valorPedido) {
        if (distanciaKm < 0 || valorPedido < 0) {
            throw new IllegalArgumentException("Valores de distância e pedido não podem ser negativos.");
        }

        
        if (valorPedido >= 250.00) {
            return 0.0;
        }

        if (distanciaKm <= 50) {
            return 15.00;
        } else if (distanciaKm <= 150) {
            return 30.00;
        } else {
            return 50.00;
        }
    }

    
    public double aplicarCupomDesconto(double valorOriginal, String cupom) {
        if (valorOriginal <= 0) {
            throw new IllegalArgumentException("O valor original deve ser maior que zero.");
        }

        if (cupom == null || cupom.trim().isEmpty()) {
            return valorOriginal;
        }

        String cupomNormalizado = cupom.toUpperCase().trim();

        if (cupomNormalizado.equals("PROMO10")) {
            return valorOriginal * 0.90; 
        } else if (cupomNormalizado.equals("VIP30") && valorOriginal >= 200) {
            return valorOriginal * 0.70; 
        } else if (cupomNormalizado.equals("VIP30")) {
            return valorOriginal - 20.00; 
        }

        return valorOriginal; 
    }
}
    }
}
