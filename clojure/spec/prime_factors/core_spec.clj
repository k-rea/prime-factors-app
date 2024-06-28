(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Prime factors"
          (it "144" (should= [2 2 2 2 3 3] (prime-factors-of 144)))
          (it "125" (should= [5 5 5] (prime-factors-of 125)))
          (it "9" (should= [3 3] (prime-factors-of 9)))
          (it "8" (should= [2 2 2] (prime-factors-of 8)))
          (it "7" (should= [7] (prime-factors-of 7)))
          (it "6" (should= [2 3] (prime-factors-of 6)))
          (it "5" (should= [5] (prime-factors-of 5)))
          (it "4" (should= [2 2] (prime-factors-of 4)))
          (it "3" (should= [3] (prime-factors-of 3)))
          (it "2" (should= [2] (prime-factors-of 2)))
          (it "1" (should= [] (prime-factors-of 1))))
(run-specs)