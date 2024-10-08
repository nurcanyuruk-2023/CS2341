/******************************************************************************
 *  Compilation:  javac CollidingDisks.java
 *  Execution:    java CollidingDisks n
 *
 *  Simulates the motion of n hard disks, subject to the laws of elastic
 *  collisions. This program is designed to verify that algs4.jar has been correctly integrated.
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.CollisionSystem;
import edu.princeton.cs.algs4.Particle;
import edu.princeton.cs.algs4.StdDraw;

public class CollidingDisks {
    public static void main(String[] args) {
        int n = 20;  // number of particles (default 20)
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        }

        // enable double buffering to support animations
        StdDraw.enableDoubleBuffering();

        // create the n particles
        Particle[] particles = new Particle[n];
        for (int i = 0; i < n; i++) {
            particles[i] = new Particle();
        }

        // simulate the system
        CollisionSystem system = new CollisionSystem(particles);
        system.simulate(Double.POSITIVE_INFINITY);
    }
}
