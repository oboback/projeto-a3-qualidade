public class SaudeApp {
    public boolean validarCadastroPaciente(String nome, int idade, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do paciente é obrigatório.");
        }
        if (idade <= 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida para cadastro.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail em formato inválido.");
        }
        return true;
    }

    public String calcularClassificacaoIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }
        
        double imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String analisarGlicose(int taxaGlicose) {
        if (taxaGlicose <= 0) {
            throw new IllegalArgumentException("Taxa de glicose inválida.");
        }

        if (taxaGlicose < 100) {
            return "Normal";
        } else if (taxaGlicose <= 125) {
            return "Pré-diabetes";
        } else {
            return "Diabetes";
        }
    }
}
