(ns spec-check-bug.core-test
  (:require [clojure.test :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]
            [spec-check-bug.core :refer :all]))

(defn inc [x] "TODO")

(s/fdef inc :args (s/cat :x int?))

(deftest a-test
  (is (doall (stest/check `inc))))
