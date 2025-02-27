package solver;

import model.Direction;
import model.SoldierState;
import puzzle.solver.BreadthFirstSearch;

public class Main {
    public static void main(String[] args) {
        var bfs = new BreadthFirstSearch<Direction>();
        bfs.solveAndPrintSolution(new SoldierState());
    }
}
