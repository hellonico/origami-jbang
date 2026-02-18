///usr/bin/env jbang "$0" "$@" ; exit $?

//REPOS mavencentral,acme=https://clojars.org/repo/
//DEPS origami:origami:4.13.0-2-SNAPSHOT
//DEPS org.clojure:clojure:1.11.3
import origami.*;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import origami.Origami;

class HQCamera {
    public static void main(String[] args) throws Exception {
        Origami.init();
        VideoCapture capture = new VideoCapture(0);
        // capture.set(5, 20);
        capture.set(3, 3264);
        capture.set(4, 2448);
        
        if (!capture.isOpened()) {
            System.out.println("Error: Camera not opened!");
            return;
        }
        // sleep to wait for the camera to be open
        Thread.sleep(200);
        // 1966 × 1312 pixels
        
        Mat frame = new Mat();
        capture.read(frame);
        capture.release();
        String filename = "captured_image.png";
        Imgcodecs.imwrite(filename, frame);
        System.out.println("Image captured and saved as: " + filename);
    }
}
