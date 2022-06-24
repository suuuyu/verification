package verification.experiment;

import verification.experiment.autosar4.Experiment4_3;

import java.io.IOException;

public class Executor {
    public static void main(String[] args) throws IOException {
        Experiment e = new Experiment4_3();
        e.execute(true, false, true, 1);
    }
}
