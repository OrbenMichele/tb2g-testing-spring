package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Component;

/**
 * Created by micheleorben on 14/06/21
 */
@Component
public class YannyWordProducer implements WordProducer {

    @Override
    public String getWord() {
        return "Yanny";
    }
}
