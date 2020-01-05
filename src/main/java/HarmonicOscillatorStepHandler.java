import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

import java.util.ArrayList;
import java.util.List;

public class HarmonicOscillatorStepHandler implements StepHandler {


    // ArrayListy do zapamiętanie wartości pośrednich

    protected List<Double> tValues= new ArrayList<>();
    protected  List<Double> xValues = new ArrayList<>();


    @Override
    public void init(double t0, double[] x0, double t) {
        tValues.add(t);
        xValues.add(x0[0]);

    }

    @Override
    public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {

        double t= interpolator.getCurrentTime();
        double [] x = interpolator.getInterpolatedState();
        tValues.add(t);
        xValues.add(x[0]);
    }
}
