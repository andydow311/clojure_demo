(ns demo.atoms)

(defn atomic
      []
      (def amount (atom 100))
      (println @amount)
      (swap! amount inc)
      (println @amount)
      (reset! amount 110)
      (println @amount)
      (compare-and-set! amount 110 124)
      (println @amount)
      )
(atomic)