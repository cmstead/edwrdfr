(ns edwrdfr.core
  (:gen-class))

(def vowels "a,e,i,o,u");

(defn print-values [value-vector]
  (when (seq value-vector)
    (print (first value-vector) " ")
    (recur (rest value-vector))))

(defn pattern-remover [vowels astr]
  (.replaceAll astr (str "[" vowels "]") ""))

(defn vowel-builder [args]
  (if (= (first args) "-y")
    (str vowels ",y")
    (str vowels)))

(defn update-strings [args]
  (let [vowel-set (vowel-builder args)]
    (map (partial pattern-remover vowel-set)
         (if (= vowels vowel-set)
           (identity args)
           (rest args)))))

(defn -main [& args]
  (let [updated-strings (update-strings args)]
  (print-values updated-strings)
  (println)))