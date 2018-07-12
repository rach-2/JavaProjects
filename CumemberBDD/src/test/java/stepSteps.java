import static junit.framework.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;

public class stepSteps
{
    private stackExample myStack;
    private Object pushed;
    private Object popped;

    @Given("^an empty stack$")
    public void an_empty_stack() {
        myStack = new stackExample();
    }


    @Given("^a full stack$")
    public void a_full_stack()  {
        // Write code here that turns the phrase above into concrete actions
         myStack = new stackExample();
         pushed = new Object();
         //popped = pushed;
         myStack.push(pushed);
        // myStack.pop();

    }

    @When("^I pop from the stack$")
    public void I_pop_from_the_stack() {
        Object out = myStack.pop();
        popped = out;
    }

    @When("^I push another item into the stack$")
    public void I_push_another_item_into_the_stack()
    {
        I_push_an_item_into_the_stack();
    }

    @When("^I push an item into the stack$")
    public void I_push_an_item_into_the_stack() {
        pushed = new Object();
        myStack.push(pushed);
    }

    @Then("^I get the same item back$")
    public void I_get_the_same_item_back() {
        assertEquals(pushed, popped);
    }

    @Then("^the stack contains one item$")
    public void the_stack_contains_one_item() {
        assertEquals(1, myStack.size());
    }


    @Then("^the stack contains two items$")
    public void the_stack_contains_two_items() {
        assertEquals(2, myStack.size());
    }
}
