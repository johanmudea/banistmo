package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static steps.OpenLandingPage.openLandingPage;
import static task.Validar.validar;

public class validar extends Setup {
    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() {

        actorSetupTheBrowser("Johan");
        theActorInTheSpotlight().wasAbleTo(openLandingPage());

    }

    @When("add items to cart")
    public void addItemsToCart() {


        theActorInTheSpotlight().attemptsTo(
                validar()
        );


    }

    @When("delete one of them")
    public void deleteOneOfThem() {

    }

    @Then("the user will see the value of remaining item")
    public void theUserWillSeeTheValueOfRemainingItem() {

    }

}
