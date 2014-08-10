(ns edwrdfr.core
  (:gen-class)
  (:require [clojure.string :as str :refer [blank?]]))

(def vowels "aeiou");

(defn pattern-remover [vowel-set astr]
  (str/replace astr
               (-> (str "[" vowel-set "]") (re-pattern))
               ""))

(defn vowel-builder [args]
  (if (= (first args) "-y")
    (str vowels "y")
    (str vowels)))

(defn get-arg-set [args vowel-set]
  (if (= vowels vowel-set)
    (identity args)
    (rest args)))

(defn update-strings [args]
  (let [vowel-set (vowel-builder args)]
    (map (partial pattern-remover vowel-set)
         (get-arg-set args vowel-set))))

(defn print-values [value-vector]
  (when (seq value-vector)
    (print (first value-vector) " ")
    (recur (rest value-vector))))

(defn -main [& args]
  (let [updated-strings (update-strings args)]
  (print-values updated-strings)
  (println)))