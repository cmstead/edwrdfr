(ns edwrdfr.core
  (:gen-class)
  (:require [clojure.string :as str :refer [blank?]]
            [edwrdfr.help :as help]
            [edwrdfr.util :as util]))

(defn update-strings [args]
  (let [vowel-set (util/build-vowels args)]
    (map (partial util/remove-pattern vowel-set)
         (util/get-arg-set args vowel-set))))

(defn build-value-str

  ([value-vector]
  (build-value-str "" value-vector))

  ([output-value value-vector]
  (if (seq value-vector)
    (build-value-str (str output-value (first value-vector) " ") (rest value-vector))
    (identity output-value))))

(defn -main [& args]
  (if (help/check-help-switch args)
    (help/help)
    (-> (update-strings args) (build-value-str) (println))))