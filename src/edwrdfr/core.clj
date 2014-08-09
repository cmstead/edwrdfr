(ns edwrdfr.core
  (:gen-class))

(defn -main
  "I remove lower case vowels. That's it."
  [& args]

  (defn print-values [value-vector]
    (when (> (count value-vector) 0)
      (print (first value-vector) " ")
      "prints first value in passed vector")
    (when (> (count value-vector) 1)
      (print-values (rest value-vector))
      "Recurse when there are more values to display"))

  (defn devowelizer [astr]
    (.replaceAll astr "[a,e,i,o,u,y]" ""))

  (def updated-strings (map devowelizer args))

  (print-values updated-strings)
  (println))
