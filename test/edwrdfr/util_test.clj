(ns edwrdfr.util-test
  (:require [clojure.test :refer :all]
            [edwrdfr.util :refer :all]))

(deftest test-build-vowels-standard
  (testing "This should return 'aeiou'"
    (is (= (build-vowels ["string" "value"]) "aeiou"))))

(deftest test-build-vowels-y-removal
  (testing "This should return 'aeiouy'"
    (is (= (build-vowels ["-y" "value"]) "aeiouy"))))

(deftest test-remove-pattern
  (testing "This should return 'tstng'"
    (is (= (remove-pattern "aeiou" "testing") "tstng"))))

(deftest test-get-arg-set-standard
  (testing "This should return ['test' 'value']"
    (is (= (get-arg-set ["test" "value"] "aeiou") ["test" "value"]))))

(deftest test-get-arg-set-y-removal
  (testing "This should return ['test' 'value']"
    (is (= (get-arg-set ["-y" "test" "value"] "aeiouy") ["test" "value"]))))
