(ns demo.sequences)

(defn Sequences
      []
      (def colours (seq ["R", "G", "B"]))
      (println colours)
      (println (cons "Y" colours))
      (println (cons colours "Y"))
      (println (conj colours "Y"))
      (println (conj ["R", "G", "B"] "Y"))
      (println (concat colours (seq ["W", "P", "L"])))
      (println (reverse colours))
      (println (first colours))
      (println (rest colours))
      (println (last colours))
      (println (sort (seq [1 2 3 4 5 6 4 7 8 3 1 2])))
      )

(Sequences)