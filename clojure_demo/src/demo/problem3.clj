(ns demo.problem3)

(def buyerAmount (ref 100))
(def merchantAmount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 99})
(def items (ref []))

(defn printInfo
      []
      (println "\nInfo:")
      (println "buyer account:" @buyerAmount)
      (println "merchant account:" @merchantAmount)
      (println "items:" @items)


      )

(defn purchasing
      [item]
      (def itemPrice (get prices item))
      (if (<= itemPrice @buyerAmount)
          (dosync
            (ref-set merchantAmount (+ @merchantAmount itemPrice))
            (ref-set buyerAmount (- @buyerAmount itemPrice))
            (def newItems (cons item @items))
            (ref-set items newItems)
            )
          (println "insufficient monies")
          )
      (printInfo)
      )

(purchasing 'pen)
(purchasing 'notebook)
(purchasing 'backpack)