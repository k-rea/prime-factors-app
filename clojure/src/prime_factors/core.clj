(ns prime-factors.core
  (:gen-class))


(defn prime-factors-of [n]
  (if (> n 1) [n] []))