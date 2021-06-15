package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

/**
 * Created by micheleorben on 14/06/21
 */

@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIHeard() {
        String word = wordProducer.getWord();
        System.out.println(word);
        return word;
    }
}
