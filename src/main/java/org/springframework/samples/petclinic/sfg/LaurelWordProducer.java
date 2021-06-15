package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by micheleorben on 14/06/21
 */
@Component
@Primary
public class LaurelWordProducer implements WordProducer {

    @Override
    public String getWord() {
        return "Laurel";
    }
}
