(ns edwrdfr.core
  (:gen-class))

(defn print-values [value-vector]
  (when (seq value-vector)
    (print (first value-vector) " ")
    (recur (rest value-vector))))

(defn devowelizer [astr]
  (.replaceAll astr "[a,e,i,o,u,y]" ""))

(defn -main [& args]
  (let [updated-strings (map devowelizer args)]
    (print-values updated-strings)
    (println)))
