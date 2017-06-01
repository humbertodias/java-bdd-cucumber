package cucumber.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.model.Account;
import cucumber.model.Bank;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BankSteps {

    private Bank banco;
    private int totalContas;
    private Double totalDinheiro;

    @Given("^que as contas sao do \"(.*?)\"$")
    public void que_as_contas_sao_do(String nome, List<Account> listaDeContas) throws Throwable {
        // Definição do banco e associando as contas
        banco = new Bank(nome, listaDeContas);
    }

    @Given("^o calculo do total de contas criadas$")
    public void o_calculo_do_total_de_contas_criadas() throws Throwable {
        totalContas = banco.getListaDeContas().size();
    }

    @Then("^o total de contas e (\\d+)$")
    public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
        assertEquals("O cálculo do total de contas está incorreto", totalContasEsperado, totalContas);
    }

    @Given("^o calculo do total de dinheiro$")
    public void o_calculo_do_total_de_dinheiro() throws Throwable {
        totalDinheiro = banco.getListaDeContas().stream().mapToDouble(c -> c.getSaldo()).sum();
    }

    @Then("^o total de dinheiro no banco e (\\d+)$")
    public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado) throws Throwable {

        assertEquals("O cálculo do total de dinheiro no banco " + banco.getNome() + " está incorreto",
                totalDinheiroEsperado, totalDinheiro);
    }
}