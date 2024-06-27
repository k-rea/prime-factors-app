(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Prime factors"
          (it "1" (should= [] (prime-factors-of 1))))
(run-specs)