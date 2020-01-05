import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;

import java.util.Arrays;

public class ODETester {

    public static void main(String[] args) {
        HarmonicOscillator oscillator= new HarmonicOscillator(1.0);
        FirstOrderIntegrator eulerIntegrator= new EulerIntegrator(0.001);
        double [] xStart= {1.,0};
        double [] xStop = {0.,0.};
        HarmonicOscillatorStepHandler harmonicOscillatorStepHandler = new HarmonicOscillatorStepHandler();
        eulerIntegrator.addStepHandler(harmonicOscillatorStepHandler);

        eulerIntegrator.integrate(oscillator,0,xStart,Math.PI*2,xStop);

        System.out.println(Arrays.toString(xStart));
        System.out.println(Arrays.toString(xStop));

        System.out.println(harmonicOscillatorStepHandler.xValues);


    }

}
