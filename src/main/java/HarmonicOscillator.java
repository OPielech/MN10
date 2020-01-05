import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class HarmonicOscillator implements FirstOrderDifferentialEquations {

    private double omega2;

    public HarmonicOscillator(double omega2) {
        this.omega2 = omega2;
    }

    @Override
    public int getDimension() {
        return 2; //rzad rownania rozniczkowego
    }

    @Override
    public void computeDerivatives(double t, double[] x, double[] dxdt) throws MaxCountExceededException, DimensionMismatchException {
        dxdt[0]=x[1];
        dxdt[1] = -omega2*x[0];



    }
}
