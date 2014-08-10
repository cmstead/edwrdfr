(ns edwrdfr.core-test
  (:require [clojure.test :refer :all]
            [edwrdfr.core :refer :all]
            [edwrdfr.help :as help :refer :all]
            [edwrdfr.util :as util :refer :all]))

(deftest test-main-no-args
  (with-redefs-fn {#'help/help (fn [] true)}
    #(is (-main))))

(deftest test-main-help-arg
  (with-redefs-fn {#'help/help (fn [] true)}
    #(is (-main "-h"))))

(deftest test-build-value-str
  (is (= (build-value-str "" ["test" "value"]) "test value ")))

(deftest test-build-value-str-single-arity
  (is (= (build-value-str ["test" "value"]) "test value ")))

(deftest test-update-strings-standard-mode
  (is (= (update-strings ["my" "test" "value"]) ["my" "tst" "vl"])))

(deftest test-update-strings-y-removal-mode
  (is (= (update-strings ["-y" "my" "test" "value"]) ["m" "tst" "vl"])))