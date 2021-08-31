(ns demo.core)

(defn petToHumanYears
      "gets the age of a pet"
      [x]
      (def petStore {'dog 7, 'cat 5, 'goldfish 10})
      (get petStore x) )

(defn getPetAgeInHumanYears
      "gets the age of a pet"
      [name type age]
      (def ratio (petToHumanYears type))
      (println name "is" (* ratio age) " in human years"))

(getPetAgeInHumanYears "fido" 'dog 5)
(getPetAgeInHumanYears "tiddles" 'cat 5)
(getPetAgeInHumanYears "jaffa" 'goldfish 5)