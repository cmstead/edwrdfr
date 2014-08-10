(ns edwrdfr.core
  (:gen-class)
  (:require [clojure.string :as str :refer [blank?]]
            [edwrdfr.help :as help]
            [edwrdfr.util :as util]))

(defn update-strings [args]
  (let [vowel-set (util/vowel-builder args)]
    (map (partial util/pattern-remover vowel-set)
         (util/get-arg-set args vowel-set))))

(defn print-values [value-vector]
  (when (seq value-vector)
    (print (first value-vector) " ")
    (recur (rest value-vector))))

(defn edwrdfy [args]
  (let [updated-strings (update-strings args)]
    (print-values updated-strings)
    (println)))

(defn -main [& args]
  (if (or (not (seq args)) (= (first args) "-h"))
    (help/help)
    (edwrdfy args)))