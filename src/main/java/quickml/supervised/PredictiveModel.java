package quickml.supervised;

import java.io.Serializable;

/**
 * A predictive model, typically created by a supervised learning algorithm.
 * Given a set of attributes, will generate a prediction.
 */
public interface PredictiveModel<A, P> extends Serializable {

    P predict(A attributes);
    void dump(Appendable appendable);
}