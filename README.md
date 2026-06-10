# Plataforma de Apoio à Qualidade de Software para Aplicações de Saúde e Bem-Estar

Este repositório contém o desenvolvimento prático e a documentação do **Projeto A3** para a disciplina de **Qualidade de Software**. O foco do projeto é aplicar automação de testes e conceitos de DevOps em um cenário voltado à saúde (Alinhado com as ODS 3 e 9 da ONU).

---

## 🎯 Alinhamento com as ODS (Objetivos de Desenvolvimento Sustentável)
* **ODS 3 - Saúde e Bem-Estar:** O sistema valida parâmetros críticos de saúde, como triagem de glicose e classificação de IMC, garantindo confiabilidade nas informações geradas para o usuário.
* **ODS 9 - Indústria, Inovação e Infraestrutura:** Fomento à inovação tecnológica por meio da aplicação de automação de testes em ambientes de desenvolvimento de software (HealthTechs).

---

## 📋 Canvas da Solução

| Bloco | Conteúdo |
| :--- | :--- |
| **Problema** | Falta de testes estruturados e riscos de segurança/confiabilidade em aplicações de saúde que lidam com dados sensíveis. |
| **Solução** | Plataforma automatizada que executa testes de regras de negócio e validação contínua de código (CI/CD). |
| **Proposta de Valor** | Garantir estabilidade e segurança jurídica no tratamento de dados de saúde por meio de automação inteligente. |
| **Público-Target** | Desenvolvedores de HealthTechs, estudantes e instituições de saúde. |

---

## 🛠️ Estrutura Prática do Projeto

O projeto foi totalmente desenvolvido em **Java** utilizando o framework **JUnit 5** para a automação de testes de caixa branca.

### 🧬 Regras de Negócio Implementadas (`SaudeApp.java`)
* `validarCadastroPaciente`: Validação de integridade de dados na entrada do sistema.
* `calcularClassificacaoIMC`: Algoritmo condicional que classifica o Índice de Massa Corporal.
* `analisarGlicose`: Módulo de triagem preventiva para detecção de níveis de pré-diabetes e diabetes.

### 🧪 Suíte de Testes Unitários (`SaudeAppTest.java`)
Foram mapeados **7 cenários de testes de caixa branca** cobrindo todos os caminhos lógicos (`if/else`) das funções de saúde, garantindo 100% de cobertura no código crítico da aplicação.

---

## 📈 Aplicação dos Conceitos de Qualidade de Software

* **Métricas de Código:** O projeto foca em manter a *Complexidade Ciclomática* baixa através de funções curtas e fáceis de testar.
* **Esteira de DevOps (CI/CD):** Arquitetura desenhada para rodar a suíte de testes JUnit de forma automatizada a cada novo `git push`.
* **Conformidade ISO 9126:** Foco direto nas características de **Confiabilidade** (tolerância a falhas nos cálculos) e **Segurança** (validação de dados).

---

## 🚀 Como Executar os Testes

1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git](https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git)
   ## 🏃‍♂️ Passo a Passo para Subir no GitHub Agora

Se você já tem o Git instalado no computador, abra o terminal dentro da pasta onde estão os 3 arquivos e rode estes comandos em sequência:

```bash
# 1. Inicializa o repositório local
git init

# 2. Adiciona todos os arquivos (os códigos Java e o README)
git add .

# 3. Salva a primeira versão do projeto
git commit -m "Commit final: Projeto A3 Qualidade de Software"

# 4. Cria a branch principal
git branch -M main

# 5. Conecta com o repositório que você criou no site do GitHub
# (Substitua o link abaixo pelo link do repositório vazio que você criar no seu perfil)
git remote add origin https://github.com/SEU-USUARIO/NOME-DO-SEU-REPOSITORIO.git

# 6. Sobe os arquivos para o GitHub
git push -u origin main
