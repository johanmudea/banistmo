package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class ValidarQ implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }

    public static ValidarQ validarQ(){
        return new ValidarQ();
    }

}
