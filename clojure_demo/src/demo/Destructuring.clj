(ns demo.Destructuring)

(defn Destruct
      []
      (def myVect [1 2 3 4 5])
      (let [[a b c] myVect] (println a b c))
      (let [[a b & rest] myVect] (println a b rest))
      (def myMap {'name "Murphy" 'middlename "Vurnon" 'lastname "Parker"})
      (let [{a 'name b 'middlename c 'lastname} myMap] (println a b c))
      )
(Destruct)
