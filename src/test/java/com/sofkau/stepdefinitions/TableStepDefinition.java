package com.sofkau.stepdefinitions;

import com.sofkau.pages.TablePage;
import com.sofkau.setup.WebUi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static com.sofkau.pages.CommonActionOnPages.datosIngresados;

public class TableStepDefinition extends WebUi {

    @Given("el administrador esta en la pagina principal")
    public void elAdministradorEstaEnLaPaginaPrincipal() {
        generalSetup();
    }
    @When("navega hasta la opcion de elementos en la opcion Web tables")
    public void navegaHastaLaOpcionDeElementosEnLaOpcionWebTables() {
        TablePage formPage=new TablePage(super.driver);
        formPage.navigatePage();
    }
    @When("completa con nombre {string}, apellido {string}, edad {string}, correo electronico {string}, salario {string}, departamento {string}")
    public void completaConNombreApellidoEdadCorreoElectronicoSalarioDepartamento(String nombre, String apellido, String edad, String correo, String salario, String departamento) throws InterruptedException {
        TablePage tablePage=new TablePage(super.driver);
        //Thread.sleep(5000);
        tablePage.fillMandatoryFields(nombre,apellido,edad,correo,salario,departamento);
    }
    @Then("debe observar una tabla con la informacion ingresada")
    public void debeObservarUnaTablaConLaInformacionIngresada() throws InterruptedException {
        try {
            Assertions.assertEquals(TablePage.datosIngresados,TablePage.datosTable);
        }
        catch (Exception exception){
            Assertions.fail(exception.getMessage(),exception);
        }finally {
            Thread.sleep(1000);
            quiteDriver();
        }
    }
}
