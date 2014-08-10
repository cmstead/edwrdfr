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

(deftest test-main-args
  (with-redefs-fn {#'edwrdfy (fn [x] true)}
    #(is (-main "blah"))))

(deftest test-update-strings-standard-mode
  (is (= (update-strings ["my" "test" "value"]) ["my" "tst" "vl"])))

(deftest test-update-strings-y-removal-mode
  (is (= (update-strings ["-y" "my" "test" "value"]) ["m" "tst" "vl"])))