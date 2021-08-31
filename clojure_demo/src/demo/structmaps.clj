(ns demo.structmaps)

(defn pets
      []
      (defstruct pet :type :name)
      (def myPet (struct pet "dog" "Murphy"))
      (println myPet)

      (def myOtherPet (struct-map pet :petName "Layla" :petType "Hound" ))
      (println myOtherPet)
      (println :name myPet)
      (println :petName myOtherPet)
      )

(pets)