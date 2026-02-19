///usr/bin/env jbang "$0" "$@" ; exit $?

//REPOS mavencentral,acme=https://clojars.org/repo/
//DEPS origami:origami:4.13.0-3-SNAPSHOT
//DEPS org.clojure:clojure:1.11.3

import origami.Origami;
import org.opencv.core.Mat;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;

public class GrabOne {

    public static void main(String[] args) {
    	String output = args.length > 0 ? args[0] : "frame.png";
        Origami.init();
        Mat m = Origami.grabOne();
        imwrite(output, m);
    }
}
