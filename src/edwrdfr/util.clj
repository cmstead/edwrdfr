(ns edwrdfr.util
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

