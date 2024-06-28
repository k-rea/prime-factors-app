(ns prime-factors.core
  (:gen-class))


(defn prime-factors-of [n]
    (loop [n n
           divisor 2
           factors []]
      (if (> n 1)
        (if (zero? (mod n divisor))
          (recur (quot n divisor) divisor (conj factors divisor))
          (recur n (inc divisor) factors))
        factors)))