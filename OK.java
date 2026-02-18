///usr/bin/env jbang "$0" "$@" ; exit $?

//REPOS local,mavencentral,acme=https://clojars.org/repo/
//DEPS origami:origami:4.13.0-2-SNAPSHOT
//DEPS org.clojure:clojure:1.11.3
import origami.*;

class Sample00 {

	public static void main(String[] args) {
        Origami.init();
		System.out.printf("Opencv Version: %s\n", org.opencv.core.Core.VERSION);
	}
}
