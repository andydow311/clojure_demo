(ns demo.loops
    (:import (com.sun.org.omg.CORBA AttrDescriptionSeqHelper)))

(defn looper
      []
      (println "\nLoop")
      (loop [x,0]
            (when (< x 10)
                  (println x)
                  (recur (inc x)))
            ))

(looper)

(defn DoTimes
      []
      (println "\nDoTimes")
      (dotimes [x 10]
            (println x)
            ))
(DoTimes)

(defn WhileDo
      [count]
      (println "\nWhileDo")
      (def x (atom 0))
      (while (< @x count)
        (do
          (println @x)
          (swap! x inc))))

(WhileDo 10)

(defn DoSeq
      [seq]
      (println "\nDoSeq")
      (doseq [x seq] (println (inc x)))
      )

(DoSeq [6 3 5 8 4 2 6])