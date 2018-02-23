// Test confilct merge

// Ceci est le code de jérémie
<<<<<<< Updated upstream
public class MatrixXorOperator extends MatrixOperator {

    public boolean operate(final boolean x, final boolean y) {
        return x ^ y;
=======
// Modifié par Jérémie
public class MatrixXorOperator extends MatrixOperator {

    public boolean operate(final boolean x, final boolean y) {
        return x / y;
>>>>>>> Stashed changes
    }
}