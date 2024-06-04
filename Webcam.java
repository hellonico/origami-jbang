///usr/bin/env jbang "$0" "$@" ; exit $?

//REPOS mavencentral,acme=https://clojars.org/repo/
//DEPS origami:origami:4.9.0-6
//DEPS org.clojure:clojure:1.11.3

import origami.*;

class Sample01 {

	public static void main(String[] args) {
		// works on mac
        Origami.init();
		new origami.Camera().run();
	}
}

