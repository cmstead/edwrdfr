(defproject edwrdfr "0.1.0-SNAPSHOT"
  :description "A vowel remover. It removes lower-case vowels."
  :url "http://www.chrisstead.com"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot edwrdfr.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
