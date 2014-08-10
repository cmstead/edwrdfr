(ns edwrdfr.core
  (:gen-class)
  (:require [clojure.string :as str :refer [blank?]]
            [edwrdfr.help :as help]
            [edwrdfr.util :as util]))

(defn update-strings [args]
  (let [vowel-set (util/build-vowels args)]
    (map (partial util/remove-pattern vowel-set)
         (util/get-arg-set args vowel-set))))

(defn print-values [value-vector]
  (if (seq value-vector)
    (do
      (print (first value-vector) " ")
      (recur (rest value-vector)))
    (println)))

(defn edwrdfy [args]
  (-> (update-strings args) (print-values)))

(defn -main [& args]
  (if (or (not (seq args)) (= (first args) "-h"))
    (help/help)
    (edwrdfy args)))