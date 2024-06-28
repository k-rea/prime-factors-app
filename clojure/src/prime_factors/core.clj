(ns prime-factors.core
  (:gen-class))


(defn prime-factors-of [n]
  (if (> n 1)
    (if (zero? (mod n 2))
      (cons 2 (prime-factors-of (quot n 2)))
      [n])
    []))