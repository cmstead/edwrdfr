(ns edwrdfr.help
  (:gen-class))

(defn check-help-switch [args]
  (or
    (empty? args)
    (= (first args) "-h")))

(defn help []
  "I hated looking at this in the core file, so I moved it."
  (println)
  (println "Edwrdfr (pronounced Ed - word - eh -fir) is a vowel removal utility.")
  (println "Running in standard mode will remove all lower-case vowels from a")
  (println "provided set of strings. 'Y' is not considered a vowel in standard")
  (println "mode.")
  (println)
  (println "====================================================================")
  (println)
  (println "Options")
  (println)
  (println "-h    Outputs Edwrdfr help information")
  (println "-y    Enables y-removal mode")
  (println)
  (println "====================================================================")
  (println)
  (println "Examples")
  (println)
  (println "Standard Mode")
  (println)
  (println "java -jar edwrdfr.jar My new string")
  (println "Output: My nw strng")
  (println)
  (println "Y-removal mode")
  (println)
  (println "java -jar edwrdfr.jar My new string")
  (println "Output: M nw strng")
  (println))