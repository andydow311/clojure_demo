(ns demo.conditionals)

(defn CondIf
      []
      (println "\nCondIf:")
      (if (= 4 4)
          (println "equals")
          (println "not equals")
          )
      )

(CondIf)

(defn CondIfDo
      []
      (println "\nCondIfDo:")
      (if (= 4 6)
          (do(println "equals first statement")
             (println "equals second statement"))
          (do(println "not equals first statement")
             (println "not equals second statement"))
          )
      )

(defn CondNestedIf
      []
      (println "\nNestedIf:")
      (if (and (= 5 7 ) (or (= 2 2) (not true)))
          (println "true")
          (println "false")
          )
      )
(defn CondCase
      [pet]
      (println "\nCaseIf:")
      (case pet
            "cat" (println "I have a cat")
            "dog" (println "I have a dog")
            "fish" (println "I have a fish") )
      )

(defn CondCond
      [amount]
      (println "\nCaseIf:")
      (cond
        (<= amount 2) (println "Few")
        (<= amount 10) (println "Several")
        (<= amount 100) (println "Many")
        :else (println "Lots of Stuff"))
      )

(CondIf)
(CondIfDo)
(CondNestedIf)
(CondCase "dog")
(CondCond 11)