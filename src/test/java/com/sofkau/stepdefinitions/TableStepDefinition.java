package com.sofkau.stepdefinitions;

import com.sofkau.pages.TablePage;
import com.sofkau.setup.WebUi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    public void completaConNombreApellidoEdadCorreoElectronicoSalarioDepartamento(String nombre, String apellido, String edad, String correo, String salario, String departamento) {
        TablePage tablePage=new TablePage(super.driver);
        tablePage.fillMandatoryFields(nombre,apellido,edad,correo,salario,departamento);
    }
    @Then("debe observar una tabla con la informacion ingresada")
    public void debeObservarUnaTablaConLaInformacionIngresada() {

    }
}
