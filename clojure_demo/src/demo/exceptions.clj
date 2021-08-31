(ns demo.exceptions)

(defn ExHandling
      [x]
      (try
        (inc x)
        (catch ClassCastException e (println "EXCEPTION: " (.getMessage e)))
        (catch Exception e (println "caught generic expression"))
        (finally (println x " baby!!")))
      )

(ExHandling "hello ")
