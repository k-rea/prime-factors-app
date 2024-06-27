(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Prime factors"
          (it "3" (should= [3] (prime-factors-of 3)))
          (it "2" (should= [2] (prime-factors-of 2)))
          (it "1" (should= [] (prime-factors-of 1))))
(run-specs)